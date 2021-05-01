public class App {
public static void main(String[] args) throws Exception {
    //METODOS DE LAS CLASE STRING
    //length
    String pal= "ADSI";
    System.out.println("La cantidad de LETRAS es:" +pal.length())
;
    //EJEMPLOS
    //Substring
    String pal1= "ADSI";
    System.out.println("La primera letra:" +pal1.substring(1));

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
    System.out.println("Se reemplaza las letras DS:" +pal6.replaceAll("DS", "zxc"));

    //FIN DE LA PRESENTACION    
    }
}









