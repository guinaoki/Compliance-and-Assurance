package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Calculadora;

public abstract class Teste {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		
		calculadora.setNum1(inteiro("Digite um número: "));
		calculadora.setNum2(inteiro("Digite outro número: "));
		calculadora.setEscolha(inteiro("Digite o número da operação que deseja realizar (1 = soma/ 2 = subtração/ 3 = multiplicação/ 4 = divisão): "));
		
		int valorEscolha = calculadora.getEscolha();
		if(valorEscolha == 1) {
			int valorSoma = calculadora.soma(calculadora.getNum1(), calculadora.getNum2());
			System.out.println("A soma é: " + valorSoma);
		}else if(valorEscolha == 2) {
			int valorSubtracao = calculadora.subtracao(calculadora.getNum1(), calculadora.getNum2());
			System.out.println("A subtração é: " + valorSubtracao);
		}else if(valorEscolha == 3) {
			int valorMultiplicacao = calculadora.multiplicacao(calculadora.getNum1(), calculadora.getNum2());
			System.out.println("A multiplicação é: " + valorMultiplicacao);
		}else if(valorEscolha == 4) {
			float valorDivisao = calculadora.dividir(calculadora.getNum1(), calculadora.getNum2());
			System.out.println("A divisão é: " + valorDivisao);
		}else {
			System.out.println("Opção inválida");
		}

	}

}
