/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio 5 (Prueba de escritorio)
package ejn5;
//importamos la clase Scanner para introducir informacion
import java.util.Scanner;
public class EJN5 {
    public static void main(String[] args) {
        int x, y, suma = 0; //asignamos las variables tipo "int"
        Scanner entrada = new Scanner(System.in); //texto que anuncia a la entrada
        System.out.println("Ingrese el valor de X"); //nueva entrada
        x = entrada.nextInt(); 
        System.out.println("Ingrese el valor de Y"); //nueva entrada
        y = entrada.nextInt();
        suma = suma + x; //realizamos las respectivas operaciones
        x = (int)(x + Math.pow(y,2));
        suma = suma +(x/y);
        System.out.println("El valor de la suma es: " + suma); //imprimimos el resultado         
    }
}
