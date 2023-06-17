package com.example.demoo.Controller;

import org.springframework.web.bind.annotation.*;
            /*Usando las herramientas conocidas*/
@RestController
public class Ejercicios {

    //Encontrar usuario
    @GetMapping("/buscar-usuario/{usuario}")
    public String getUsuario(@PathVariable String usuario){
        String[] usuarios = {"Andy","Lucas desencantado", "Yazmani"};
        for( String user:usuarios){
            System.out.println(user);
        }

        return  "Usuario buscado";
    }
                //Crear usuario
    @GetMapping("/crear-usuario/{usuario}")
    public String crearUsuario(@PathVariable String usuario){
        String[] usuarios = {usuario, "Andy","Lucas desencantado", "Yazmani"};
        for( String user:usuarios){
            System.out.println(user);
        }
        return  "Usuario creado";

    }
                //Borrar usuario
    @GetMapping("/borrar-usuario/{usuario}")
    public String deleteUsuario(@PathVariable String usuario) {
        String[] usuarios = {usuario, "Andy", "Lucas desencantado", "Yazmani"};
        for (int i = 0; i < usuarios.length; i++) {
            if (usuario.equalsIgnoreCase(usuarios[i])) {
                usuarios[i] = "";
            }
        }
        for( String user:usuarios){
            System.out.println(user);
}
        return "Has borrado al usuario";

    }

}
