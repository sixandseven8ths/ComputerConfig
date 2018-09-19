/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lakeareatech.cis238.config;

/**
 *
 * @author SiXandSeven8ths
 */
public class CompConfig extends javax.swing.JFrame {

    /**
     * Creates new form CompConfig
     */
    public CompConfig() {
        initComponents();
        this.rad22Button.setSelected(true);
        this.rad1GB.setSelected(true);
        this.rad250HDD.setSelected(true);
        this.radHome.setSelected(true);
        this.lblPrice.setText("500");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpCPU = new javax.swing.ButtonGroup();
        btngrpMemory = new javax.swing.ButtonGroup();
        btngrpHDD = new javax.swing.ButtonGroup();
        btngrpOS = new javax.swing.ButtonGroup();
        panelCPU = new javax.swing.JPanel();
        lblCPU = new javax.swing.JLabel();
        rad22Button = new javax.swing.JRadioButton();
        rad24Button = new javax.swing.JRadioButton();
        rad26Button = new javax.swing.JRadioButton();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        panelMemory = new javax.swing.JPanel();
        lblMemory = new javax.swing.JLabel();
        rad1GB = new javax.swing.JRadioButton();
        rad2GB = new javax.swing.JRadioButton();
        rad4GB = new javax.swing.JRadioButton();
        rad8GB = new javax.swing.JRadioButton();
        panelHDD = new javax.swing.JPanel();
        lblHDD = new javax.swing.JLabel();
        rad250HDD = new javax.swing.JRadioButton();
        rad500HDD = new javax.swing.JRadioButton();
        rad750HDD = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        panelOS = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        radHome = new javax.swing.JRadioButton();
        radProfessional = new javax.swing.JRadioButton();
        panelAdditional = new javax.swing.JPanel();
        lblAdditional = new javax.swing.JLabel();
        chkOffice = new javax.swing.JCheckBox();
        chkQuickBooks = new javax.swing.JCheckBox();
        chkPhotoshop = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCPU.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCPU.setBackground(new java.awt.Color(153, 153, 153));
        lblCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCPU.setText("Select CPU");
        lblCPU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblCPU.setOpaque(true);

        btngrpCPU.add(rad22Button);
        rad22Button.setText("i5 2.2GHz (included)");
        rad22Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rad22Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad22ButtonActionPerformed(evt);
            }
        });

        btngrpCPU.add(rad24Button);
        rad24Button.setText("i5 2.4GHz (+$50.00)");
        rad24Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rad24Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad24ButtonActionPerformed(evt);
            }
        });

        btngrpCPU.add(rad26Button);
        rad26Button.setText("i5 2.6GHz (+$150.00)");
        rad26Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rad26Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad26ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCPULayout = new javax.swing.GroupLayout(panelCPU);
        panelCPU.setLayout(panelCPULayout);
        panelCPULayout.setHorizontalGroup(
            panelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCPU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCPULayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rad22Button)
                .addGap(18, 18, 18)
                .addComponent(rad24Button)
                .addGap(18, 18, 18)
                .addComponent(rad26Button)
                .addGap(52, 52, 52))
        );
        panelCPULayout.setVerticalGroup(
            panelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCPULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCPU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad22Button)
                    .addComponent(rad24Button)
                    .addComponent(rad26Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCalculate.setMnemonic('p');
        btnCalculate.setText("Calculate Price");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnClear.setMnemonic('c');
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setMnemonic('x');
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        panelMemory.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMemory.setBackground(new java.awt.Color(153, 153, 153));
        lblMemory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemory.setText("Select the amount of RAM (memory) you want");
        lblMemory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblMemory.setOpaque(true);

        btngrpMemory.add(rad1GB);
        rad1GB.setText("1 GB (included)");
        rad1GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad1GBActionPerformed(evt);
            }
        });

        btngrpMemory.add(rad2GB);
        rad2GB.setText("2 GB (+$50.00)");
        rad2GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad2GBActionPerformed(evt);
            }
        });

        btngrpMemory.add(rad4GB);
        rad4GB.setText("4 GB (+$100.00)");
        rad4GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad4GBActionPerformed(evt);
            }
        });

        btngrpMemory.add(rad8GB);
        rad8GB.setText("8 GB (+$150.00)");
        rad8GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad8GBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMemoryLayout = new javax.swing.GroupLayout(panelMemory);
        panelMemory.setLayout(panelMemoryLayout);
        panelMemoryLayout.setHorizontalGroup(
            panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMemoryLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rad1GB)
                .addGap(18, 18, 18)
                .addComponent(rad2GB)
                .addGap(18, 18, 18)
                .addComponent(rad4GB)
                .addGap(18, 18, 18)
                .addComponent(rad8GB)
                .addContainerGap())
        );
        panelMemoryLayout.setVerticalGroup(
            panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemoryLayout.createSequentialGroup()
                .addComponent(lblMemory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad1GB)
                    .addComponent(rad2GB)
                    .addComponent(rad4GB)
                    .addComponent(rad8GB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelHDD.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHDD.setBackground(new java.awt.Color(153, 153, 153));
        lblHDD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHDD.setText("Select the size of Hard Disk Drive (HDD) that you want");
        lblHDD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblHDD.setOpaque(true);

        btngrpHDD.add(rad250HDD);
        rad250HDD.setText("250 GB (included)");
        rad250HDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad250HDDActionPerformed(evt);
            }
        });

        btngrpHDD.add(rad500HDD);
        rad500HDD.setText("500 GB (+50.00)");
        rad500HDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad500HDDActionPerformed(evt);
            }
        });

        btngrpHDD.add(rad750HDD);
        rad750HDD.setText("750 GB (+150.00)");
        rad750HDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad750HDDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHDDLayout = new javax.swing.GroupLayout(panelHDD);
        panelHDD.setLayout(panelHDDLayout);
        panelHDDLayout.setHorizontalGroup(
            panelHDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelHDDLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(rad250HDD)
                .addGap(18, 18, 18)
                .addComponent(rad500HDD)
                .addGap(18, 18, 18)
                .addComponent(rad750HDD)
                .addContainerGap())
        );
        panelHDDLayout.setVerticalGroup(
            panelHDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHDDLayout.createSequentialGroup()
                .addComponent(lblHDD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad250HDD)
                    .addComponent(rad500HDD)
                    .addComponent(rad750HDD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Price:");

        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPrice.setText("0");
        lblPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        panelOS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelOS.setPreferredSize(new java.awt.Dimension(430, 57));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select your Operating System (OS)");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel2.setOpaque(true);

        btngrpOS.add(radHome);
        radHome.setText("Windows 7 Home Edition (included)");
        radHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radHomeActionPerformed(evt);
            }
        });

        btngrpOS.add(radProfessional);
        radProfessional.setText("Windows 7 Professional (+$100.00)");
        radProfessional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radProfessionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOSLayout = new javax.swing.GroupLayout(panelOS);
        panelOS.setLayout(panelOSLayout);
        panelOSLayout.setHorizontalGroup(
            panelOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radHome)
                .addGap(18, 18, 18)
                .addComponent(radProfessional)
                .addGap(48, 48, 48))
        );
        panelOSLayout.setVerticalGroup(
            panelOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOSLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radHome)
                    .addComponent(radProfessional))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAdditional.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAdditional.setBackground(new java.awt.Color(153, 153, 153));
        lblAdditional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdditional.setText("Select any Additional Software");
        lblAdditional.setOpaque(true);

        chkOffice.setText("Microsoft Office (+$400.00)");
        chkOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOfficeActionPerformed(evt);
            }
        });

        chkQuickBooks.setText("Quick Books Pro (+$200.00)");
        chkQuickBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkQuickBooksActionPerformed(evt);
            }
        });

        chkPhotoshop.setText("Photoshop (+$600.00)");
        chkPhotoshop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPhotoshopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdditionalLayout = new javax.swing.GroupLayout(panelAdditional);
        panelAdditional.setLayout(panelAdditionalLayout);
        panelAdditionalLayout.setHorizontalGroup(
            panelAdditionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdditional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelAdditionalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkOffice)
                .addGap(18, 18, 18)
                .addComponent(chkQuickBooks)
                .addGap(18, 18, 18)
                .addComponent(chkPhotoshop)
                .addContainerGap())
        );
        panelAdditionalLayout.setVerticalGroup(
            panelAdditionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdditionalLayout.createSequentialGroup()
                .addComponent(lblAdditional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdditionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkOffice)
                    .addComponent(chkQuickBooks)
                    .addComponent(chkPhotoshop))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelHDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelOS, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCalculate)))
                .addContainerGap())
            .addComponent(panelAdditional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelAdditional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear)
                        .addComponent(btnExit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCalculate)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblPrice))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Reset the calculator
        // Set to the default selections
        this.rad22Button.setSelected(true);
        this.rad1GB.setSelected(true);
        this.rad250HDD.setSelected(true);
        this.radHome.setSelected(true);
        
        
        // Clear the checkboxes
        this.chkOffice.setSelected(false);
        this.chkPhotoshop.setSelected(false);
        this.chkQuickBooks.setSelected(false);
        
        // Reset price to zero
        resetPrice();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit the app
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void chkOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOfficeActionPerformed
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_chkOfficeActionPerformed

    private void chkQuickBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkQuickBooksActionPerformed
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_chkQuickBooksActionPerformed

    private void chkPhotoshopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPhotoshopActionPerformed
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_chkPhotoshopActionPerformed

    private void rad22ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad22ButtonActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad22ButtonActionPerformed

    private void rad24ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad24ButtonActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad24ButtonActionPerformed

    private void rad26ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad26ButtonActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad26ButtonActionPerformed

    private void rad1GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad1GBActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad1GBActionPerformed

    private void rad2GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad2GBActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad2GBActionPerformed

    private void rad4GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad4GBActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad4GBActionPerformed

    private void rad8GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad8GBActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad8GBActionPerformed

    private void rad250HDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad250HDDActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad250HDDActionPerformed

    private void rad500HDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad500HDDActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad500HDDActionPerformed

    private void rad750HDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad750HDDActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_rad750HDDActionPerformed

    private void radHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radHomeActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_radHomeActionPerformed

    private void radProfessionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radProfessionalActionPerformed
        // reset price to zero
        resetPrice();
        
        // call calc button
        this.btnCalculate.doClick();
    }//GEN-LAST:event_radProfessionalActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        //calculate price
        this.lblPrice.setText(String.valueOf(getCPUPrice(this.rad22Button.isSelected(),
                                            this.rad24Button.isSelected(), 
                                            this.rad26Button.isSelected()) + 
                                            (getMemoryPrice(this.rad1GB.isSelected(), 
                                            this.rad2GB.isSelected(), 
                                            this.rad4GB.isSelected(),
                                            this.rad8GB.isSelected())) +
                                            (getOSPrice(this.radHome.isSelected(), 
                                            this.radProfessional.isSelected())) +
                                            (getHDDPrice(this.rad250HDD.isSelected(), 
                                            this.rad500HDD.isSelected(), 
                                            this.rad750HDD.isSelected()))
                                            + getAddonPrice()));
    }//GEN-LAST:event_btnCalculateActionPerformed

    private double getCPUPrice(boolean twotwo, boolean twofour, boolean twosix)
    {
        //initialize variable
        double dblPrice = 0;
        
        //if statements go here
        if (twotwo)
        {
            dblPrice += 500.00;
        }
        else if (twofour)
        {
            dblPrice += 550.00;
        }
        else if (twosix)
        {
            dblPrice += 700.00;
        }
        
        //return price
        return dblPrice;
    }
    
    private double getMemoryPrice(boolean onegig, boolean twogigs, boolean fourgigs, boolean eightgigs)
    {
        //initialize variable
        double dblPrice = 0;
        
        //if statements go here
        if (onegig)
        {
            dblPrice += 0;
        }
        else if (twogigs)
        {
            dblPrice += 50.00;
        }
        else if (fourgigs)
        {
            dblPrice += 100.00;
        }
        else if (eightgigs)
        {
            dblPrice += 150.00;
        }
        
        //return price
        return dblPrice;
    }
    
    private double getHDDPrice(boolean first, boolean second, boolean third)
    {
        //initialize variable
        double dblPrice = 0;
        
        //if statements go here
        if (first)
        {
            dblPrice += 0;
        }
        else if (second)
        {
            dblPrice += 50.00;
        }
        else if (third)
        {
            dblPrice += 150.00;
        }
        
        //return price
        return dblPrice;
    }
    
    private double getOSPrice(boolean home, boolean professional)
    {
        //initialize variable
        double dblPrice = 0;
        
        //if statements go here
        if (home)
        {
            dblPrice += 0;
        }
        else if (professional)
        {
            dblPrice += 100;
        }
        
        //return price
        return dblPrice;
    }
    
    private double getAddonPrice()
        {
            //initialize variable
            double dblPrice = 0;
            
            //if statements go here
            if (this.chkOffice.isSelected())
            {
                dblPrice += 400.00;
            }
            if (this.chkQuickBooks.isSelected())
            {
                dblPrice += 200.00;
            }
            if (chkPhotoshop.isSelected())
            {
                dblPrice += 600.00;
            }
            
            //return pride
            return dblPrice;
        }

            
    private void resetPrice()
        {
            // load label with "0"
            this.lblPrice.setText("500");
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompConfig().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btngrpCPU;
    private javax.swing.ButtonGroup btngrpHDD;
    private javax.swing.ButtonGroup btngrpMemory;
    private javax.swing.ButtonGroup btngrpOS;
    private javax.swing.JCheckBox chkOffice;
    private javax.swing.JCheckBox chkPhotoshop;
    private javax.swing.JCheckBox chkQuickBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAdditional;
    private javax.swing.JLabel lblCPU;
    private javax.swing.JLabel lblHDD;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JPanel panelAdditional;
    private javax.swing.JPanel panelCPU;
    private javax.swing.JPanel panelHDD;
    private javax.swing.JPanel panelMemory;
    private javax.swing.JPanel panelOS;
    private javax.swing.JRadioButton rad1GB;
    private javax.swing.JRadioButton rad22Button;
    private javax.swing.JRadioButton rad24Button;
    private javax.swing.JRadioButton rad250HDD;
    private javax.swing.JRadioButton rad26Button;
    private javax.swing.JRadioButton rad2GB;
    private javax.swing.JRadioButton rad4GB;
    private javax.swing.JRadioButton rad500HDD;
    private javax.swing.JRadioButton rad750HDD;
    private javax.swing.JRadioButton rad8GB;
    private javax.swing.JRadioButton radHome;
    private javax.swing.JRadioButton radProfessional;
    // End of variables declaration//GEN-END:variables
}
