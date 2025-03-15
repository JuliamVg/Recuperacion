// Integrantes: 
//Emmanuel Rendon Goez
//Julian Velasquez Garces

import java.util.Scanner;

public class metodos{
    Scanner sc = new Scanner(System.in);

    public void PrecioTotal(articulo[][] a){
        double Ptotal = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == null) {
                    
                }else{
                    Ptotal = Ptotal + a[i][j].getPrecio();
                }
            }
        }
        System.out.println("El valor total de todos los productos es: " + Ptotal);
    }

    public articulo[][] matriz(){

        articulo[][] articulos = new articulo[1][10];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < articulos[i].length; j++) {
                articulo a = new articulo();
                System.out.print("Ingrese la marca: ");
                a.setMarca(sc.nextLine());
                a.setPrecio((int) (Math.random()*20)+1);
                System.out.print("Ingrese la descripción: ");
                a.setDescripcion(sc.nextLine());
                
                articulos[i][j] = a;
            }
        }
        return articulos;
    }

    public void mostrar(articulo[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == null) {
                    System.out.print("");
                }else{
                    System.out.println(a[i][j].getMarca());
                    System.out.println(a[i][j].getPrecio());
                    System.out.println(a[i][j].getDescripcion());
                }
            }
        }
    }

    public articulo[][] vender(articulo[][] a){

        System.out.print("ingrese el articulo para vender: ");
        String art = sc.nextLine();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == null) {
                    System.out.println("");
                }else{
                    if (art.equalsIgnoreCase(a[i][j].getMarca())) {
                        a[i][j] = null;
                    } 
                }
 
            }
        }
        return a;
    }
}