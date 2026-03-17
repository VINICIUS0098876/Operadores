package operadorProject;

public class Partida {

	public static void main(String[] args) {
		
		Atacante atacante1 = new Atacante("Ash", "Sargento", 10);
		Defensor defensor1 = new Defensor("Smoke", "Tenente", 135, 5);
		
		// Aqui o metodo toString da classe mae Object retorna bonitinho o formulario que configuramos na classe pai Operador utilizando a sobreescrita @Override
		// Assim não precisamos utilizar o getNome, getVida ou getPatente.
		System.out.println(atacante1);
		System.out.println("--- AÇÃO ---");
		atacante1.usarHabilidade();
		System.out.println("------------");
		System.out.println(defensor1);
		System.out.println("--- AÇÃO ---");
		defensor1.usarHabilidade();
		
	}

}
