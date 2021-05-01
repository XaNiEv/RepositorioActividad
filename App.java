public class App {
public static void main(String[] args) throws Exception {
    //METODOS DE CLASE STRING
    //length
    String pal= "ADSI";
    System.out.println("La cantidad de caracteres es:" +pal.length())
;

    //Substring
    String pal1= "ADSI";
    System.out.println("El caracter de la posicion 1 es:" +pal1.substring(1));

    //toLowerCase
    String pal2= "ADSI";
    System.out.println("La palabra minuscula es:" +pal2.toLowerCase());

    //toUpperCase
    String pal3= "adsi";
    System.out.println("La palabra mayuscula es:" +pal3.toUpperCase());

    //equalsIgnoreCase
    String pal4= "ADSI1", pal5= "adsi1";
    System.out.println("Los datos iguales:" +pal4.equals(pal5));

    //replaceAll
    String pal6= "ADSI";
    System.out.println("El texto a reemplazar es DS:" +pal6.replaceAll("DS", "zxc"));

    }
}









