/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab9p2_salvadormacias;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Apple
 */
public class date extends Thread {
    private Date fecha;
    private SimpleDateFormat fechaActual = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat tiempoActual = new SimpleDateFormat("HH:mm:ss");
    private JLabel hora;
    private JLabel mes;

    public date(JLabel hora, JLabel mes) {
        this.hora = hora;
        this.mes = mes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public SimpleDateFormat getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(SimpleDateFormat fechaActual) {
        this.fechaActual = fechaActual;
    }

    public SimpleDateFormat getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(SimpleDateFormat tiempoActual) {
        this.tiempoActual = tiempoActual;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    public JLabel getMes() {
        return mes;
    }

    public void setMes(JLabel mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "fecha{" + "fecha=" + fecha + ", fechaActual=" + fechaActual + ", tiempoActual=" + tiempoActual + ", hora=" + hora + ", mes=" + mes + '}';
    }

    @Override
    public void run() {
        while (true) {
            fecha = new Date();
            mes.setText(fechaActual.format(fecha));
            hora.setText(tiempoActual.format(fecha));
            try {
                Thread.sleep(600);
            } catch (Exception e) {
                System.out.println("thread exploto");
            }

        }
    }
    
}
