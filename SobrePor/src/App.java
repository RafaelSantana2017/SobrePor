
public class App {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Rafael");
		f.setSalario(1000);
		f.aumentasalario();
		System.out.println("Funcionario : " + f.getNome() + " Salario: " + f.getSalario());
		
		Gerente g = new Gerente();
		g.setNome("Jonatas");
		g.setSalario(3000);
		g.aumentasalario();
		System.out.println("Gerente :" + g.getNome() + " Salario: " + g.getSalario());
		
		Programador j = new Programador();
		j.setNome("Joao");
		j.setSalario(3500);
		j.aumentasalario();
		System.out.println("Progamador :" + j.getNome() + " Salario: " + j.getSalario());
	
		Analista a = new Analista();
		a.setNome("junior");
		a.setSalario(2000);
		g.aumentasalario();
		System.out.println("Analista : " + f.getNome() + " Salario: " + f.getSalario());
	}

}
