import java.text.DecimalFormat;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private DecimalFormat df = new DecimalFormat("#,###.00");
	
	//Get's Methods
	public String getCpf() {
		return this.cpf;
	}
	
	public String getSalario() {
		String salario = df.format(this.salario);
		salario = salario.replace('.', '-');
		salario = salario.replace(',', '.');
		salario = salario.replace('-', ',');
		return salario;
	}

	public String getSalario(String cifra) {
		String salario = cifra + df.format(this.salario);
		salario = salario.replace('.', '-');
		salario = salario.replace(',', '.');
		salario = salario.replace('-', ',');
		return salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	//Set's Methods
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Overloading setNome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome, boolean caixaAlta) {
		if (caixaAlta) {
			this.nome = nome.toUpperCase();
		} else {
			this.nome = nome.toLowerCase();
		}
	}
	
	public void setNome(String nome, boolean caixaAlta, String primeiraPalavra) {
		if (caixaAlta) {
			this.nome = nome.toUpperCase();
		} else {
			this.nome = nome.toLowerCase();
		}
		
		if (primeiraPalavra.equals('S')) {
			this.nome = nome.split(" ")[0];
		}
	}
	
	public void setNome(String nome, String primeiraPalavra) {
		if (primeiraPalavra.equals("S")) {
			this.nome = nome.split(" ")[0];
		}
	}
	
	//Print Attributes Method
	public void imprimir() {
		System.out.println(this.getNome());
		System.out.println(this.getCpf());
		System.out.println(this.getSalario());
	}
}
