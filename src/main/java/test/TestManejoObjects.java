package test;

import datos.PersonaDAO;
import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
import java.util.*;

public class TestManejoObjects {

    public static void main(String[] args) {

// Objeto de Tipo Persona
        //Se crea o instancia un objeto de la Clase PersonaDAO
//        PersonaDAO personaDAO = new PersonaDAO();
        //Se llama al metodo listarDatos y se guarda la informacion en una lista de tipo Persona
//        List<Persona> personas = personaDAO.listarDatos();
////
////        //forEach normal
//////        for (Persona persona : personas) {
//////            
//////            System.out.println("persona = " + persona);
//////
//////        }
//        //Funcion Lamda
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
        //Se crea un objeto de tipo persona
//        Persona persona1 = new Persona("Rapahel", "Soria", "raphael@gmail.com", "3004255963");
//
//        personaDAO.insertarDatos(persona1);
//
//        List<Persona> personas = personaDAO.listarDatos();
//
//        for (Persona persona : personas) {
//
//            System.out.println("persona = " + persona);
//
//        }
//Objeto de tipo Usuario
//Se crea o instancia un objeto de la Clase UsuarioDAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        //Se llama al metodo listarDatos y se guarda la informacion en una lista de tipo Usuario
//        List<Usuario> usuarios = usuarioDAO.listarDatos();
//////
//////        //forEach normal
////////        for (Persona persona : personas) {
////////            
////////            System.out.println("persona = " + persona);
////////
////////        }
//        //Funcion Lamda
//        usuarios.forEach(usuario -> {
//            System.out.println("usuario = " + usuario);
//        });

        //Se crea un objeto de tipo persona
        Usuario user = new Usuario("jeyson", "Lafacil88");

        usuarioDAO.insertarDatos(user);

        List<Usuario> usuarios = usuarioDAO.listarDatos();

        for (Usuario usuario : usuarios) {

            System.out.println("Usuario = " + usuario);

        }

    }

}
