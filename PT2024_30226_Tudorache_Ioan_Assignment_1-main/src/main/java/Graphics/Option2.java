package Graphics;

import Business_Logic.Differentiation;
import Business_Logic.Integration;
import Business_Logic.Multiplication;
import Polynomial_Representation.Polynomial;

import javax.swing.*;

public class Option2 extends javax.swing.JFrame {

    private javax.swing.JButton jBackButton;
    private javax.swing.JLabel jCalculatorLabel;
    private javax.swing.JButton jDifferentiationButton;
    private javax.swing.JButton jIntegrationButton;
    private javax.swing.JButton jOtherOperationButton;
    private javax.swing.JLabel jPolynomial;
    private javax.swing.JLabel jResult;
    private javax.swing.JTextField jTextPolynomial;
    private javax.swing.JTextField jTextResult;

    public Option2() {
        initComponents();
    }

    private void initComponents() {

        jCalculatorLabel = new javax.swing.JLabel();
        jDifferentiationButton = new javax.swing.JButton();
        jIntegrationButton = new javax.swing.JButton();
        jPolynomial = new javax.swing.JLabel();
        jTextPolynomial = new javax.swing.JTextField();
        jResult = new javax.swing.JLabel();
        jTextResult = new javax.swing.JTextField();
        jOtherOperationButton = new javax.swing.JButton();
        jBackButton = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Polynomial calculator");
        setLocationRelativeTo(null);
        setResizable(false);

        jCalculatorLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCalculatorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCalculatorLabel.setText("Polynomial calculator");

        jDifferentiationButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDifferentiationButton.setText("Differentiation");
        jDifferentiationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDifferentiationButtonActionPerformed(evt);
            }
        });

        jIntegrationButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jIntegrationButton.setText("Integration");
        jIntegrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIntegrationButtonActionPerformed(evt);
            }
        });

        jPolynomial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPolynomial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPolynomial.setText("Polynomial = ");

        jTextPolynomial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPolynomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPolynomialActionPerformed(evt);
            }
        });

        jResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jResult.setText("Result  = ");

        jTextResult.setEditable(false);
        jTextResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jOtherOperationButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jOtherOperationButton.setText("Other Operation");
        jOtherOperationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOtherOperationButtonActionPerformed(evt);
            }
        });

        jBackButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBackButton.setText("Back");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCalculatorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jPolynomial, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextPolynomial)
                                                        .addComponent(jTextResult)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jDifferentiationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addComponent(jIntegrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jOtherOperationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCalculatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextPolynomial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPolynomial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextResult, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jResult, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jIntegrationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDifferentiationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jOtherOperationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
        );

        pack();
    }

    private void jDifferentiationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String polynomial_1 =   jTextPolynomial.getText();

        String coefficient = "([+-]?\\d*\\.?\\d+|\\d+)?";
        String variable = "[xX]?";
        String exponent = "((?<=[xX])(\\^(-?\\d+))?)?";
        String polynomialTerm = coefficient + variable + exponent;
        String regex = polynomialTerm + "(?:[+-](?!\\s*[+-]|$)" + polynomialTerm + ")*" + "(?<!\\s*[+-])";

        if(polynomial_1.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to first polynom");
            return;
        }
        if (polynomial_1.matches((regex))) {
            Polynomial pol = new Polynomial();
            pol.parse(polynomial_1);
            Differentiation ex = new Differentiation();
            Polynomial result = ex.dif(pol);
            String output;
            output = result.toString();
            jTextResult.setText(output);


        } else {
            JOptionPane.showMessageDialog(null, "String '" + "' does not match the pattern.");
        }
    }

    private void jIntegrationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String polynomial_1 =   jTextPolynomial.getText();

        String coefficient = "([+-]?\\d*\\.?\\d+|\\d+)?";
        String variable = "[xX]?";
        String exponent = "((?<=[xX])(\\^(-?\\d+))?)?";
        String polynomialTerm = coefficient + variable + exponent;
        String regex = polynomialTerm + "(?:[+-](?!\\s*[+-]|$)" + polynomialTerm + ")*" + "(?<!\\s*[+-])";


        if(polynomial_1.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to first polynom");
            return;
        }

        if (polynomial_1.matches((regex))) {
            Polynomial pol = new Polynomial();
            pol.parse(polynomial_1);
            Integration ex = new Integration();
            Polynomial result = ex.integ(pol);
            String output;
            output = result.toString();
            jTextResult.setText(output);


        } else {
            JOptionPane.showMessageDialog(null, "String '" + "' does not match the pattern.");
        }
    }

    private void jTextPolynomialActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jOtherOperationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Option1 form = new Option1();
        form.setVisible(true);
        this.setVisible(false);
    }

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Option1 frame = new Option1();
        frame.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Option2().setVisible(true);
            }
        });
    }

}
