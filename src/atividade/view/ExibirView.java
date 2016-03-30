package atividade.view;

import java.awt.GridLayout;
import java.awt.Label;
import java.util.*;

import javax.swing.*;

import atividade.model.Mensagens;

public class ExibirView extends JComponent implements Observer{

	private List<JLabel> labels = new ArrayList<JLabel>();
	private List<String> mensagens = new ArrayList<>();
	
	JFrame janela = new JFrame("Mensagens");
	JLabel lblMensagens = new JLabel();
	
	public ExibirView() {		
		
		
		this.janela.setLayout(new GridLayout(0,1)); 
											  
		this.janela.add(new JLabel("Mensagens"));
		this.janela.add(new JLabel());
		
		this.janela.setVisible(true);
		
		this.janela.setDefaultCloseOperation(3);
		this.janela.pack();
		
	
		
	}
	
	public void novoLabel (List mensagens){
		
		for (int i = 0 ; i < mensagens.size(); i++) {
			JLabel label = new JLabel(mensagens.get(i).toString());
			
			labels.add(label);
			
			
		}
		
		for(int i = 0;i < labels.size();i++){
			this.janela.add(labels.get(i));
		}
		
		
		System.out.println(mensagens.size());
	}	
	
	
	@Override
	public void update(Observable o, Object arg) {
		Mensagens mensagensM = (Mensagens) o;
		
		mensagens = mensagensM.getMensagens();
		
		novoLabel(mensagens);
		
		this.janela.revalidate();
		
		
	}

}
