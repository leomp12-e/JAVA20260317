package fp.dam.java;

import java.util.Stack;

public class Ejercicio01 {

	public static void colapsar(Stack<Integer> pila) {
		if (pila.isEmpty())
			return;
		int primero;
		int segundo;
		colapsar(pila);

		if (!pila.isEmpty()) {
			pila.pop();
			pila.push(primero + segundo);
		}
	
		if(pila.size() == 1 || pila.size() == 3 || pila.size() == 5 || pila.size() == 7 || pila.size() == 9) {
			pila.peek();
		}
	}

	public static void main(String[] args) {

	}
}
