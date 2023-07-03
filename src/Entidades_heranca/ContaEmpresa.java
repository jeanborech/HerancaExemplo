package Entidades_heranca;

//Usando extends poderá ser usado todos os atributos e metodos da classe Conta
//ela extende a classe Conta
public class ContaEmpresa extends Conta {

	private Double limiteEmprestimo;

    public ContaEmpresa() {
    	super();
    }

	public ContaEmpresa(Integer contaInteger, String titularString, Double saldoDouble, Double limiteEmprestimo) {
		super(contaInteger, titularString, saldoDouble); //super traz argumentos da outra classe
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double quantia) {
		if (quantia <= limiteEmprestimo) {  //só sera depositado na conta se a quantia se ela for menor ou igual ao limite
			saldoDouble += quantia - 10;
		}
	}
	
    
    
}
