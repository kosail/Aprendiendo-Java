package ejerciciosEnClase;

/*
 * Esta aplicación permitirá leer una expresión posfija y evaluarla para mostrar su resultado.
 * Se asume que las expresiones posfijas leídas son correctas.
 */

import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Si usaramos la interfaz Deque, podemos usar distintas clases para implementarlo. Por ejemplo, podemos usar ArrayDeque o LinkedLista.
 * ArrayDeque se comporta con almacenamiento estático, mientras ArrayList lo hace con almacenamiento dinámico.
 */

public class AppEvaluaPostFijas {
	public static void main(String[] args) throws IOException {
		Deque<String> pila = new ArrayDeque<>();

		String operadores = "+-*/%^";
		BufferedReader br = new BufferedReader(new FileReader("D:\\Workspaces\\Universidad\\Fundamentos de Programación\\Aprendiendo_Java\\ejerciciosEnClase\\expresionesPostfijas.txt"));

		// El método ready() de la clase BufferedReader en Java se utiliza para verificar si el flujo de entrada está listo para ser leído, es decir, si hay datos disponibles para ser leídos sin bloquear el programa. Retorna true si hay datos disponibles para ser leídos, y false si no hay datos o si el flujo de entrada está cerrado.
		while (br.ready()) {
			String[] partesExpresion = br.readLine().split(",");

			// Evaluar expresión
			for (String elemento:partesExpresion) {
				if (operadores.contains(elemento)) {
					int operando2 = Integer.parseInt(pila.pop());
					int operando1 = Integer.parseInt(pila.pop());
					switch(elemento) {
						case "+":
							pila.push(Integer.toString(operando1+operando2)); // La Clase toString recibe un entero y lo convierte en un string.
							break;
						case "-":
							pila.push(Integer.toString(operando1-operando2));
							break;
						case "*":
							pila.push(Integer.toString(operando1*operando2));	
							break;
						case "/":
							pila.push(Integer.toString(operando1/operando2));
							break;
						case "%":
							pila.push(Integer.toString(operando1%operando2));
							break;
						case "^":
							pila.push(Integer.toString((int) Math.pow(operando1,operando2)));
							break;
					}
				} else {
					pila.push(elemento);
				}
			}
			System.out.println(pila.pop());
		}
		br.close();
	}
}