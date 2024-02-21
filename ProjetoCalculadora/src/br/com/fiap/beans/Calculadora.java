package br.com.fiap.beans;

public class Calculadora {
	
	private int num1;
	private int num2;
	
	private int escolha;
	

	public Calculadora() {
		super();
	}
	
	public Calculadora(int num1, int num2, int escolha) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.escolha = escolha;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getEscolha() {
		return escolha;
	}

	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	
	public int soma(int num1, int num2) {
		return (num1 + num2);
	}
	
	public int subtracao(int num1, int num2) {
		return (num1 - num2);
	}
	
	public int multiplicacao(int num1, int num2) {
		return (num1 * num2);
	}
	
	public float dividir(int num1, int num2) {
		return (num1 / num2);
	}

}
