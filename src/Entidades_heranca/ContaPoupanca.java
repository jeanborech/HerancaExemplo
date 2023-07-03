package Entidades_heranca;

public class ContaPoupanca extends Conta{

	private double taxaJuro;
	
	public ContaPoupanca() {
		super();
		}

	public ContaPoupanca(Integer contaInteger, String titularString, Double saldoDouble, double taxaJuro) {
		super(contaInteger, titularString, saldoDouble);
		this.taxaJuro = taxaJuro;
	}

	public double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	public void atualizarSaldo() {
		saldoDouble += saldoDouble * taxaJuro;
	}
	
	}
