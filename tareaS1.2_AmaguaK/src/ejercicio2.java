import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeros;
        System.out.print("Cuantos numeros vas a ingresar: ");
        numeros = sc.nextInt();
        int pares=0;

        // Iteraciones por cada numero que lea
        for(int i=0;i<=numeros;i++){
            System.out.print("Ingrese un numero:");
            int j=sc.nextInt();
            if(j % 2== 0){
                System.out.print("El numero es par\n");
                pares +=1;  // aumenta en 1 el contador de pares
            }else{
                System.out.print("El numero es impar\n");
            }
        }
        System.out.print("Se ingresaron "+pares+" numeros pares");
    }
}
