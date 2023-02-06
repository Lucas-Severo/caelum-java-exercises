package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{

	@Override
	public void sacar(double valor) {
		super.sacar(valor + 0.10);
	}
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
}