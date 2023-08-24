/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Ejercicio 14 (Cubo y Cuadrado)
package ejn14;
//importamos la clase Scanner para introducir informacion
import java.util.Scanner;
public class EJN14 {
    public static void main(String[] args) {
        int X, a, b; //asignamos las variables tipo "int"
        Scanner entrada = new Scanner(System.in); //texto que anuncia a la entrada
        System.out.println("Ingresa el numero"); //nueva entrada
        X = entrada.nextInt(); //asignamos la entrada a X para luego operar
        a = (int) Math.pow(X,2); //realizamos las respectivas operaciones
        b = (int) Math.pow(X,3);
        System.out.println("El cuadrado del numero es: " + a); //escribismos los respectivos resultados
        System.out.println("El cubo del numero es: " + b);
    }
}
