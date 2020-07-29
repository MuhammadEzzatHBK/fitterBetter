package gui;
import clients.user;
import java.util.ArrayList;
import java.util.Random;

public class exercise extends javax.swing.JPanel {

    general_login f;
    user u1;
    public exercise() {
        initComponents();
    }
    public exercise(general_login f,user u) {
        initComponents();
        this.f =f ;
        u1=u;
        jLabel4.setText(u1.getFirstN());
        jLabel29.setText(String.valueOf(u1.getXp()));
        int gtype=u1.getGoalT();
        if(gtype==1)
            jLabel25.setText("Lose");
        else if(gtype==-1)
            jLabel25.setText("Gain");
        else 
            jLabel25.setText("maintain");
        loadExPlan(u1.getFoodPlan().Recommendexercises());
        
    }
    public void loadExPlan(ArrayList<String>  Ex){
        ArrayList<String> newlist=new ArrayList<String>();
        Random rand = new Random(); 
        for (int i = 0; i < 4; i++) { 
            int randomIndex = rand.nextInt(Ex.size()); 
             String[] arrOfStr = Ex.get(randomIndex).split(",", 2); 
             newlist.add(arrOfStr[0]);
             newlist.add(arrOfStr[1]);
        } 
               
        jLabel31.setText(newlist.get(0));
        jLabel32.setText(newlist.get(1));
        jLabel34.setText(newlist.get(2));
        jLabel35.setText(newlist.get(3));
        jLabel37.setText(newlist.get(4));
        jLabel38.setText(newlist.get(5));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(247, 241, 227));
        jPanel2.setForeground(new java.awt.Color(247, 241, 227));
        jPanel2.setMinimumSize(new java.awt.Dimension(681, 670));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/login_header_24.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton5.setBackground(new java.awt.Color(247, 241, 227));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/back_arrow_1.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/lamp.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        jLabel11.setText("Did  you Know??");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        jPanel4.setBackground(new java.awt.Color(247, 241, 227));

        jLabel13.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("• Exercise controls weight");

        jLabel14.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel14.setText("Exercise can help prevent excess weight gain or help maintain ");

        jLabel15.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel15.setText("weight loss");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 650, 130));

        jPanel5.setBackground(new java.awt.Color(247, 241, 227));

        jLabel16.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 102));
        jLabel16.setText("• Exercise boosts energy");

        jLabel17.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel17.setText("Exercise delivers oxygen and nutrients to your tissues and helps");

        jLabel18.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel18.setText(" your cardiovascular system work more efficiently.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(2, 2, 2)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 680, -1));

        jPanel6.setBackground(new java.awt.Color(247, 241, 227));

        jLabel19.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 153));
        jLabel19.setText("• Exercise combats diseases");

        jLabel20.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel20.setText("Regular exercise helps prevent or manage many health problems");

        jLabel21.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel21.setText("and concerns, including: Stroke, Metabolic syndrome, Falls");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(2, 2, 2)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 680, -1));

        jPanel7.setBackground(new java.awt.Color(247, 241, 227));
        jPanel7.setToolTipText("");

        jLabel22.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel22.setText("Hi");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 203, 186));

        jLabel23.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel23.setText("You have ");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel3.setText("weight Exercises");

        jLabel25.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel25.setText("LOSE");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("jLabel27");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("XP");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 440, 130));

        jPanel1.setBackground(new java.awt.Color(247, 241, 227));
        jPanel1.setForeground(new java.awt.Color(247, 241, 227));

        jLabel31.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel31.setText("Walking");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/fire.jpg"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel32.setText("255");

        jLabel33.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel33.setText("Kcal");

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/blue.png"))); // NOI18N
        jButton14.setText("OK");
        jButton14.setActionCommand("physician");
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setMaximumSize(new java.awt.Dimension(110, 40));
        jButton14.setMinimumSize(new java.awt.Dimension(110, 40));
        jButton14.setPreferredSize(new java.awt.Dimension(110, 40));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addGap(65, 65, 65)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jLabel33)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 500, -1));

        jPanel3.setBackground(new java.awt.Color(247, 241, 227));
        jPanel3.setForeground(new java.awt.Color(247, 241, 227));

        jLabel34.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel34.setText("Walking");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/fire.jpg"))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel35.setText("255");

        jLabel36.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel36.setText("Kcal");

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/blue.png"))); // NOI18N
        jButton15.setText("OK");
        jButton15.setActionCommand("physician");
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setMaximumSize(new java.awt.Dimension(110, 40));
        jButton15.setMinimumSize(new java.awt.Dimension(110, 40));
        jButton15.setPreferredSize(new java.awt.Dimension(110, 40));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addGap(65, 65, 65)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(jLabel36)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jPanel8.setBackground(new java.awt.Color(247, 241, 227));
        jPanel8.setForeground(new java.awt.Color(247, 241, 227));

        jLabel37.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel37.setText("Walking");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/fire.jpg"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel38.setText("255");

        jLabel39.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel39.setText("Kcal");

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/photos/blue.png"))); // NOI18N
        jButton16.setText("OK");
        jButton16.setActionCommand("physician");
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setMaximumSize(new java.awt.Dimension(110, 40));
        jButton16.setMinimumSize(new java.awt.Dimension(110, 40));
        jButton16.setPreferredSize(new java.awt.Dimension(110, 40));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addGap(65, 65, 65)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(jLabel39)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Member_Home m = new Member_Home(f, u1);
        f.add(m);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        u1.incXp(100);
        jLabel29.setText(String.valueOf(u1.getXp()));

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
                u1.incXp(100);
        jLabel29.setText(String.valueOf(u1.getXp()));
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
                u1.incXp(100);
        jLabel29.setText(String.valueOf(u1.getXp()));
    }//GEN-LAST:event_jButton16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
