
public class Funcionario {
	
	private String nome;
	protected double salario;
	
	
	Funcionario(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentasalario() {
		setSalario(getSalario()* 0.35);
		
		
	}
	
}
