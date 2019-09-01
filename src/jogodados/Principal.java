package jogodados;

public class Principal {
	
	public static void main(String[] args) {
		Jogo j = new Jogo();
		
		j.inserirJogadores();
		j.inserirAposta();
		j.lancarDados();
		j.mostrarResultado();
		j.mostrarVencedor();
		
	}

}
