/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pjdev.sga.cliente;

import com.pjdev.sga.domain.Persona;
import com.pjdev.sga.servicio.PersonaServiceRemote;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Josue
 */
public class ClientePersonaServiceConIp {
    
    public static void main(String[] args) {

     System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");

            // optional. Default localhost. Aqui se cambia la IP del servidor donde esta Glassfish
            props.setProperty("org.omg.CORBA.ORBInitialHost", "192.168.0.14");

            // optional. Puerto por Default 3700. Solo se necesita cambiar si el puerto no es 3700.
            //props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            Context jndi = new InitialContext(props);
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.pjdev.sga.servicio.PersonaServiceRemote");

            List<Persona> personas = personaService.listarPersonas();

            for (Persona persona : personas) {
                System.out.println(persona);
            }
            System.out.println("\nFin llamada al EJB desde el cliente");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
