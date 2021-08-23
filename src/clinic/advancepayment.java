/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author amnassar
 */
public final class advancepayment extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
       Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
     String curr=null;
     String end=null;
    int day;
   int month;
    int year;
    public advancepayment() {
        initComponents();
        con=DBConnect.connect();
     Calendar cal = new GregorianCalendar();
                 day = cal.get(Calendar.DAY_OF_MONTH);
                 month=cal.get(Calendar.MONTH)+1;
                 year = cal.get(Calendar.YEAR);
               date.setText(year+":"+month+":"+day);
               curr=year+":"+month+":"+1;
               end=year+":"+month+":"+31;
               System.out.print(curr+"   "+ end);
               
        tablelord();
        clear();
        name();
        comboxfromcombo();
        serial();
        
            TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
JLabel headerLabel = (JLabel) rendererFromHeader;
headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tdetails.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        //UPDATE mrahmed.advanceamount SET remaining=(select employee.salary from employee where employee.serial=advanceamount.serial) WHERE advanceamount.serial='EM1003';   
        int dayy = cal.get(Calendar.DAY_OF_MONTH);
        if(dayy >4)
        {
         delete.setEnabled(true);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        cmserial = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmname = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        advanceamount = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel10.setPreferredSize(new java.awt.Dimension(964, 690));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tdetails.setBackground(new java.awt.Color(138, 203, 195));
        tdetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Serial", "Employee", "Advane", "Remaining", "Date"
            }
        ));
        tdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails.setRowHeight(25);
        tdetails.setRowMargin(2);
        tdetails.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdetails);
        if (tdetails.getColumnModel().getColumnCount() > 0) {
            tdetails.getColumnModel().getColumn(0).setMinWidth(100);
            tdetails.getColumnModel().getColumn(0).setPreferredWidth(100);
            tdetails.getColumnModel().getColumn(0).setMaxWidth(100);
            tdetails.getColumnModel().getColumn(2).setMinWidth(80);
            tdetails.getColumnModel().getColumn(2).setPreferredWidth(80);
            tdetails.getColumnModel().getColumn(2).setMaxWidth(80);
            tdetails.getColumnModel().getColumn(3).setMinWidth(100);
            tdetails.getColumnModel().getColumn(3).setPreferredWidth(100);
            tdetails.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 920, 280));

        cmserial.setEditable(true);
        cmserial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmserial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmserialMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmserialMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmserialMouseReleased(evt);
            }
        });
        jPanel10.add(cmserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 230, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Serial");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 160, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Employee name");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, -1));

        cmname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmname.setEnabled(false);
        cmname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmnameMouseReleased(evt);
            }
        });
        jPanel10.add(cmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 280, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Advance");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        advanceamount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(advanceamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 90, 30));

        amount.setEditable(false);
        amount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 90, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Remaining");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        delete.setBackground(new java.awt.Color(138, 203, 195));
        delete.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        delete.setText("Save");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel10.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 180, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 660));

        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date.setText("jLabel1");
        jPanel10.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        int selectrowindex=tdetails.getSelectedRow();
    
  
    }//GEN-LAST:event_tdetailsMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
