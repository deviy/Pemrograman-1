    /**
     *
     * @andreassuharto
	 *Andreas Suharto Teknik Informatika
	 *4 November 2014
     */
    public class Calculator extends javax.swing.JFrame {
        public Calculator() {
            initComponents();
        }
        @SuppressWarnings("unchecked")                    
        private void initComponents() {
  
            jTextField1 = new javax.swing.JTextField();
            jTextField2 = new javax.swing.JTextField();
            jComboBox1 = new javax.swing.JComboBox();
            jButton1 = new javax.swing.JButton();
            jTextField3 = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
  
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                   jTextField1ActionPerformed(evt);
                }
            });
  
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Penjumlahan", "Pengurangan", "Perkalian", "Pembagian" }));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
               }
            });
  
            jButton1.setText("Jumlah");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
  
            jLabel1.setText("Angka ke-1");
  
            jLabel2.setText("Angka ke-2");
   
            jLabel3.setText("Hasil");
  
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(25, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jLabel3))
                    .addContainerGap(28, Short.MAX_VALUE))
            );
  
            pack();
        }
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
    double nilai1;
    double nilai2;
    double nilai3;
    String hasil;
    nilai1=Double.valueOf(jTextField1.getText());
    nilai2=Double.valueOf(jTextField2.getText());
    if (jComboBox1.getSelectedItem()=="Penjumlahan"){
    nilai3=nilai1+nilai2;
    hasil= String.valueOf(nilai3);
    jTextField3.setText(hasil);
    }
    else if (jComboBox1.getSelectedItem()=="Pengurangan"){
    nilai3=nilai1-nilai2;
    hasil= String.valueOf(nilai3);
    jTextField3.setText(hasil);
    }
    else if (jComboBox1.getSelectedItem()=="Perkalian"){
    nilai3=nilai1*nilai2;
    hasil= String.valueOf(nilai3);
    jTextField3.setText(hasil);
    }
    else {
    nilai3=nilai1/nilai2;
    hasil= String.valueOf(nilai3);
    jTextField3.setText(hasil);
    }
  
        }                                      
  
        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        }                                        
  
        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        }                                         
         public static void main(String args[]) {
            try {
              for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                      break;
                    }
                }
            } catch (ClassNotFoundException ex) {
              java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Calculator().setVisible(true);
                }
            });
        }
               
        private javax.swing.JButton jButton1;
        private javax.swing.JComboBox jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
                
    }
