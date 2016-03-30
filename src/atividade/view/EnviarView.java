package atividade.view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import atividade.controller.EnviarCtrl;

public class EnviarView extends JComponent {
	
	private EnviarCtrl enviarC;
	
	
	JFrame  janela;
	
	
	public EnviarView(EnviarCtrl enviarC) {
		this.enviarC = enviarC;
		
		this.janela = new JFrame("Nova Mensagem");
		this.janela.getContentPane().add(this);
		this.janela.setLayout(new GridLayout(0,2));
		
		this.janela.add(enviarC.getLblVazio());
		this.janela.add(enviarC.getLblNome()); this.janela.add(enviarC.getTxtNome());
		this.janela.add(enviarC.getLblMensagem());this.janela.add(enviarC.getTxtMensagem());
		this.janela.add(enviarC.getBtnEnviar());
		
		this.janela.setVisible(true);
		
		this.janela.setDefaultCloseOperation(3);
		this.janela.pack();
		
		
		this.setFocusable(true);
		this.janela.setResizable(false);
		
		
	}


	

}
