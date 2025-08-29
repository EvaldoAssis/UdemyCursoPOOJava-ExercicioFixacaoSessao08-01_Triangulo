package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y; // Declarando as variaveis como tipo "Triangulo" (tipo da nova classe criada)
		x = new Triangulo(); // Instanciando o objeto X que está presente na classe Triangulo
		y = new Triangulo(); // Instanciando o objeto X que está presente na classe Triangulo

		// Lendo um número e guardando na variável a do objeto X (objeto x está presente
		// na classe Triangulo)
		System.out.println("Entre com os valores do triângulo A: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os valores do triângulo B: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		/*
		 * Declarando as variaveis areaX e areaY e chamando o m�todo que realiza a
		 * operação
		 * de calcular a área dos triangulos
		 */
		double areaX = x.area();
		double areaY = y.area();

		System.out.println(areaX);
		System.out.println(areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
