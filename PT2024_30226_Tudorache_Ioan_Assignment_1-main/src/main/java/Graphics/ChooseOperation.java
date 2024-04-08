package Graphics;


public class ChooseOperation extends javax.swing.JFrame{
    private javax.swing.JLabel jCalculatorLabel;
    private javax.swing.JLabel jInformationLabel;
    private javax.swing.JLabel jInformationOptionLabel1;
    private javax.swing.JLabel jInformationOptionLabel2;
    private javax.swing.JButton jOptionButton1;
    private javax.swing.JButton jOptionButton2;

    public ChooseOperation() {
        initComponents();
    }

    private void initComponents() {

        jCalculatorLabel = new javax.swing.JLabel();
        jOptionButton1 = new javax.swing.JButton();
        jOptionButton2 = new javax.swing.JButton();
        jInformationLabel = new javax.swing.JLabel();
        jInformationOptionLabel1 = new javax.swing.JLabel();
        jInformationOptionLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Polynomial calculator");
        setLocationRelativeTo(null);
        setResizable(false);

        jCalculatorLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCalculatorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCalculatorLabel.setText("Polynomial calculator");

        jOptionButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jOptionButton1.setText("Option 1");
        jOptionButton1.setFocusable(false);
        jOptionButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionButton1ActionPerformed(evt);
            }
        });

        jOptionButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jOptionButton2.setText("Option 2");
        jOptionButton2.setFocusable(false);
        jOptionButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionButton2ActionPerformed(evt);
            }
        });

        jInformationLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jInformationLabel.setText("Information About Buttons");

        jInformationOptionLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jInformationOptionLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jInformationOptionLabel1.setText("Option 1: addition,subtraction,multiplication,division");
        jInformationOptionLabel1.setToolTipText("");

        jInformationOptionLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jInformationOptionLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jInformationOptionLabel2.setText("Option 2: integration,differentiation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jInformationOptionLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jOptionButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jOptionButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jInformationOptionLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCalculatorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jInformationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jCalculatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jOptionButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jOptionButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jInformationOptionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jInformationOptionLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
        );

        pack();
    }

    private void jOptionButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Option1 frame = new Option1();
        frame.setVisible(true);
        this.setVisible(false);
    }

    private void jOptionButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Option2 frame = new Option2();
        frame.setVisible(true);
        this.setVisible(false);
    }
}
