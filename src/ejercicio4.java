import java.util.Scanner;
import java.math.BigDecimal;
public class ejercicio4 {
    public static void main(String[] argsS){
        int edad=0;
        double altura=0;

        Scanner calculo = new Scanner(System.in);

        while(edad<1){
            System.out.print("Digite su edad: ");
            edad = calculo.nextInt();
            if (edad <1){
                System.out.print("Datos no validos\n");
            }
        }
        while(altura<1){
            System.out.print("Digite su altura: ");
            altura = calculo.nextDouble();
            if(altura<1){
                System.out.print("Datos no validos\n");
            }
        }
        if(edad>=18 && altura >=1.60){
            System.out.print("Cumple");
        }else{
            System.out.print("No cumple");
        }
    }
}
