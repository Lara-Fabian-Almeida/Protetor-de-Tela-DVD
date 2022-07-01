/*
 * Criar interface gráfica de um protetor de tela de DVD, usando Thread e sleep.
 */

package visao;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaDVD extends JFrame {

	//Declaração de variáveis.
	private static final long serialVersionUID = 1L;
	private JLabel labelImagemDeFundo, labelImagem;
    
    // Construtor
    public JanelaDVD() {
        //Janela.
    	super();  // Chama o construtor da classe pai (JFrame, no caso). 
        setTitle("Protetor de Tela de DVD");  //Definição do título da janela.
        setVisible(true);  //Configura a visibilidade da tela.
        setSize(800, 566); //Configura o tamanho da tela.
        setLocationRelativeTo(null); //Centraliza imagem na tela.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Método que fecha a janela.
        setLayout(null);
        setResizable(false); //Impede a maximização da tela.
        getContentPane().add(getLabelImagem());  //Adiciona a imagem que se movimentará na janela.
        getContentPane().add(getLabelImagemDeFundo());  //Adiciona a imagem de fundo na janela.
		repaint();
		validate();
    }
    
    //JLabel que contém a imagem de fundo.
    public JLabel getLabelImagemDeFundo() {
    	
		if(labelImagemDeFundo == null) {
			labelImagemDeFundo = new JLabel(); //Instanciando o JLabel.
			labelImagemDeFundo.setIcon(new ImageIcon(getClass().getResource("Céu.png"))); //Define o ícone imagem que o JLabel exibirá.
			labelImagemDeFundo.setBounds(0, 0, 800, 566); //x, y, largura, altura da imagem.
		}
    	return labelImagemDeFundo;
    }
    
    // JLabel que contém a imagem que se movimenta.
    public JLabel getLabelImagem() {
    	
		if(labelImagem == null) {
			labelImagem = new JLabel(); //Instanciando o JLabel.
			labelImagem.setIcon(new ImageIcon(getClass().getResource("Estrela.png")));  //Define o ícone imagem que o JLabel exibirá.
            labelImagem.setBounds(350, 150, 200, 200); //x, y, largura, altura da imagem.
		}
    	return labelImagem;
    }  
}
