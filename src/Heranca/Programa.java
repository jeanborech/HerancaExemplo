package Heranca;

import Entidades_heranca.Conta;
import Entidades_heranca.ContaEmpresa;
import Entidades_heranca.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {

		Conta cc = new Conta(1001, "Maria", 0.0);
		ContaEmpresa ce = new ContaEmpresa(1002, "Jean", 0.0, 1000.00);
		
		//Upcasting -> Casting da subclasse para superclasse
		//atribuir um objeto de uma sublasse para uma super classe
		Conta cc1 = ce;
		Conta cc2 = new ContaEmpresa(1003, "Alex", 0.0, 500.00);
		Conta cc3 = new ContaPoupanca(1005, "Paulo", 0.0, 0.02);
		
		//Downcasting -> Casting da superclasse para subclasse
		//convertendo cc2 que é conta para contaEmpresa
		ContaEmpresa cc4 = (ContaEmpresa)cc2;
        cc4.emprestimo(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		//cc3 não é instancia de contaEmpresa, então este irá pular fora deste if
        if (cc3 instanceof ContaEmpresa) {
			ContaEmpresa acc5 = (ContaEmpresa)cc3;
			acc5.emprestimo(200.00);
			System.out.println("empréstimo!");
		}
		//cc3 é instancia de contaPoupança então executa
		if (cc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)cc3; //downcasting ai
			acc5.atualizarSaldo();                   //depois operação de atualizar
			System.out.println("atualizar!");
		}
	}

}
