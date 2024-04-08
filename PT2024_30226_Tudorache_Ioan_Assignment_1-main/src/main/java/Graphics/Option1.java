package Graphics;


import Business_Logic.Addition;
import Business_Logic.Division;
import Business_Logic.Multiplication;
import Business_Logic.Substraction;
import Polynomial_Representation.Monomial;
import Polynomial_Representation.Polynomial;

import javax.swing.*;
import java.util.Map;

public class Option1 extends javax.swing.JFrame {

    private javax.swing.JButton jAdditionButton;
    private javax.swing.JButton jBackButton;
    private javax.swing.JLabel jCalculatorLabel;
    private javax.swing.JButton jDivisionButton;
    private javax.swing.JLabel jFirstPolynomial;
    private javax.swing.JButton jMultiplicationButton;
    private javax.swing.JButton jOptionButtonOtherOperations;
    private javax.swing.JLabel jResult;
    private javax.swing.JLabel jSecondPolynomial;
    private javax.swing.JButton jSubtractionButton;
    private javax.swing.JTextField jTextFieldFirstPolynomial;
    private javax.swing.JTextField jTextFieldResult;
    private javax.swing.JTextField jTextFieldSecondPolynomial;

    public Option1() {
        initComponents();
    }

    private void initComponents() {

        jCalculatorLabel = new javax.swing.JLabel();
        jAdditionButton = new javax.swing.JButton();
        jSubtractionButton = new javax.swing.JButton();
        jMultiplicationButton = new javax.swing.JButton();
        jDivisionButton = new javax.swing.JButton();
        jFirstPolynomial = new javax.swing.JLabel();
        jSecondPolynomial = new javax.swing.JLabel();
        jTextFieldFirstPolynomial = new javax.swing.JTextField();
        jTextFieldSecondPolynomial = new javax.swing.JTextField();
        jResult = new javax.swing.JLabel();
        jTextFieldResult = new javax.swing.JTextField();
        jOptionButtonOtherOperations = new javax.swing.JButton();
        jBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Polynomial calculator");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationRelativeTo(null);
        setResizable(false);

        jCalculatorLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCalculatorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCalculatorLabel.setText("Polynomial calculator");

        jAdditionButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jAdditionButton.setText("Addition");
        jAdditionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdditionButtonActionPerformed(evt);
            }
        });

        jSubtractionButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSubtractionButton.setText("Subtraction");
        jSubtractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubtractionButtonActionPerformed(evt);
            }
        });

        jMultiplicationButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMultiplicationButton.setText("Multiplication");
        jMultiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMultiplicationButtonActionPerformed(evt);
            }
        });

        jDivisionButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDivisionButton.setText("Division");
        jDivisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDivisionButtonActionPerformed(evt);
            }
        });

        jFirstPolynomial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFirstPolynomial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFirstPolynomial.setText("First Polynomial = ");

        jSecondPolynomial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSecondPolynomial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSecondPolynomial.setText("Second Polynomial = ");

        jTextFieldFirstPolynomial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldSecondPolynomial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jResult.setText("Result  = ");

        jTextFieldResult.setEditable(false);
        jTextFieldResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jOptionButtonOtherOperations.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jOptionButtonOtherOperations.setText("Other Operations");
        jOptionButtonOtherOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionButtonOtherOperationsActionPerformed(evt);
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
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCalculatorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jAdditionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSubtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jMultiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDivisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jFirstPolynomial, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldFirstPolynomial))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jSecondPolynomial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldSecondPolynomial)
                                                        .addComponent(jTextFieldResult, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jOptionButtonOtherOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jCalculatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jFirstPolynomial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldFirstPolynomial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jSecondPolynomial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSecondPolynomial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jResult, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jAdditionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSubtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jMultiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDivisionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jOptionButtonOtherOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
        );

        pack();
    }

    private void jAdditionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String polynomial_1 =   jTextFieldFirstPolynomial.getText();
        String polynomial_2 =   jTextFieldSecondPolynomial.getText();

        String coefficient = "([+-]?\\d*\\.?\\d+|\\d+)?";
        String variable = "[xX]?";
        String exponent = "((?<=[xX])(\\^(-?\\d+))?)?";
        String polynomialTerm = coefficient + variable + exponent;
        String regex = polynomialTerm + "(?:[+-](?!\\s*[+-]|$)" + polynomialTerm + ")*" + "(?<!\\s*[+-])";

        if(polynomial_1.isEmpty() && polynomial_2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add both polynoms");
            return;
        }

        if(polynomial_2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to the second polynom");
            return;
        }
        if(polynomial_1.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to the first polynom");
            return;
        }

        if (polynomial_2.matches(regex) && polynomial_1.matches((regex))) {

            Polynomial pol = new Polynomial();
            pol.parse(polynomial_1);

            Polynomial pol2 = new Polynomial();
            pol2.parse(polynomial_2);

            Addition ex = new Addition();
            Polynomial result = ex.add(pol,pol2);

            String output;
            output = result.toString();

            jTextFieldResult.setText(output);


        } else {
            JOptionPane.showMessageDialog(null, "String '" + "' does not match the pattern.");
        }
    }

    private void jSubtractionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String polynomial_1 =   jTextFieldFirstPolynomial.getText();
        String polynomial_2 =   jTextFieldSecondPolynomial.getText();

        String coefficient = "([+-]?\\d*\\.?\\d+|\\d+)?";
        String variable = "[xX]?";
        String exponent = "((?<=[xX])(\\^(-?\\d+))?)?";
        String polynomialTerm = coefficient + variable + exponent;
        String regex = polynomialTerm + "(?:[+-](?!\\s*[+-]|$)" + polynomialTerm + ")*" + "(?<!\\s*[+-])";

        if(polynomial_1.isEmpty() && polynomial_2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add both polynoms");
            return;
        }

        if(polynomial_2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to second polynom");
            return;
        }
        if(polynomial_1.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to first polynom");
            return;
        }


        if (polynomial_2.matches(regex) && polynomial_1.matches((regex))) {
            Polynomial pol = new Polynomial();
            pol.parse(polynomial_1);

            Polynomial pol2 = new Polynomial();
            pol2.parse(polynomial_2);

            Substraction ex = new Substraction();
            Polynomial result = ex.sub(pol,pol2);

            String output;
            output = result.toString();

            jTextFieldResult.setText(output);


        } else {
            JOptionPane.showMessageDialog(null, "String '" + "' does not match the pattern.");
        }
    }


    private void jOptionButtonOtherOperationsActionPerformed(java.awt.event.ActionEvent evt) {
        Option2 form = new Option2();
        form.setVisible(true);
        this.setVisible(false);
    }
    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ChooseOperation form = new ChooseOperation();
        form.setVisible(true);
        this.setVisible(false);
    }
    private void jDivisionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String polynomial_1 =   jTextFieldFirstPolynomial.getText();
        String polynomial_2 =   jTextFieldSecondPolynomial.getText();

        String coefficient = "([+-]?\\d*\\.?\\d+|\\d+)?";
        String variable = "[xX]?";
        String exponent = "((?<=[xX])(\\^(-?\\d+))?)?";
        String polynomialTerm = coefficient + variable + exponent;
        String regex = polynomialTerm + "(?:[+-](?!\\s*[+-]|$)" + polynomialTerm + ")*" + "(?<!\\s*[+-])";
        System.out.println(polynomial_2);

        if(polynomial_1.isEmpty() && polynomial_2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add both polynoms");
            return;
        }

        if(polynomial_2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to second polynom");
            return;
        }
        if(polynomial_1.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to first polynom");
            return;
        }


        if (polynomial_2.matches(regex) && polynomial_1.matches((regex))) {
            Polynomial pol = new Polynomial();
            pol.parse(polynomial_1);

            Polynomial pol2 = new Polynomial();
            pol2.parse(polynomial_2);

            Division ex = new Division();
            Polynomial result = ex.div(pol,pol2);

            String output;
            if(result != null){
                output = result.toString();
                jTextFieldResult.setText(output);
            }


        } else {
            JOptionPane.showMessageDialog(null, "String '" + "' does not match the pattern.");
        }
    }

    private void jMultiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String polynomial_1 =   jTextFieldFirstPolynomial.getText();
        String polynomial_2 =   jTextFieldSecondPolynomial.getText();

        String coefficient = "([+-]?\\d*\\.?\\d+|\\d+)?";
        String variable = "[xX]?";
        String exponent = "((?<=[xX])(\\^(-?\\d+))?)?";
        String polynomialTerm = coefficient + variable + exponent;
        String regex = polynomialTerm + "(?:[+-](?!\\s*[+-]|$)" + polynomialTerm + ")*" + "(?<!\\s*[+-])";

        if(polynomial_1.isEmpty() && polynomial_2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add both polynoms");
            return;
        }
        if(polynomial_2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to second polynom");
            return;
        }
        if(polynomial_1.isEmpty()){
            JOptionPane.showMessageDialog(null, "Add a number to first polynom");
            return;
        }


        if (polynomial_2.matches(regex) && polynomial_1.matches((regex))) {
            Polynomial pol = new Polynomial();
            pol.parse(polynomial_1);

            Polynomial pol2 = new Polynomial();
            pol2.parse(polynomial_2);

            Multiplication ex = new Multiplication();
            Polynomial result = ex.mul(pol,pol2);

            String output;
            output = result.toString();

            jTextFieldResult.setText(output);


        } else {
            JOptionPane.showMessageDialog(null, "String '" + "' does not match the pattern.");
        }
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Option1().setVisible(true);
            }
        });
    }

}
