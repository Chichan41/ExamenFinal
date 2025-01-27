/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.model;

/**
 *
 * 
 */
public class Docente {
    private Fecha fec_registro; // fecha de registro
    private Fecha fec_titulacion; // fecha en que obtuvo su titulo profesional
    private boolean docente_vigente; // true // inicialmente activo
    private String telefono; // nro telefonico
    private Persona persona;

   
    public Docente(Persona persona,Fecha fec_registro,Fecha fec_titulacion,String telefono) {
        this.persona = persona;
        this.telefono = telefono;
        this.fec_registro = fec_registro;
        this.fec_titulacion= fec_titulacion;
        this.docente_vigente = true;
    }

    public Docente(Persona persona) {
        this.persona = persona;
        this.fec_registro = new Fecha();
        this.docente_vigente = true;
    }

    public Fecha getFec_registro() {
        return fec_registro;
    }

    public Fecha getFec_titulacion() {
        return fec_titulacion;
    }

    public boolean isDocente_vigente() {
        return docente_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setFec_registro(Fecha fec_registro) {
        this.fec_registro = fec_registro;
    }

    public void setFec_titulacion(Fecha fec_titulacion) {
        this.fec_titulacion = fec_titulacion;
    }

    public void setDocente_vigente(boolean docente_vigente) {
        this.docente_vigente = docente_vigente;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    
    public int getAntiguedad() {
        
        return 0; 
    }

    public int getTiempoExperiencia() {
     
        return 0; 
    }

    @Override
    public String toString() {
        return "Docente{" + "fec_registro=" + fec_registro + ", fec_titulacion=" + fec_titulacion + ", docente_vigente=" + docente_vigente + ", telefono=" + telefono + ", persona=" + persona + '}';
    }

    
}
