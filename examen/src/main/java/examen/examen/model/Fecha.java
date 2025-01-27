/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.model;

import java.util.Date;

/**
 *
 
 */
public class Fecha {
    private int dia_int;
    private int mes_int;
    private int año_int;
    private int hora;
    private int min;
    private int seq;

    
    public Fecha() {
        
        
    }

    public Fecha(int dia_int, int mes_int, int año_int) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.año_int = año_int;
    }

    public Fecha(int dia_int, int mes_int, int año_int, int hora, int min, int seg) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.año_int = año_int;
        this.hora = hora;
        this.min = min;
        this.seq = seq;
    }

   
    public Date diferenciaFecha(Fecha fecha1, Fecha fecha2) {
       
        return null;
    }
        public String toString() {
        return String.format("%02d/%02d/%04d", dia_int, mes_int, año_int);
}
        }
