/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import models.Movie;

/**
 *
 * @author lenovo gaming3
 */
public class Home_Screen extends JFrame implements ActionListener {

    /**
     * Creates new form Home_Screen
     */
    public Home_Screen() {
        initComponents();
        this.setTitle("Home Screen");
        this.setSize(600, 800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        jComboBox1.addActionListener(this);
//        moviesPanel.setLayout(new GridBagLayout(6,2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        moviesPanel = new javax.swing.JPanel();
        hallPassBtn = new javax.swing.JButton();
        theMartionBtn = new javax.swing.JButton();
        fastNfuriosBtn = new javax.swing.JButton();
        madMaxBtn = new javax.swing.JButton();
        johnWickBtn = new javax.swing.JButton();
        realHeroBtn = new javax.swing.JButton();
        anihilationBtn = new javax.swing.JButton();
        theImitationBtn = new javax.swing.JButton();
        fridayBtn = new javax.swing.JButton();
        johnRamboBtn = new javax.swing.JButton();
        interstellarBtn = new javax.swing.JButton();
        dumpNdumperBtn = new javax.swing.JButton();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 800));

        jPanel1.setBackground(new java.awt.Color(231, 39, 52));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 87));
        jLabel2.setText("Movie Ticket Reservation");

        jPanel2.setBackground(new java.awt.Color(255, 204, 87));
        jPanel2.setPreferredSize(new java.awt.Dimension(630, 3140));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Movie Categroies:");

        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "ACTION", "COMEDY", "SCIENTIFIC" }));

        moviesPanel.setBackground(new java.awt.Color(255, 204, 87));
        moviesPanel.setLayout(new java.awt.GridBagLayout());

        hallPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/HALL PASS.jpeg"))); // NOI18N
        hallPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallPassBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        moviesPanel.add(hallPassBtn, gridBagConstraints);

        theMartionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/the martian.jpeg"))); // NOI18N
        theMartionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theMartionBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        moviesPanel.add(theMartionBtn, gridBagConstraints);

        fastNfuriosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/fast&furios.jpeg"))); // NOI18N
        fastNfuriosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastNfuriosBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        moviesPanel.add(fastNfuriosBtn, gridBagConstraints);

        madMaxBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/mad max (2).png"))); // NOI18N
        madMaxBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                madMaxBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        moviesPanel.add(madMaxBtn, gridBagConstraints);

        johnWickBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/john wick.jpeg"))); // NOI18N
        johnWickBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                johnWickBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        moviesPanel.add(johnWickBtn, gridBagConstraints);

        realHeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/real hero.jpeg"))); // NOI18N
        realHeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realHeroBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        moviesPanel.add(realHeroBtn, gridBagConstraints);

        anihilationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/anihilation game.jpeg"))); // NOI18N
        anihilationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anihilationBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        moviesPanel.add(anihilationBtn, gridBagConstraints);
        anihilationBtn.getAccessibleContext().setAccessibleName("interStallerBtn");

        theImitationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/the imitation game.jpeg"))); // NOI18N
        theImitationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theImitationBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        moviesPanel.add(theImitationBtn, gridBagConstraints);

        fridayBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/friday.jpeg"))); // NOI18N
        fridayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridayBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        moviesPanel.add(fridayBtn, gridBagConstraints);

        johnRamboBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/john rambo.jpeg"))); // NOI18N
        johnRamboBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                johnRamboBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        moviesPanel.add(johnRamboBtn, gridBagConstraints);

        interstellarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/interstealer.jpeg"))); // NOI18N
        interstellarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interstellarBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        moviesPanel.add(interstellarBtn, gridBagConstraints);
        interstellarBtn.getAccessibleContext().setAccessibleName("InterBtn ");
        interstellarBtn.getAccessibleContext().setAccessibleDescription("");

        dumpNdumperBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/dump and dumper.jpeg"))); // NOI18N
        dumpNdumperBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dumpNdumperBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        moviesPanel.add(dumpNdumperBtn, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(moviesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(moviesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1563, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel2)
                .addContainerGap(257, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1912, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void theImitationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theImitationBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\imitation game.png");
        String desc= "A historical drama based on the life of British mathematician and cryptanalyst Alan Turing. Set during World War II, the film follows Turing as he leads a team at Bletchley Park to crack the German Enigma code, a breakthrough that significantly contributed to the Allied victory. The movie explores themes of intelligence, secrecy, and the personal struggles Turing faced, including his persecution for being gay in a time when it was illegal. The film stars Benedict Cumberbatch as Alan Turing and was critically acclaimed for its storytelling and performances.";
        Movie movie = new Movie("The Imitation Game", desc, "Scientific", img, 126);

        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_theImitationBtnActionPerformed

    private void interstellarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interstellarBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\interstellar.png");
        Movie movie = new Movie("interstellar", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);

    }//GEN-LAST:event_interstellarBtnActionPerformed

    private void anihilationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anihilationBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\anihilation.png");
        Movie movie = new Movie("anihilation", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_anihilationBtnActionPerformed

    private void realHeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realHeroBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\real hero.png");
        Movie movie = new Movie("realHer", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_realHeroBtnActionPerformed

    private void madMaxBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_madMaxBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\mad max.png");
        Movie movie = new Movie("madMax", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_madMaxBtnActionPerformed

    private void fridayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridayBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\friday.png");
        Movie movie = new Movie("friday", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_fridayBtnActionPerformed

    private void theMartionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theMartionBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\the martion.png");
        Movie movie = new Movie("theMartion", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_theMartionBtnActionPerformed

    private void johnWickBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_johnWickBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\john wick.png");
        Movie movie = new Movie("johnWick", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_johnWickBtnActionPerformed

    private void hallPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallPassBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\hall pass.jpeg");
        Movie movie = new Movie("hallPass", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_hallPassBtnActionPerformed

    private void johnRamboBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_johnRamboBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\john rambo.png");
        Movie movie = new Movie("johnRambo", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_johnRamboBtnActionPerformed

    private void fastNfuriosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastNfuriosBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\fastNfurois.png");
        Movie movie = new Movie("fastNfurios", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_fastNfuriosBtnActionPerformed

    private void dumpNdumperBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpNdumperBtnActionPerformed
        ImageIcon img = new ImageIcon("C:\\Users\\T-Man\\Downloads\\MovieTicketReservation_lastUpdate\\MovieTicketReservation\\src\\imgDetail\\dumpNdumper.png");
        Movie movie = new Movie("fastNfurios", "bla bla", "scientific", img, 126);
        Details details = new Details(movie);
        this.setVisible(false);
        details.setVisible(true);
    }//GEN-LAST:event_dumpNdumperBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anihilationBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dumpNdumperBtn;
    private javax.swing.JButton fastNfuriosBtn;
    private javax.swing.JButton fridayBtn;
    private javax.swing.JButton hallPassBtn;
    private javax.swing.JButton interstellarBtn;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton johnRamboBtn;
    private javax.swing.JButton johnWickBtn;
    private javax.swing.JButton madMaxBtn;
    private javax.swing.JPanel moviesPanel;
    private javax.swing.JButton realHeroBtn;
    private javax.swing.JButton theImitationBtn;
    private javax.swing.JButton theMartionBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        String category = (String) jComboBox1.getSelectedItem();
        if (e.getSource() == jComboBox1) {

            if (category.equals("ACTION")) {
                johnWickBtn.setVisible(true);
                madMaxBtn.setVisible(true);
                fastNfuriosBtn.setVisible(true);
                johnRamboBtn.setVisible(true);

                dumpNdumperBtn.setVisible(false);
                hallPassBtn.setVisible(false);
                realHeroBtn.setVisible(false);
                fridayBtn.setVisible(false);

                interstellarBtn.setVisible(false);
                anihilationBtn.setVisible(false);
                theImitationBtn.setVisible(false);
                theMartionBtn.setVisible(false);
            } else if (category.equals("COMEDY")) {
                dumpNdumperBtn.setVisible(true);
                hallPassBtn.setVisible(true);
                realHeroBtn.setVisible(true);
                fridayBtn.setVisible(true);

                johnWickBtn.setVisible(false);
                madMaxBtn.setVisible(false);
                fastNfuriosBtn.setVisible(false);
                johnRamboBtn.setVisible(false);

                interstellarBtn.setVisible(false);
                anihilationBtn.setVisible(false);
                theImitationBtn.setVisible(false);
                theMartionBtn.setVisible(false);
            } else if (category.equals("SCIENTIFIC")) {
                interstellarBtn.setVisible(true);
                anihilationBtn.setVisible(true);
                theImitationBtn.setVisible(true);
                theMartionBtn.setVisible(true);

                johnWickBtn.setVisible(false);
                madMaxBtn.setVisible(false);
                fastNfuriosBtn.setVisible(false);
                johnRamboBtn.setVisible(false);

                dumpNdumperBtn.setVisible(false);
                hallPassBtn.setVisible(false);
                realHeroBtn.setVisible(false);
                fridayBtn.setVisible(false);
            } else /*(category.equals("ALL"))*/ {
                johnWickBtn.setVisible(true);
                madMaxBtn.setVisible(true);
                fastNfuriosBtn.setVisible(true);
                johnRamboBtn.setVisible(true);

                dumpNdumperBtn.setVisible(true);
                hallPassBtn.setVisible(true);
                realHeroBtn.setVisible(true);
                fridayBtn.setVisible(true);

                dumpNdumperBtn.setVisible(true);
                hallPassBtn.setVisible(true);
                realHeroBtn.setVisible(true);
                fridayBtn.setVisible(true);
            }
        }
    }
}