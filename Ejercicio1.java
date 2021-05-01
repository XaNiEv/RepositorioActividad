import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        
//si el numero esta entre 1 y 20 me lo duplica, si esta entre 21 y 40 me muestra la mitad, para los demas me los triplica
Scanner enter=new Scanner(System.in);
System.out.println("Digite un numero:");
int num=enter.nextInt();


if(num>=1 && num<20){
    System.out.println("El doble de" + num+ "es:"+(num*2));
}
else if (num>=21 && num<=40){
    System.out.println("La mitad de" + num+"es:"+(num/2));
}
else{
   System.out.println("El triple de" +num+ "es:"+(num*3));
}
enter.close();
}  
}
