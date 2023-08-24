/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


//Ejercicio 4 (LA MAMA DE JUAN)
package ejn4;
//importamos la clase Scanner para introducir informacion
import java.util.Scanner;
public class EJN4 {
    public static void main(String[] args) {
        int edju, edal, edan, edma; //asignamos las variables tipo "int"
        System.out.println("Ingresa la edad de Juan");//texto que anuncia a la entrada
        Scanner entrada = new Scanner(System.in);//nueva entrada
        edju = entrada.nextInt();//asignamos la entrada a la edad de juan
        edal = 2*(edju/3);//realizamos las respectivas operaciones
        edan = 4*(edju/3);
        edma = edju + edal + edan;
        System.out.println("Las edades son");//imprimimos los resultados
        System.out.println("Juan = " + edju);
        System.out.println("Alberto = " + edal);
        System.out.println("Ana = " + edan);
        System.out.println("Mama = " + edma);
        
    }
}
