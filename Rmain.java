// Integrantes: 
//Emmanuel Rendon Goez
//Julian Velasquez Garces

import java.util.Scanner;

public class Rmain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        
        
        metodos m = new metodos();

        boolean bandera = true;

        articulo[][] a = new articulo[1][10];

        while (bandera) {

            System.out.print("Menu \n 1. Ingresar articulos \n 2. Mostrar \n 3. Vender \n 4. Precio total \n 5. Salir\nIngrese la opción: ");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    a = m.matriz();
                    break;
                case 2:
                    m.mostrar(a);
                    break;
                case 3:
                    a = m.vender(a);
                    break;
                case 4:
                    m.PrecioTotal(a);
                    break;
                case 5:
                    bandera = false;
                    System.out.println("Adios");
                    break;
                default:
                    break;
            }


            
        }
        
    }
    
}
