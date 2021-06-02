import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.setNome(JOptionPane.showInputDialog("Digite o nome do Funcionário"));

		func.setCpf(JOptionPane.showInputDialog("Digite o cpf do funcionário"));
		
		func.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salário do funcionário")));
		
		JOptionPane.showMessageDialog(null, "Nome: "+ func.getNome() + "  CPF: " +func.getCpf() + "  Salário: " + func.getSalario() + "  Salário com cifra: " + func.getSalario("R$"));
	}
}