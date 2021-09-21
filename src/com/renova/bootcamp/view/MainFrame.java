package com.renova.bootcamp.view;

import com.renova.bootcamp.view.order.OrderSearchForm;
import com.renova.bootcamp.view.order.OrderForm;
import com.renova.bootcamp.view.customer.CompanyForm;
import com.renova.bootcamp.view.customer.CustomerSearchForm;
import com.renova.bootcamp.view.customer.IndividualForm;
import com.renova.bootcamp.view.product.HardwareForm;
import com.renova.bootcamp.view.product.ManualForm;
import com.renova.bootcamp.view.product.SoftwareForm;
import com.renova.bootcamp.view.product.ProductSearchForm;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public final class MainFrame extends JFrame{
   // private String dPaneimage="/img/MEBLogo.png"; 
    private JInternalFrame[] allFrame;
    private static MainFrame mainFrame;
   
    private MainFrame(){
        initComponents();
    }
    
    public static MainFrame getInstance(){
        if(mainFrame == null)
            return mainFrame = new MainFrame();
        else
            return mainFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        JTabbPane = new javax.swing.JTabbedPane();
        productBar = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        productTable = new javax.swing.JButton();
        productFormButton = new javax.swing.JButton();
        softwareFormButton = new javax.swing.JButton();
        manuelFormButton = new javax.swing.JButton();
        orderBar = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        orderTable = new javax.swing.JButton();
        orderForm = new javax.swing.JButton();
        customerBar = new javax.swing.JToolBar();
        jPanel9 = new javax.swing.JPanel();
        companyFormButton = new javax.swing.JButton();
        customerTableButton = new javax.swing.JButton();
        individualFormButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        closeOperation = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        databaseProperties = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Renova Boot Camp Project");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JTabbPane.setBorder(null);
        JTabbPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTabbPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        productBar.setFloatable(false);
        productBar.setRollover(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        productTable.setText("<html><center>Product<br>Table<center><html>");
        productTable.setFocusable(false);
        productTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTableActionPerformed(evt);
            }
        });

        productFormButton.setText("<html><center>Add Hardware<br> Formu</center></html>");
        productFormButton.setFocusable(false);
        productFormButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productFormButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productFormButtonActionPerformed(evt);
            }
        });

        softwareFormButton.setText("<html><center>Add Software<br> Formu</center></html>");
        softwareFormButton.setFocusable(false);
        softwareFormButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        softwareFormButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        softwareFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareFormButtonActionPerformed(evt);
            }
        });

        manuelFormButton.setText("<html><center>Add Manuel<br> Formu</center></html>");
        manuelFormButton.setFocusable(false);
        manuelFormButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manuelFormButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        manuelFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuelFormButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(softwareFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manuelFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productTable)
                    .addComponent(softwareFormButton)
                    .addComponent(manuelFormButton)
                    .addComponent(productFormButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productBar.add(jPanel1);

        JTabbPane.addTab("Product", new javax.swing.ImageIcon(getClass().getResource("/img/product.png")), productBar); // NOI18N

        orderBar.setFloatable(false);
        orderBar.setRollover(true);

        orderTable.setText("<html><center>Order<br>Table</center></html>");
        orderTable.setFocusable(false);
        orderTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        orderTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        orderTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderTableActionPerformed(evt);
            }
        });

        orderForm.setText("<html><center> Add Order<br>Form</center></html>");
        orderForm.setFocusable(false);
        orderForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        orderForm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        orderForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(orderForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(orderTable, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(orderForm)
                    .addComponent(orderTable))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        orderBar.add(jPanel3);

        JTabbPane.addTab("Order", new javax.swing.ImageIcon(getClass().getResource("/img/order.png")), orderBar); // NOI18N

        customerBar.setBorder(null);
        customerBar.setFloatable(false);
        customerBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        companyFormButton.setText("<html><center>Add Company<br>Form<center><html>");
        companyFormButton.setFocusable(false);
        companyFormButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        companyFormButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        companyFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyFormButtonActionPerformed(evt);
            }
        });

        customerTableButton.setText("<html><center>Customer<br>Table<center><html>");
        customerTableButton.setFocusable(false);
        customerTableButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customerTableButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        customerTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTableButtonActionPerformed(evt);
            }
        });

        individualFormButton.setText("<html><center>Add Individual<br>Form<center><html>");
        individualFormButton.setFocusable(false);
        individualFormButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        individualFormButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        individualFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualFormButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(companyFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(individualFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(customerTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(companyFormButton)
                    .addComponent(customerTableButton)
                    .addComponent(individualFormButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customerBar.add(jPanel9);

        JTabbPane.addTab("Customer", new javax.swing.ImageIcon(getClass().getResource("/img/profile64.png")), customerBar); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbPane)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(JTabbPane, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JTabbPane.getAccessibleContext().setAccessibleName("Product");

        fileMenu.setText("File");

        closeOperation.setText("Close");
        closeOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeOperationActionPerformed(evt);
            }
        });
        fileMenu.add(closeOperation);

        jMenuBar1.add(fileMenu);

        settingsMenu.setText("Properties");
        settingsMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        databaseProperties.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        databaseProperties.setText("Database");
        databaseProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databasePropertiesActionPerformed(evt);
            }
        });
        settingsMenu.add(databaseProperties);

        jMenuBar1.add(settingsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void orderFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderFormActionPerformed
        addDesktopPane(OrderForm.getInstance());
    }//GEN-LAST:event_orderFormActionPerformed
    private void orderTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderTableActionPerformed
        addDesktopPane(OrderSearchForm.getInstance());
    }//GEN-LAST:event_orderTableActionPerformed
    private void databasePropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databasePropertiesActionPerformed

    }//GEN-LAST:event_databasePropertiesActionPerformed

    private void closeOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeOperationActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeOperationActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    private void companyFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyFormButtonActionPerformed
        addDesktopPane(CompanyForm.getInstance());
    }//GEN-LAST:event_companyFormButtonActionPerformed

    private void customerTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTableButtonActionPerformed
        addDesktopPane(CustomerSearchForm.getInstance());
    }//GEN-LAST:event_customerTableButtonActionPerformed

    private void productFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productFormButtonActionPerformed
       addDesktopPane(HardwareForm.getInstance());
    }//GEN-LAST:event_productFormButtonActionPerformed

    private void productTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTableActionPerformed
       addDesktopPane(ProductSearchForm.getInstance());
    }//GEN-LAST:event_productTableActionPerformed

    private void softwareFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareFormButtonActionPerformed
        addDesktopPane(SoftwareForm.getInstance());
    }//GEN-LAST:event_softwareFormButtonActionPerformed

    private void manuelFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuelFormButtonActionPerformed
        addDesktopPane(ManualForm.getInstance());
    }//GEN-LAST:event_manuelFormButtonActionPerformed

    private void individualFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_individualFormButtonActionPerformed
        addDesktopPane(IndividualForm.getInstance());
    }//GEN-LAST:event_individualFormButtonActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbPane;
    private javax.swing.JMenuItem closeOperation;
    private javax.swing.JButton companyFormButton;
    private javax.swing.JToolBar customerBar;
    private javax.swing.JButton customerTableButton;
    private javax.swing.JMenuItem databaseProperties;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton individualFormButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton manuelFormButton;
    private javax.swing.JToolBar orderBar;
    private javax.swing.JButton orderForm;
    private javax.swing.JButton orderTable;
    private javax.swing.JToolBar productBar;
    private javax.swing.JButton productFormButton;
    private javax.swing.JButton productTable;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JButton softwareFormButton;
    // End of variables declaration//GEN-END:variables
        
    public void addDesktopPane(JInternalFrame jInternalFrame){
        allFrame = desktopPane.getAllFrames();
        if(!Arrays.asList(allFrame).contains(jInternalFrame)){
            desktopPane.add(jInternalFrame);
        }else{
            try{
                jInternalFrame.setSelected(true);
            }catch (PropertyVetoException ex){
                JOptionPane.showMessageDialog( null,ex.getMessage(), "JInternalFrame Error", JOptionPane.ERROR_MESSAGE );
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jInternalFrame.setVisible(true);
    }
     
}