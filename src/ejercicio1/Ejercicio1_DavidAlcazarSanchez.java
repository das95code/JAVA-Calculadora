/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;   // Importante importar el scanner!!


/**
 *
 * @author DavidAlcázarSánchez
 */
public class Ejercicio1_DavidAlcazarSanchez {
    
    
    public static void main(String[] args) {
        
        int menu = 0; //Esta es la opción elegida por el usuario. Nos moveremos por el menú con esta variable.
        int num1 = 0; //Variable relativa al operando 1.
        int num2 = 0; //Variable relativa al operando 2.
        float num3 = 0;
        float num4 = 0; //Estas dos variables los utilizaremos para las operaciones de divisiones y resto.
        
        while (menu!= 6){  //Se repetirá la calculadora mientras el valor seleccionado de nuestro menú no sea 6.
            
            System.out.println("");   //Con unos cuantos System.out.println diseñamos el menú que aparecerá por pantalla.
            System.out.println("   CALCULADORA   ");
            System.out.println("-----------------");
            System.out.println("Elige opción:  ");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Resto");
            System.out.println("6.- Salir");
        
            Scanner sc = new Scanner(System.in);  //Creamos un nuevo objeto de la clase scanner...
            menu = sc.nextInt();   // ... que nos servirá para movernos por el menú.
            
            switch(menu){   //Con un switch iremos seleccionando los distintos case en función de la opción de la calculadora que hayamos elegido.
                case 1: 
                        System.out.println("Has elegido la opción sumar.");
                        System.out.println("Introduce el valor del primer número: "); //Prints informativos.
                        Scanner sc1 = new Scanner(System.in);   
                        num1 = sc1.nextInt();   //Scanner que nos pedirá el primer sumando.
                        System.out.println("Introduce el valor del segundo número: "); 
                        Scanner sc2 = new Scanner(System.in);
                        num2 = sc2.nextInt();  //Lo mismo con el segundo.
                        int suma = num1 + num2;   //Creamos la variable suma con la operación...
                        System.out.println("El resultado de " + num1 + " + " + num2 + " = " + suma); //... y lanzamos el print final con toda la información.
                        break;  //Un break al final de cada case nos ahorrará caer en cascada por todo el switch. En este caso no necesitaremos
                                //más comprobaciones. Terminamos el case, reiniciamos el bucle y volvemos al menú.
                        
                case 2: //Hacemos exactamente lo mismo para cada case. En esta segunda opción, la resta.
                        System.out.println("Has elegido la opción restar.");
                        System.out.println("Introduce el valor del primer número: ");
                        Scanner sc3 = new Scanner(System.in);
                        num1 = sc3.nextInt();
                        System.out.println("Introduce el valor del segundo número: "); 
                        Scanner sc4 = new Scanner(System.in);
                        num2 = sc4.nextInt();
                        int resta = num1 - num2;
                        System.out.println("El resultado de " + num1 + " - " + num2 + " = " + resta);
                        break;
                        
                case 3: //Exactamente lo mismo para la multiplicación.
                        System.out.println("Has elegido la opción multiplicar.");
                        System.out.println("Introduce el valor del primer número: ");
                        Scanner sc5 = new Scanner(System.in);
                        num1 = sc5.nextInt();
                        System.out.println("Introduce el valor del segundo número: "); 
                        Scanner sc6 = new Scanner(System.in);
                        num2 = sc6.nextInt();
                        int multiplicacion = num1 * num2;
                        System.out.println("El resultado de " + num1 + " * " + num2 + " = " + multiplicacion);
                        break;
                        
                case 4: //Para la división la estructura es la misma, pero debemos fijarnos en un detalle importante.
                        System.out.println("Has elegido la opción dividir.");
                        System.out.println("Introduce el valor del primer número: ");
                        Scanner sc7 = new Scanner(System.in);
                        num3 = sc7.nextInt();
                        System.out.println("Introduce el valor del segundo número: "); 
                        Scanner sc8 = new Scanner(System.in);
                        num4 = sc8.nextInt();
                            if (num4 == 0){  //Con este if, controlaremos que el divisor no valga 0.
                                do{
                                System.out.println("¡El divisor no puede ser 0!");
                                System.out.println("Prueba a introducir un valor distinto: ");
                                Scanner sc9 = new Scanner(System.in);
                                num4 = sc9.nextInt();
                                } while (num4 == 0);  //Y mediante un do while, nos aseguraremos de que pida un divisor hasta que sea distinto de 0.
                            }
                        float division = num3 / num4;  //Tanto para la división como para el resto utilizaremos variables del tipo float.
                        System.out.println("El resultado de " + num3 + " / " + num4 + " = " + division);
                        break;
                        
                case 5: //En el case 5 tomaremos las mismas medidas que con la división. En este caso calcularemos el resto.
                        System.out.println("Has elegido la opción resto.");
                        System.out.println("Introduce el valor del primer número: ");
                        Scanner sc10 = new Scanner(System.in);
                        num3 = sc10.nextInt();
                        System.out.println("Introduce el valor del segundo número: "); 
                        Scanner sc11 = new Scanner(System.in);
                        num4 = sc11.nextInt();
                            if (num4 == 0){
                                do{
                                System.out.println("¡El denominador no puede ser 0!");
                                System.out.println("Prueba a introducir un valor distinto: ");
                                Scanner sc12 = new Scanner(System.in);
                                num4 = sc12.nextInt();
                                } while (num4 == 0);
                            }
                        float resto = num3 % num4;
                        System.out.println("El resultado de " + num3 + " % " + num4 + " = " + resto);
                        break;
                        
                case 6: //Con el case 6 solo sacaremos una línea en pantalla que sirva para indicar que el programa termina, pues el valor 6 cierra el bucle.
                        System.out.println("Has elegido la opción salir. ¡Hasta luego!");
                        break;
                        
                default: //La opción por defecto. Saldrá por pantalla cuando introduzcamos un valor erróneo.
                        System.out.println("No has introducido ningún valor válido. Prueba otra vez.");
                
            }
        
        }
    }
}

