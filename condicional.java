import java.util.Scanner;

public class condicional {
    public static void main(String[] args) throws Exception {
    //*>, <, >=, <=, ==, !=, &&(y), ||()*//

    Scanner enter=new Scanner(System.in);
    System.out.println("Digite un nuemro maximo de 2 digitos:");
    int num=enter.nextInt();

    if(num>9){
        System.out.println("Enumeri tiene 2 digitos:");
    }    
    else{
        System.out.println("El numero tiene 1 digito):");
    }
    enter.close();
    }
    
}
