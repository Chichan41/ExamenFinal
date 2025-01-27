/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.model;

/**
 *
 * 
 */
public class Persona {
    private String DNI;
    private String nombres;
    private Fecha fec_nac;
    private String email;

    
    public Persona(String DNI, String nombres) {
        this.DNI = DNI;
        this.nombres = nombres;
    }

   
    public Persona(String DNI, String nombres, Fecha fec_nac, String email) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.fec_nac = fec_nac;
        this.email = email;
    }

   public String getDNI() {
        return DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public Fecha getFecNac() {
        return fec_nac;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return 18 ;
      
}
    

    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setFecNac(Fecha fec_nac) {
        this.fec_nac = fec_nac;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
