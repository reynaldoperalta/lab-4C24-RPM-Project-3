package com.tecsup.lab2.git.controller;

import java.util.Scanner;

public class StudentController {
	public static void main( String[] args )
    {
        int n1, n2, resta;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer n�mero: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo n�mero: " );
        n2 = teclado.nextInt();

        resta = n1 + n2;

        System.out.println( "La resta de " + n1 + " menos " + n2 + " es " + resta + "." );
    }

}
