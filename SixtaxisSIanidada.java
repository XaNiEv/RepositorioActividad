import java.util.Scanner;

public class SixtaxisSIanidada {
    public static void main(String[] args) throws Exception {
       
    
        Scanner enter=new Scanner(System.in);
        System.out.println("Digite un numero:");
        int num=enter.nextInt();

        //Si es mayor o igual a 100 tiene 3 digitos, si es menor o igual a 100 tiene 2 digitos y si es menor a 10 tiene 1 digito//
        
        if(num>=100){
        System.out.println("Tiene 3 digitos...:");
        }
        else if(num>=10){
        System.out.println("Tiene 2 digitos...:");    
        }
        else{
        System.out.println("Tiene 1 digito...:");    
        }
        enter.close();
 }
  }

 
