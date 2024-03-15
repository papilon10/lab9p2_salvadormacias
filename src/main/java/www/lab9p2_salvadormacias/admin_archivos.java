/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab9p2_salvadormacias;

/**
 *
 * @author Apple
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class admin_archivos {

    private File archivo = null;
    private String txt = "";

    public admin_archivos() {
    }

    public admin_archivos(String filepath) {
        this.archivo = new File(filepath);
    }

    public File getFiletxt() {
        return archivo;
    }

    public void setFiletxt(File filetxt) {
        this.archivo = filetxt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public void addTofile() throws IOException {
        FileWriter fw = null;
        BufferedWriter bfw = null;

        try {
            fw = new FileWriter(archivo, false);
            bfw = new BufferedWriter(fw);

            bfw.write(txt);
            bfw.newLine();

            bfw.flush();
        } catch (IOException e) {
        }
        bfw.close();
        fw.close();

    }

    public void readFile() {
        Scanner sc = null;
        txt = "";
        try {
            if (archivo.exists()) {
                sc = new Scanner(archivo);

                while (sc.hasNextLine()) {
                    String Line = sc.nextLine();
                    txt = txt + Line + "\n";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }

    @Override
    public String toString() {
        return "adminTextFile{" + "archivo=" + archivo + ", txt=" + txt + '}';
    }

}
