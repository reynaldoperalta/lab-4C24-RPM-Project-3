package com.tecsup.lab2.git.controller;

import java.util.Scanner;

public class StudentCtrl {
  public static void main( String[] args )
    {
        int n1, n2, suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        suma = n1 + n2;

        System.out.println( "La suma de " + n1 + " mas " + n2 + " es " + suma + "." );
    }

}
