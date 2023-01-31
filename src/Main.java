import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String operacion;
        String respuesta;
        int operando1;
        int operando2;
        boolean band=true;

            do {
                System.out.print("Captura Operacion: ");
                operacion = entrada.next();
                if(operacion.equals("SUMA")||operacion.equals("RESTA")||operacion.equals("MULTIPLICACION")||operacion.equals("DIVISION")) {
                    System.out.print("Operando1: ");
                    operando1 = entrada.nextInt();
                    System.out.print("Operando2: ");
                    operando2 = entrada.nextInt();
                    switch (operacion) {
                        case "SUMA" ->
                            System.out.println(operando1 + " + " + operando2 + " = " + (operando1 + operando2));
                        case "RESTA" ->
                            System.out.println(operando1 + " - " + operando2 + " = " + (operando1 - operando2));
                        case "MULTIPLICACION" ->
                            System.out.println(operando1 + " * " + operando2 + " = " + (operando1 * operando2));
                        case "DIVISION" ->
                            System.out.println(operando1 + " / " + operando2 + " = " + (operando1 / operando2));
                    }
                }else
                    System.out.println("Operacion no soportada");
                System.out.print("otro? (SI/NO): ");
                respuesta = entrada.next();
                if(!respuesta.equals("SI"))
                    band=false;
            }while (band);
    }
}