package operadorProject;

public class Operador {
	private String nome;
	private int vida;
	private String patente;
	
	// Aqui vamos fazer a sobrecarga dos construtores
	
	public Operador(String nome, String patente){
		this.nome = nome;
		this.patente = patente;
		this.vida = 100;
	}
	
	// Sobrecarga
	public Operador(String nome, String patente, int vida) {
		this.nome = nome;
		this.patente = patente;
		this.vida = vida;
	}
	
	
	// GETTERS AND SETTERS
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getPatente() {
		return this.patente;
	}
	
	public void setPatente(String novaPatente) {
		this.patente = novaPatente;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setVida(int novaVida) {
		
		if(this.vida <= 0) {
			this.vida = 0;
			System.out.println("Operador Eliminado!");
		}else {
			this.vida = novaVida;
		}
		
	}
	
	// Criamos um método de ação para Operador
	public void usarHabilidade() {
		System.out.println("Usando Habilidade padrão de combate!");
	}
	
	@Override
	public String toString() {
		// Aqui ao invés do toString retornar (operadorProject.Atacante@6576fe71) na main. Agora configurei para que ele retorne essas informações definidas.
		return "Ficha do Operador -> Nome: " + this.nome + 
			       " | Patente: " + this.patente + 
			       " | Vida: " + this.vida;
	}
}
