package Main;

import Polynomial_Representation.*;
import Graphics.*;
import javax.swing.JFrame;


public class Main {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseOperation().setVisible(true);
            }
        });
    }
}
