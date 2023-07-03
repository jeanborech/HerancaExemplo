package Entidades_heranca;

public class Conta {

	private Integer contaInteger;
	private String titularString;
	protected Double saldoDouble; //sem metodo set pois saldo nao pode ser alterado. usado saque e deposito
	
	public Conta() {
	}

	public Conta(Integer contaInteger, String titularString, Double saldoDouble) {
		this.contaInteger = contaInteger;
		this.titularString = titularString;
		this.saldoDouble = saldoDouble;
	}

	public Integer getContaInteger() {
		return contaInteger;
	}

	public void setContaInteger(Integer contaInteger) {
		this.contaInteger = contaInteger;
	}

	public String getTitularString() {
		return titularString;
	}

	public void setTitularString(String titularString) {
		this.titularString = titularString;
	}

	public Double getSalDouble() {
		return saldoDouble;
	}

	public void saque(double quantia) {
		saldoDouble -= quantia;
	}
	
	public void deposito(double quantia) {
		saldoDouble += quantia;
	}
}
