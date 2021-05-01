import java.util.Scanner;

public class condicional2 {
    public static void main(String[] args) throws Exception {
    //*>, <, >=, <=, ==, !=, &&(y), ||(o)*//

    Scanner enter=new Scanner(System.in);
    System.out.println("Digite un nombre:");
    String nom=enter.nextLine();

    //Si el nombre e Pedro me muestra la palabra bien de lo contrario me nuestra la palabra mal//

    if(nom.equalsIgnoreCase("Pedro")){
        System.out.println("BIEN:");
    }    
    else{
        System.out.println("MAL:");
    }
    enter.close();


    }
    
}
