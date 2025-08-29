package entidades;

// Criação da nova classe chamada Triangulo
public class Triangulo {

	// Declarando os atributos da classe triangulo como públicos
	public double a;
	public double b;
	public double c;

	// Cria��o de uma função como pública, que retorna um double, do nome area e que
	// não há paramâtros
	public double area() {

		// Operação que realiza a operação de cálculo de área
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - b) * (p - b) * (p - c));
		return result;

	}

}
