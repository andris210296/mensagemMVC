package iniciar;

import atividade.controller.EnviarCtrl;
import atividade.model.Mensagens;
import atividade.view.EnviarView;
import atividade.view.ExibirView;

public class Iniciar {

	public static void main(String[] args) {
		Mensagens mensagensM = new Mensagens();
		EnviarCtrl enviarC = new EnviarCtrl(mensagensM);
		EnviarView enviarV = new EnviarView(enviarC);
		enviarV.setLocation(5, 5);
		
		ExibirView exibirV = new ExibirView();
		exibirV.setLocation(120,5);
		
		mensagensM.addObserver(exibirV);
		
		enviarV.setVisible(true);
		exibirV.setVisible(true);
		

	}

}
