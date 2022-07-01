/*
 * Universidade Estadual do Sudoeste da Bahia - UESB
 * Curso: Sistemas de Informação     Semestre: 3º       Período Letivo: 2020.1
 * Disciplina: LP II      Professor: Murilo Santana
 * Aluno(a): Lara Fábian Almeida Santos
 * Data: 31/05/2021
 *
 * Criar interface gráfica de um protetor de tela de DVD, usando Thread e sleep.
 */

package controle;

import visao.JanelaDVD;

public class ControladorJanelaDVD {

	JanelaDVD janela;
	private int velocidadeX = 5, velocidadeY = 5;
	
	//Construtor do ControladorJanelaDVD.
	public ControladorJanelaDVD() {
		this.janela = new JanelaDVD();
		new MovimentoAutomatico().start();  //Método start dispara a execução da classe que herda a Thread.
	}
	
	//Classe MovimentoAutomatico herda da Thread a capacidade de ser rodada em tempo de execução.
	public class MovimentoAutomatico extends Thread {
		//Método run executa as atividades da Thread.
		public void run() {
			while(true) {  //Enquanto for verdade, o programa vai rodar. Obs.: Neste caso é sempre, ou seja, enquanto a janela estiver aberta.
				try {
					sleep(20);  //Coloca a Thread para dormir em 20 milissegundos, para não passar a imagem tão rápido na tela.
				}
				catch(Exception e) {
					
				}
				
				//Os Ifs abaixo, verificam se a imagem atingiu as bordas da janela.
				//Se a imagem atingir as bordas da janela, sua posição atual recebe adiciona uma acréscimo com o sinal oposto ao atual.
				//Ou seja, se estiver aumentando, decresce, e se estiver dimunuindo, acresce.
				if(janela.getLabelImagem().getX() > 665 || janela.getLabelImagem().getX() < 0) {
					velocidadeX = velocidadeX * (-1);
				}
				if(janela.getLabelImagem().getY() > 360 || janela.getLabelImagem().getY() < -30) {
					velocidadeY = velocidadeY * (-1);
				}
				
				//A posição da imagem é atualizada.
				janela.getLabelImagem().setLocation(janela.getLabelImagem().getX()+velocidadeX, janela.getLabelImagem().getY()+velocidadeY);  
			}
		}
	}
	
	//Main.
	public static void main(String[] args) {
		new ControladorJanelaDVD();
	}
}
