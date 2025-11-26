package Calculadora;

/**
 * Projeto Calculadora
 * 
 * Esta classe fornece operações matemáticas básicas (soma, subtração, multiplicação e divisão)
 * e um método principal que seleciona a operação com base na entrada do usuário.
 * 
 * Este projeto é utilizado para demonstrar:
 * - Técnicas de revisão estática (caixa branca)
 * - Aplicação de refatoração em código Java
 * - Documentação com Javadoc
 * 
 * Após a refatoração, os métodos desta classe são **métodos puros**, sem efeitos colaterais,
 * permitindo maior legibilidade e facilitando testes unitários.
 * 
 * @author Victor dos Santos Ferreira
 * @version 1.0
 */
public class Calculadora {
	
	// métodos puros e simples
	
	/**
	 * Soma dois números inteiros.
	 * 
	 * @param a primeiro operando
	 * @param b segundo operando
	 * @return o resultado da soma de a + b
	 */
	public int somar(int a, int b) {
		return a + b;
	}
	
	/**
	 * Subtrai dois números inteiros.
	 * 
	 * @param a primeiro operando
	 * @param b segundo operando
	 * @return o resultado da subtração de a - b
	 */
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplica dois números inteiros.
	 * 
	 * @param a primeiro operando
	 * @param b segundo operando
	 * @return o resultado da multiplicação de a * b
	 */
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	/**
	 * Divide dois números inteiros.
	 * 
	 * @param a primeiro operando (dividendo)
	 * @param b segundo operando (divisor)
	 * @return o resultado da divisão de a / b
	 * @throws IllegalArgumentException se o divisor for zero exibe a mensagem "Divisão por zero não é permitida."
	 */
	public int dividir(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Divisão por zero não é permitida.");
		}
		return a / b;
	}
	
	/**
	 * <p>Executa a operação matemática solicitada com base no operador informado.</p>
	 * <p>Operadores aceitos:</p>
	 * <ul>
	 * <li>"+":Soma</li>
	 * <li>"-":Subtração</li>
	 * <li>"*":Multiplicação</li>
	 * <li>"/":Divisão</li>
	 * </ul>
	 * <p>Qualquer operador inválido resulta em exceção.</p>
	 * 
	 * @param a primeiro operando
	 * @param b segundo operando
	 * @param operador simbolo da operação desejada
	 * @return o resultado da operação correspondente ao operador informado
	 * @throws IllegalArgumentException se o operador não for um símbolo válido
	 */
	public int calcular(int a, int b, String operador) {
		return switch (operador) {
			case "+" -> somar(a, b);
			case "-" -> subtrair(a, b);
			case "*" -> multiplicar(a, b);
			case "/" -> dividir(a, b);
			default -> throw new IllegalArgumentException("Operador inválido: " + operador);
		};
	}
}
