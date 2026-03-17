package fp.dam.java;

import java.util.Stack;

public class Ejercicio01 {

	public static void colapsar(Stack<Integer> pila) {
		if (pila.isEmpty() || pila.size() == 0)
			return;
		int primero = pila.pop();
		int segundo = pila.pop();
		colapsar(pila);

		if (!pila.isEmpty()) {
			pila.push(primero + segundo);
		}

		if (pila.size() == 1 || pila.size() == 3 || pila.size() == 5 || pila.size() == 7 || pila.size() == 9) {
			pila.peek();
		}
	}

	public static void main(String[] args) {
	}
}
