package jogodados;

import java.util.Scanner;

public class Jogo {
	private int resultado;
	
	private Dado d1 = new Dado();
	private Dado d2 = new Dado();
	
	private Scanner scan = new Scanner(System.in);
	
	private Jogador[] jog;
	
	public void inserirJogadores() {
		int qnt;
		
		do {
			System.out.print("Digite a quantidade de jogadores: ");
			qnt = scan.nextInt();
		}while(qnt > 11);
		
		jog = new Jogador[qnt];
		
		for(int i = 0; i < jog.length; i++) {
			System.out.print("Jogador " + (i + 1) + " digite seu nome: ");
			jog[i] = new Jogador();
			jog[i].setNome(scan.next());
		}
		
	}
	
	public void inserirAposta() {
		for(Jogador i : jog) {
			
			do {
				
				System.out.print(i.getNome() + " digite sua aposta: ");
				i.setValorAposta(scan.nextInt());
				
			}while(i.getValorAposta() < 2 || i.getValorAposta() > 12);
			
		}
		
	}
	
	public void lancarDados() {
		d1.setValorFace();
		d2.setValorFace();
	}
	
	public void mostrarResultado() {
		resultado = d1.getValorFace() + d2.getValorFace();
		System.out.println("Resultado: " + resultado);
	}
	
	public void mostrarVencedor() {
		boolean ganhou = true;
		for(Jogador i : jog) {
			if(resultado == i.getValorAposta()) {
				System.out.print(i.getNome() + " ganhou");
				ganhou = false;
			}
		}
		
		if(ganhou) {
			System.out.print("O computador ganhou");
		}
	}
	
}