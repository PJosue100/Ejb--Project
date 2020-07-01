/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pjdev.sga.servicio;

import com.pjdev.sga.domain.Persona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Josue
 */
@Local
public interface PersonaService {
     public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
