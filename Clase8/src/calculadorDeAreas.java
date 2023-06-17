import java.util.Scanner;

/*  Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
    Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
*/
public class calculadorDeAreas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿De qué fígura desea calcular su área?");
        String figura = scanner.next();
        if (figura.equalsIgnoreCase("cuadrado")){
            System.out.println("Por favor ingrese el lado");
            double lado = scanner.nextDouble();
            double areaCuadrado= calcularAreaCuadrado(lado);
            System.out.println("El área del cuadrado es: "+areaCuadrado);

        }else if (figura.equalsIgnoreCase("triángulo")){
            System.out.println("Por favor ingrese la altura");
            double altura = scanner.nextDouble();
            System.out.println("Por favor ingrese la base");
            double base = scanner.nextDouble();
            double areaTriangulo= calcularAreaTriangulo(altura,base);
            System.out.println("El área del triángulo es: "+areaTriangulo);
        }
        else {
            System.out.println("Ha escrito una figura incorrecta, por favor revise");;
        }
    }

    public static double calcularAreaCuadrado(double lado){

        return lado * lado;
    }
    public static double calcularAreaTriangulo(double altura, double base){

        return (base * altura)/2;

    }
}
