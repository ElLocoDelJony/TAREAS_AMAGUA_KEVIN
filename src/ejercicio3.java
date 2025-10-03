import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        String nombres="",apellidos="",cedula="",telefono="";

        while(nombres.isEmpty()) {
            System.out.print("Digite sus nombres: ");
            nombres = datos.nextLine();
        }

        while(apellidos.isEmpty()) {
            System.out.print("Digite sus apellidos: ");
            apellidos = datos.nextLine();
        }

        while(cedula.isEmpty()) {
            System.out.print("Digite su numero de cedula: ");
            cedula = datos.nextLine();
        }

        while(telefono.isEmpty()) {
            System.out.print("Digite su numero de telefono: ");
            telefono = datos.nextLine();
        }

        System.out.print("Se ha registrado el cliente con los datos: ");
        System.out.print("nombres: "+ nombres+"\napellidos: "+apellidos+"\ncedula: "+cedula+"\ntelefono: "+telefono);


    }
}
