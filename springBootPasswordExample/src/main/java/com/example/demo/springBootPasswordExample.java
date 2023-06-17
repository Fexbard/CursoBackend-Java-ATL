package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*Crea una aplicación en Springboot que permita generar contraseñas (utilizando el código del ejercicio anterior)
al llamar a la siguiente ruta: localhost:8080/generar-password
*/
@RestController
public class springBootPasswordExample {
    @GetMapping("/")
    public String getPassword(){
        String password = generarPassword();
        return password;


    }
    public static String generarPassword() {
        String wordSource= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String clave ="";
        for (int i = 0; i < wordSource.length(); i++) {
            int index = (int) Math.floor(Math.random()*wordSource.length());
            char caracter = wordSource.charAt(index);
            clave +=  caracter;
        }
        return "Su contraseña generada es: "+clave;



}}
