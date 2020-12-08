/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class tablaEstudiante {
    
    public ArrayList<Estudiante> lista = new ArrayList<>();
    
    public void agregarEstudiante(Estudiante est){
    lista.add(est);
    }
    
}
