public class conversion {

    public static void main(String[] args) {
    //CONVEERSION DE TIPOS DE DATOS
    //String a int
    String let1="3";
    int num1=5;
    int num2=Integer.parseInt(let1);
    System.out.println("La suma de las variables es:" +(num1+num2));

    //Int a String
    int num3=8;
    String let2=Integer.toString(num3);    
    System.out.println("De int a String:" +let2);

    //String a Double
    String let3="12.4";
    double num4=Double.parseDouble(let3);
    System.out.println("De String a Double:" +num4);

    //Double a String
    double num5=5.7;
    String let4=String.valueOf(num5);
    System.out.println("De Doble a String:" +let4);

    //String a Float
    String let5="9.5";
    float num6=Float.parseFloat(let5);
    System.out.println("De String a Float:" +num6);

    //Float a String
    Float num7=3.2f;
    String let6=Float.toString(num7);
    System.out.println("De Float a String:" +let6);
        
    }
    
}
