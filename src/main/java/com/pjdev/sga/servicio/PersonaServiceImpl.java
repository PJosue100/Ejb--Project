/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pjdev.sga.servicio;

import com.pjdev.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Josue
 */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote,PersonaService{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas= new ArrayList<Persona>();
        personas.add(new Persona(0, "Juan", "Perez", "Suarez", "@gmail.com", "32329093"));
        personas.add(new Persona(0, "Marta", "Suarez", "Pepepe", "@ejemplo.com", "42297843"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
