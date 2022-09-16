package aula02;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
		
	void sacar(double qtd) {
		this.saldo = this.saldo - qtd;
	}
	
	public Conta() {
		System.out.println("O construtor foi chamado!");
	}
	
	public Conta(int numero, String nome, double saldo, double limite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = 100000;
	}


}
