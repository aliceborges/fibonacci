package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {

	public @interface Desafio {
		String value();
	}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {
		List<Integer> fibonacci = new ArrayList();
		fibonacci.add(0);
		fibonacci.add(1);

		while (fibonacci.get(fibonacci.size()-1) <= 350)
			fibonacci.add(fibonacci.get(fibonacci.size()-2) + fibonacci.get(fibonacci.size()-1));

		return fibonacci;
	}

	@Desafio("isFibonnaci")
	public static Boolean isFibonacci(Integer a) {
		List<Integer> fibonacci = fibonacci();
		return fibonacci.contains(a);
	}


}