import java.util.Scanner;

public class DatosTeclado {
    public static void main(String[] args) {
    Scanner enter=new Scanner(System.in);
    //INSERTAR DATOS POR CONSOLA
    //Datos de Texto
    System.out.println("Digite su nombre:");
    String nom=enter.nextLine();
    System.out.println("el dato de la variable nom es:" +nom);
    
    //Datos Enteros
    System.out.println("Digite edad:");
    int edad=enter.nextInt();
    System.out.println("El doble de la variante edad es:" +(edad*2));    
    enter.close();   
    }
    }
