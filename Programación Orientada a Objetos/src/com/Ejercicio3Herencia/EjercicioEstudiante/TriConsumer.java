package com.Ejercicio3Herencia.EjercicioEstudiante;

// We are creating this custom interface as an extension of the Consumer built-in interface. In Main.java we needed a method that received 3 arguments, and thus I'm learning functional interfaces I enforced myself to use functional style programming as much as possible (without burning out my brain)

@FunctionalInterface
public interface TriConsumer<T, A, K> {
	// Single abstract method that takes three parameters and returns void.
	void accept(T t, A a, K k);
}
