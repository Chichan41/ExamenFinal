/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.controller;

/**
 *
 *
 */
import examen.examen.model.Alumno;
import examen.examen.model.Curso;

import examen.examen.model.Cursoaperturado;
import examen.examen.model.Docente;
import examen.examen.model.Fecha;
import examen.examen.model.Matricula;
import examen.examen.model.Persona;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
       
        Fecha fechaNacimiento = new Fecha(20, 02, 1989);
        Fecha fechaRegistro = new Fecha(25, 05, 2020);
        Fecha fechaTitulacion = new Fecha(25,05, 2020);
        Fecha fechaInicioCurso = new Fecha(20, 1, 2025);
        Fecha fechaPago = new Fecha(22, 1, 2025);
        
        Persona persona = new Persona("123456789", "Juan Perez", fechaNacimiento, "juan.perez@example.com");
        Persona persona1 = new Persona("35654677", "Roberto Aguilar", fechaNacimiento, "r.aguilz@example.com");
       
        Curso curso = new Curso(2230, "Programación Java", 5);

        
        Docente docente = new Docente(persona, fechaRegistro, fechaTitulacion, "1234567890");
       

        
        Cursoaperturado cursoaperturado = new Cursoaperturado(1, docente, curso, fechaInicioCurso);

      
        Alumno alumno = new Alumno(persona1,"932523323", fechaRegistro);

        
        Matricula matricula = new Matricula(cursoaperturado, alumno, true, fechaPago);

        
        System.out.println("Persona:");
        System.out.println("DNI: " + persona.getDNI());
        System.out.println("Nombres: " + persona.getNombres());
        System.out.println("Fecha de nacimiento: " + persona.getFecNac().toString());
        System.out.println("Email: " + persona.getEmail());

        System.out.println("\nAlumno:");
        System.out.println("DNI: " + alumno.getPersona().getDNI());
        System.out.println("Nombre: " + alumno.getPersona().getNombres());
        System.out.println("Fecha de nacimiento: " + alumno.getPersona().getFecNac().toString());
        System.out.println("Email: " + alumno.getPersona().getEmail());
        System.out.println("Fecha de registro: " + alumno.getFec_registro());
        System.out.println("Alumno vigente: " + alumno.isAlumno_vigente());
        System.out.println("Telefono: " + alumno.getTelefono());
        
        
        System.out.println("\nCurso:");
        System.out.println("Código: " + curso.getCod_curso());
        System.out.println("Nombre: " + curso.getNombre());
        System.out.println("Años de experiencia: " + curso.getAños_experiencia());
        System.out.println("Curso Vigente: " + curso.isCurso_vigente());
        
        System.out.println("\nDocente:");
        System.out.println("DNI: " + docente.getPersona().getDNI());
        System.out.println("Nombre: " + docente.getPersona().getNombres());
        System.out.println("Fecha de nacimiento: " + docente.getPersona().getFecNac().toString());
        System.out.println("Email: " + docente.getPersona().getEmail());
        System.out.println("Fecha de registro: " + docente.getFec_registro().toString());
        System.out.println("Fecha de titulacion: " + docente.getFec_titulacion().toString());
        System.out.println("Vigencia: " + docente.isDocente_vigente());
        System.out.println("Telefono: " + docente.getTelefono());
        
        System.out.println("\nMatricula:");
        System.out.println("DNI: " + matricula.getAlumno().getPersona().getDNI());
        System.out.println("Nombre: " + matricula.getAlumno().getPersona().getNombres());
        System.out.println("Código de curso: " + matricula.getCursoMatriculado().getCurso().getCod_curso());
        System.out.println("Nombre de curso: " + matricula.getCursoMatriculado().getCurso().getNombre());
        System.out.println("Pagado: " + matricula.isPagado());
        System.out.println("Fecha de pago: " + matricula.getFechaPago());
        
        }
    }