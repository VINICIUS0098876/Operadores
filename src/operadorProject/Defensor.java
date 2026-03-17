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
}