int x = Integer.parseInt(advanceamount.getText());
int y = Integer.parseInt(amount.getText());
String amount = advanceamount.getText();
  String name = cmname.getSelectedItem().toString();
    String serial = cmserial.getSelectedItem().toString();

    
    if(y>x)
    {
            try{
                String sql = "SELECT MIN(remaining) as remaining FROM clinic.advanceamount where serial='"+serial+"' AND date between '"+curr+"' AND '"+end+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                  if(rs.getString("remaining") != null && rs.getString("remaining").trim().length() > 0){
                   int remain = Integer.parseInt(rs.getString("remaining"));
                 int remaining = remain - x;
                  String sql111 = "INSERT INTO clinic.advanceamount (name,serial,amount,remaining,date) VALUES "
                          + " ('"+name+"','"+serial+"','"+amount+"','"+remaining+"','"+date.getText()+"')";
                        pst = (PreparedStatement)con.prepareStatement(sql111);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Add Successfully");
                        clear();
                        tablelord();
                  }
                 else
             {
                 String sqll = "SELECT salary FROM clinic.employee where serial='"+serial+"'";
             pst=(PreparedStatement) con.prepareStatement(sqll);
             rs=pst.executeQuery();
             if(rs.next()){
                 int remianing = Integer.parseInt(rs.getString("salary"));
                 int remain = remianing-x;
                  String sql1 = "INSERT INTO clinic.advanceamount (name,serial,amount,remaining,date) VALUES "
                          + " ('"+name+"','"+serial+"',"+amount+","+remain+",'"+date.getText()+"')";
                        pst = (PreparedStatement)con.prepareStatement(sql1);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Added Successfully");
                        tablelord();
                        clear();
               }
                 
                 
             }
         
             }
            
                
            }
            catch(Exception e )
            {
                JOptionPane.showMessageDialog(null, e);
            }
    }
    else
    {
        JOptionPane.showMessageDialog(advanceamount, "Advanced Payment More than Remaining");
    }
            
       // }
    }//GEN-LAST:event_deleteActionPerformed

    private void cmserialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmserialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmserialMouseEntered

    private void cmserialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmserialMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmserialMousePressed

    private void cmserialMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmserialMouseReleased

    }//GEN-LAST:event_cmserialMouseReleased

    private void cmnameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmnameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmnameMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField advanceamount;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox cmname;
    private javax.swing.JComboBox cmserial;
    private javax.swing.JLabel date;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    // End of variables declaration//GEN-END:variables

   public void tablelord()
    {
        try {
            String sqll = "SELECT serial,name,amount,remaining,date FROM clinic.advanceamount  ORDER BY serial ASC,\n" +
"    remaining DESC;";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int k = 1;
                while (rs.next())
                {
                    Object row[] = {
                        rs.getString("serial"),
                        rs.getString("name"),
                        rs.getString("amount"),
                        rs.getString("remaining"),
                        rs.getString("date"),
                      
                         
                       
                       
                                };
                    model.addRow(row);
                         k++;
                }
                for(int z = k ;z<11;z++)
                {
                 Object rowData[] = {
                       "", "", "","","",
                       };
                model.addRow(rowData);
                }
        
        }
        catch (SQLException ex) {
            
        }
    }
     public void clear()
 {
 advanceamount.setText("");
 amount.setText("");
 cmname.setSelectedIndex(0);
 cmserial.setSelectedIndex(0);
 serialid.setText("");
 }
   public void comboxfromcombo()
      {
        
          
                   cmserial.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();

                Object item = event.getItem();
                     try {
             String sql="SELECT name  FROM clinic.employee where serial='"+cmserial.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 cmname.setSelectedItem(rs.getString("name"));

                if (event.getStateChange() == ItemEvent.SELECTED) {
                    cmname.setSelectedItem(rs.getString("name"));
              
                }

                if (event.getStateChange() == ItemEvent.DESELECTED) {
                    
                }
  
             }
            

         } catch (SQLException ex) {
             
         }
           
                 try {
             String sql="SELECT MIN(remaining)as remaining  FROM clinic.advanceamount where serial='"+cmserial.getSelectedItem().toString()+"' and date between '"+curr+"' AND '"+end+"'";
               pst=(PreparedStatement) con.prepareStatement(sql);
               rs=pst.executeQuery();
               if(rs.next()){
                   if(rs.getString("remaining") != null && rs.getString("remaining").trim().length() > 0){
                       amount.setText(rs.getString("remaining"));
                   
                        if (event.getStateChange() == ItemEvent.SELECTED) {
                            amount.setText(rs.getString("remaining"));

                        }

                        if (event.getStateChange() == ItemEvent.DESELECTED) {

                        }
                   }
                   else{
                        String sql9="SELECT salary  FROM clinic.employee where serial='"+cmserial.getSelectedItem().toString()+"'";
               pst=(PreparedStatement) con.prepareStatement(sql9);
               rs=pst.executeQuery();
                   if(rs.next()){
                        amount.setText(rs.getString("salary"));
                   
                        if (event.getStateChange() == ItemEvent.SELECTED) {
                            amount.setText(rs.getString("salary"));

                        }

                        if (event.getStateChange() == ItemEvent.DESELECTED) {

                        }
                   }
                   }
               }
                } catch (SQLException ex) {
             
         }
              
         }
        });
       
      }
       
     public void serial()
   {
        try {
             String sql="SELECT serial  FROM clinic.employee order by CONVERT(replace(serial,'EM',''),UNSIGNED INTEGER) ASC ";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String namee = rs.getString("serial");
                
                cmserial.addItem(namee);
  
             }

         } catch (SQLException ex) {
             
         }
   }
     public void name()
   {
        try {
             String sql="SELECT name  FROM clinic.employee ";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String namee = rs.getString("name");
                
                cmname.addItem(namee);
  
             }

         } catch (SQLException ex) {
             
         }
   }

              
         

       
      
}
