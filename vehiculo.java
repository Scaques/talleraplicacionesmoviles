import java.util.Scanner;                //Importo la clase Scanner desde el paquete java.util

public class vehiculo {                  //Declaro la clase publica vehiculo

    public static void main(String arg[]) {  //Metodo principal con el codigo a correr
    Scanner scan = new Scanner(System.in);    //Creacion de objetos de las clases scanner, string e integer
    String marca, modelo, combustible;
    int cilindrada, capacidad;
    
    System.out.println("Ingrese la marca del vehiculo:"); //Imprime el mensaje para que el usuario ingrese la marca del vehiculo
    marca = scan.nextLine(); //El scanner recibe los datos introducidos por el usuario, guarda el valor en la variable marca

    System.out.println("Ingrese el modelo del vehiculo:"); //Imprime el mensaje para que el usuario ingrese el modelo del vehiculo
    modelo = scan.nextLine(); //El scanner recibe los datos introducidos por el usuario, guarda el valor en la variable modelo

    System.out.println("Ingrese el tipo de combustible del vehiculo:"); //Imprime el mensaje para que el usuario ingrese el tipo de combustible del vehiculo
    combustible = scan.nextLine(); //El scanner recibe los datos introducidos por el usuario, guarda el valor en la variable combustible
 
    System.out.println("Ingrese la cilindrada del vehiculo:"); //Imprime el mensaje para que el usuario ingrese la cilindrada del vehiculo
    cilindrada = scan.nextInt(); //El scanner recibe los datos introducidos por el usuario, guarda el valor en la variable cilindrada
        
    System.out.println("Ingrese la capacidad en pasajeros del vehiculo:"); //Imprime el mensaje para que el usuario ingrese la capacidad del vehiculo
    capacidad = scan.nextInt(); //El scanner recibe los datos introducidos por el usuario, guarda el valor en la variable mcapacidad

    System.out.println("La marca que ha ingreasdo es " + marca);  //El programa imprime en pantalla la informacion introducida por el usuario 
    System.out.println("El modelo que ha ingresado es " + modelo);
    System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
    System.out.println("El tipo de combustible es: " + combustible);
    System.out.println("Tiene una capacidad de " + capacidad + " pasajeros");

    }
}
