package operadorProject;

public class Atacante extends Operador {
	// Aqui estou colocando um atributo diferencial e adicional que apenas a classe atacante vai ter.
	private int qtdGranada;
	
	// Aqui instanciamos um construtor da classe filha que ira chamar um construtor da classe pai usando o super()
	public Atacante(String nome, String patente, int qtdGranada) {
		super(nome, patente);
		this.qtdGranada = qtdGranada;
	}
	
	// Aqui fazemos a sobreescrita do metodo da classe pai utilizando o @Override para que essa classe Atacante tenha suas proprias funções.
	@Override
	public void usarHabilidade() {
		System.out.println("Lançando granda de fragmentação!");
	}
	
	@Override
	public String toString() {
		// Aqui estamos puxando o relatorio criado no metodo toString() da classe pai Operador usando super() que retorna a ficha do Operador como (Nome, Patente e Vida).
		// Pegamos e adicionamos a funcionalidade nova(qtdGranada) para aparecer junto no terminal, pois na classe pai não tem essa funcionalidade.
		return super.toString() + " | Granadas: " + this.qtdGranada;
	}
	
}
