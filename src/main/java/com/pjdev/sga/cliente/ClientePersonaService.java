/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pjdev.sga.cliente;

import com.pjdev.sga.domain.Persona;
import com.pjdev.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Josue
 */
public class ClientePersonaService {
    public static void main(String[] args){
        System.out.println("Inicio de llamada a EJB desde el cliente\n");
        try{
            Context jndi = new  InitialContext();
            PersonaServiceRemote personaServices =
                (PersonaServiceRemote)jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.pjdev.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaServices.listarPersonas();
            
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            System.out.println("\nFin de llamada a EJB desde el cliente");
        }catch(NamingException e){
            e.printStackTrace();
        }
                
        
    }
    
}
