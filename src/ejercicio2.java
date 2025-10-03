import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        int precio_unitario,stock,total_stock;
        String nombre;
        Scanner calculo = new Scanner(System.in);

        System.out.print("Digita el nombre del producto: ");
        nombre = calculo.nextLine();

        System.out.print("Digita el precio unitario del producto: ");
        precio_unitario = calculo.nextInt();

        System.out.print("Digita la cantidad de disponible del producto: ");
        stock = calculo.nextInt();

        total_stock = precio_unitario * stock;
        System.out.print("El total de todo el stock del producto: "+nombre+" es "+ total_stock);

    }
}
