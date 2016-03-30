package atividade.model;

import java.util.*;

public class Mensagens extends Observable{
	
	private List<String> mensagens;
	
	
	public Mensagens() {
		mensagens = new ArrayList<>();
	}
	
	
	
	public void adicionarMensagem(String mensagem){
		mensagens.add(new Date()+" "+ mensagem);
		
		setChanged();
		notifyObservers(mensagem);
		
	}



	public List<String> getMensagens() {
		return mensagens;
	}



	public void setMensagens(List<String> mensagens) {
		this.mensagens = mensagens;
	}
	
	

}
