/*
 * Universidade Estadual do Sudoeste da Bahia - UESB
 * Curso: Sistemas de Informa��o     Semestre: 3�       Per�odo Letivo: 2020.1
 * Disciplina: LP II      Professor: Murilo Santana
 * Aluno(a): Lara F�bian Almeida Santos
 * Data: 31/05/2021
 *
 * Criar interface gr�fica de um protetor de tela de DVD, usando Thread e sleep.
 */

package visao;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaDVD extends JFrame {

	//Declara��o de vari�veis.
	private static final long serialVersionUID = 1L;
	private JLabel labelImagemDeFundo, labelImagem;
    
    // Construtor
    public JanelaDVD() {
        //Janela.
    	super();  // Chama o construtor da classe pai (JFrame, no caso). 
        setTitle("Protetor de Tela de DVD");  //Defini��o do t�tulo da janela.
        setVisible(true);  //Configura a visibilidade da tela.
        setSize(800, 566); //Configura o tamanho da tela.
        setLocationRelativeTo(null); //Centraliza imagem na tela.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //M�todo que fecha a janela.
        setLayout(null);
        setResizable(false); //Impede a maximiza��o da tela.
        getContentPane().add(getLabelImagem());  //Adiciona a imagem que se movimentar� na janela.
        getContentPane().add(getLabelImagemDeFundo());  //Adiciona a imagem de fundo na janela.
		repaint();
		validate();
    }
    
    //JLabel que cont�m a imagem de fundo.
    public JLabel getLabelImagemDeFundo() {
    	
		if(labelImagemDeFundo == null) {
			labelImagemDeFundo = new JLabel(); //Instanciando o JLabel.
			labelImagemDeFundo.setIcon(new ImageIcon(getClass().getResource("C�u.png"))); //Define o �cone imagem que o JLabel exibir�.
			labelImagemDeFundo.setBounds(0, 0, 800, 566); //x, y, largura, altura da imagem.
		}
    	return labelImagemDeFundo;
    }
    
    // JLabel que cont�m a imagem que se movimenta.
    public JLabel getLabelImagem() {
    	
		if(labelImagem == null) {
			labelImagem = new JLabel(); //Instanciando o JLabel.
			labelImagem.setIcon(new ImageIcon(getClass().getResource("Estrela.png")));  //Define o �cone imagem que o JLabel exibir�.
            labelImagem.setBounds(350, 150, 200, 200); //x, y, largura, altura da imagem.
		}
    	return labelImagem;
    }  
}
