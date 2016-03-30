package atividade.controller;

import java.awt.event.*;

import javax.swing.*;

import atividade.model.Mensagens;

public class EnviarCtrl implements ActionListener{

	private Mensagens mensagensM;
	
	
	
	private JLabel lblVazio = new JLabel("");
	private JLabel lblNome = new JLabel("Nome:");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblMensagem = new JLabel("Msg:");
	private JTextField txtMensagem  = new JTextField();
	
	private JButton btnEnviar = new JButton("Enviar");
	
	
	
	public EnviarCtrl(Mensagens mensagensM) {
		try {
			
			this.mensagensM = mensagensM;
			btnEnviar.addActionListener(this);
			
		} catch (Exception e) {
			System.out.println("Zikou o bagulho!!!");
		}
		
		
		
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEnviar){
			
			
				String mensagem = txtNome.getText()+ "-"+ txtMensagem.getText();
				
			    mensagensM.adicionarMensagem(mensagem);
			
		}
		
	}






	public JLabel getLblMensagem() {
		return lblMensagem;
	}






	public void setLblMensagem(JLabel lblMensagem) {
		this.lblMensagem = lblMensagem;
	}






	public JTextField getTxtMensagem() {
		return txtMensagem;
	}






	public void setTxtMensagem(JTextField txtMensagem) {
		this.txtMensagem = txtMensagem;
	}






	public JButton getBtnEnviar() {
		return btnEnviar;
	}






	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
	}






	public JLabel getLblNome() {
		return lblNome;
	}






	public void setLblNome(JLabel lblNome) {
		this.lblNome = lblNome;
	}






	public JTextField getTxtNome() {
		return txtNome;
	}






	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}






	public JLabel getLblVazio() {
		return lblVazio;
	}






	public void setLblVazio(JLabel lblVazio) {
		this.lblVazio = lblVazio;
	}

}
