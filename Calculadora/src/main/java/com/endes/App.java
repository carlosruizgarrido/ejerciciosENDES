package com.endes;

import com.github.javafaker.Faker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Faker fake = new Faker();
        //System.out.println(fake.dragonBall().character());
    	
    	Calculadora calc = new Calculadora(3,2);
    	double resultado = calc.dividir();
    	System.out.println(resultado);
    }
}
