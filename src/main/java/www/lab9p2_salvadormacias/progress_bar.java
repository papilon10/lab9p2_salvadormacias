/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab9p2_salvadormacias;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Apple
 */
public class progress_bar extends Thread {

    private JProgressBar progress_bar;
    private JTextArea text;
    private boolean progreso;
    private boolean flag;
    private String string;

    public progress_bar() {
    }

    public progress_bar(JProgressBar progress_bar, JTextArea text, String string) {
        this.progress_bar = progress_bar;
        this.text = text;
        this.progreso = true;
        this.flag = true;
        this.string = string;
    }

    public void setVida(boolean vive) {
        this.flag = vive;
    }

    @Override
    public void run() {
        while (flag) {
            progress_bar.setValue(progress_bar.getValue() + 1);
            if (progress_bar.getValue() == 100) {
                flag = false;
            }
            try {
                Thread.sleep(55);
            } catch (InterruptedException ex) {
            }
        }

        text.setText(string);
    }

}
