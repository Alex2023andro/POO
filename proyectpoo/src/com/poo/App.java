package com.poo;

import java.util.ArrayList;
import java.util.List;

import com.poo.model.Estudiante;
import com.poo.model.Materia;

public class App {

    public static void main(String[] args) throws Exception {

        EstudianteServiceImpl iEstudianteService = new EstudianteServiceImpl();
             
        Estudiante estudiante = new Estudiante(
            "Ivan", "M", "2014-08-26",
            "CEDUK",
            "Ingenieria en sistemas",
            4,
            1001);

        List<Materia> materias = new ArrayList<Materia>();

        Materia matematicas = new Materia("Matematicas", 9.0);
        Materia espanol = new Materia("Español", 8.0);
        Materia ingles = new Materia("Inglés", 7.7);

        materias.add(matematicas);
        materias.add(espanol);
        materias.add(ingles);

        estudiante.setPromedio(iEstudianteService.promedioFinal(materias));

        System.out.println(estudiante);
    }  
    
}