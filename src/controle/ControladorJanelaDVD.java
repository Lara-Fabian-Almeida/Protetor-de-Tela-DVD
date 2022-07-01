/*
 * Universidade Estadual do Sudoeste da Bahia - UESB
 * Curso: Sistemas de Informa��o     Semestre: 3�       Per�odo Letivo: 2020.1
 * Disciplina: LP II      Professor: Murilo Santana
 * Aluno(a): Lara F�bian Almeida Santos
 * Data: 31/05/2021
 *
 * Criar interface gr�fica de um protetor de tela de DVD, usando Thread e sleep.
 */

package controle;

import visao.JanelaDVD;

public class ControladorJanelaDVD {

	JanelaDVD janela;
	private int velocidadeX = 5, velocidadeY = 5;
	
	//Construtor do ControladorJanelaDVD.
	public ControladorJanelaDVD() {
		this.janela = new JanelaDVD();
		new MovimentoAutomatico().start();  //M�todo start dispara a execu��o da classe que herda a Thread.
	}
	
	//Classe MovimentoAutomatico herda da Thread a capacidade de ser rodada em tempo de execu��o.
	public class MovimentoAutomatico extends Thread {
		//M�todo run executa as atividades da Thread.
		public void run() {
			while(true) {  //Enquanto for verdade, o programa vai rodar. Obs.: Neste caso � sempre, ou seja, enquanto a janela estiver aberta.
				try {
					sleep(20);  //Coloca a Thread para dormir em 20 milissegundos, para n�o passar a imagem t�o r�pido na tela.
				}
				catch(Exception e) {
					
				}
				
				//Os Ifs abaixo, verificam se a imagem atingiu as bordas da janela.
				//Se a imagem atingir as bordas da janela, sua posi��o atual recebe adiciona uma acr�scimo com o sinal oposto ao atual.
				//Ou seja, se estiver aumentando, decresce, e se estiver dimunuindo, acresce.
				if(janela.getLabelImagem().getX() > 665 || janela.getLabelImagem().getX() < 0) {
					velocidadeX = velocidadeX * (-1);
				}
				if(janela.getLabelImagem().getY() > 360 || janela.getLabelImagem().getY() < -30) {
					velocidadeY = velocidadeY * (-1);
				}
				
				//A posi��o da imagem � atualizada.
				janela.getLabelImagem().setLocation(janela.getLabelImagem().getX()+velocidadeX, janela.getLabelImagem().getY()+velocidadeY);  
			}
		}
	}
	
	//Main.
	public static void main(String[] args) {
		new ControladorJanelaDVD();
	}
}
