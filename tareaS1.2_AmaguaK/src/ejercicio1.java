import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre="";
        double n1,n2,n3,promedio;

        // Ingresar datos desde teclado
        System.out.print("Digita tu primera nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digita tu segunda nota: ");
        n2 = sc.nextDouble();
        System.out.print("Digita tu tercera nota: ");
        n3 = sc.nextDouble();

        promedio =(n1+n2+n3)/3;

        // Condicional
        if(promedio>=7){
            System.out.print("El estudiante Aprueba con "+promedio+" de calificacion");
        }else{
            System.out.print("El estudiante Reprueba con "+promedio+" de calificacion");
        }

    }
}
