import java.util.Scanner;

public class vehiculo {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String marca, modelo, combustible;
    int cilindrada, capacidad;
    
    System.out.println("Ingrese la marca del vehículo:");
    marca = scan.nextLine();

    System.out.println("Ingrese el modelo del vehículo:");
    modelo = scan.nextLine();

    System.out.println("Ingrese el tipo de combustible del vehículo:");
    combustible = scan.nextLine();
 
    System.out.println("Ingrese la cilindrada del vehículo:");
    cilindrada = scan.nextInt();
        
    System.out.println("Ingrese la capacidad en pasajeros del vehículo:");
    capacidad = scan.nextInt();

    System.out.println("La marca que ha ingreasdo es " + marca);
    System.out.println("El modelo que ha ingresado es " + modelo);
    System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
    System.out.println("El tipo de combustible es: " + combustible);
    System.out.println("Tiene una capacidad de " + capacidad + " pasajeros");

    }
}