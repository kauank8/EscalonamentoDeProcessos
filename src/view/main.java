package view;

import br.com.kauanpaulino.filaObject.FilaObject;
import controller.EscalonamentoController;
import model.processos;

public class main {

	public static void main(String[] args) {
		FilaObject f = new FilaObject();
		EscalonamentoController e = new EscalonamentoController();
		
		processos p1 = new processos();
		p1.name=("notepad.exe");
		p1.QntRetornos=(14);
		
		processos p2 = new processos();
		p2.name=("explorer.exe");
		p2.QntRetornos=(25);
		
		processos p3 = new processos();
		p3.name=("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
		p3.QntRetornos=(18);
		
		f.insert(p1);
		f.insert(p2);
		f.insert(p3);
		
		e.escalonar(f);
	}
}
