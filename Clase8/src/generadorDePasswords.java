import java.util.Random;

/*Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña
(por ejemplo, puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
 */
public class generadorDePasswords {
    public static void main(String[] args) {

String password = generarPassword();
        System.out.println(password);
    }

    public static String generarPassword() {
        String wordSource= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String clave ="";
   //     Random random = new Random();
        for (int i = 0; i < wordSource.length(); i++) {
            int index = (int) Math.floor(Math.random()*wordSource.length());
            char caracter = wordSource.charAt(index);
             clave +=  caracter;
    }
        return clave;
}
}