package opet.tds171a.main;

import java.util.ArrayList;

import opet.tds171a.pessoas.Diretor;
import opet.tds171a.pessoas.Funcionario;
import opet.tds171a.pessoas.Secretario;

public class MainPessoas {

	private static ArrayList<Funcionario> arrFuncionarios ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrFuncionarios = new ArrayList<Funcionario>();
		
		popularFuncionario();
		
		listarFuncionarios();
		

	}
	
	public static void popularFuncionario() {
		
		Diretor diretor = new Diretor("Paulo", 12500.00);
		arrFuncionarios.add(diretor);
		
		Secretario secretario = new Secretario("Bruno", 1590.23);
		arrFuncionarios.add(secretario);
			
	}
	
	public static void listarFuncionarios() {
		for(Funcionario func : arrFuncionarios) {
			
			// .pagarBonus neste caso é um exemplo clássico de polimorfismo
			System.out.println(func.getNome() +" "+  func.pagarBonus() );
			if(func instanceof Diretor) {
				System.out.println("[E um diretor!");
			}
			
			// utiliza o método declarado em interfaces
			func.baterPonto();
		}
	}
	


}
