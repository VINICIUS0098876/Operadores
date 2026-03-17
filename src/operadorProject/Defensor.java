package operadorProject;

public class Defensor extends Operador{
	private int qtdBarricada;
	
	public Defensor(String nome, String patente, int vida, int qtdBarricada) {
		super(nome, patente, vida);
		this.qtdBarricada = qtdBarricada;
	}
	
	@Override
	public void usarHabilidade() {
		System.out.println("Colocando Barricada!");
	}
	
	@Override
	public String toString() {
		// Aqui estamos puxando o relatorio criado no metodo toString() da classe pai Operador usando super() que retorna a ficha do Operador como (Nome, Patente e Vida).
		// Pegamos e adicionamos a funcionalidade nova(qtdBarricada) para aparecer junto no terminal, pois na classe pai não tem essa funcionalidade.
		return super.toString() + " | Barricadas: " + this.qtdBarricada;
	}
}
