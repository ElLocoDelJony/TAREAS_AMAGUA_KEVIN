import java.util.Scanner;

// Limpieza del buffer con nextLine()

public class buffer_nextLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre;
        System.out.print("Edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Nombre :"+ nombre);
    }

}
