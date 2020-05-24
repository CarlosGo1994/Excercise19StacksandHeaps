package com.exercise19stacksandheaps;

import java.util.Stack;

public class StacksandHeaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables declaration
		String cad=	"Fragmento de un escrito con unidad tem�tica, que queda diferenciado del resto de fragmentos por un punto y aparte 					y generalmente tambi�n por llevar letra may�scula inicial y un espacio en blanco en el margen izquierdo de 					alineaci�n del 		texto principal de la primera l�nea.";
		
				
		Stack<Character> letters = new Stack<Character>();
		
		char[] lettersArray = cad.toCharArray();
		
		for(Character c: lettersArray)
		{
			if(Character.toUpperCase(c) == 'A')
			{
				letters.push(c);
			}
		}
		while(!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
		/*
		for(Character c: letters)
		{
			System.out.println(letters.pop());
		}*/
	}

}
