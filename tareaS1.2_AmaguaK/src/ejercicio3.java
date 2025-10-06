import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digita un numero del 1-10: ");
        numero = sc.nextInt();

        if(numero >=1 || numero <=10){
            for(int i = 0; i<=10;i++){
                System.out.println(numero+" * "+i+" = "+numero*i);
            }
        }
    }
}
