package controller;

import java.util.Random;

import br.com.kauanpaulino.filaObject.FilaObject;
import model.processos;

public class EscalonamentoController {

	public EscalonamentoController() {
		// TODO Auto-generated constructor stub
	}
	
	public void escalonar(FilaObject f) {
		Random gerador = new Random();
		int decremento = gerador.nextInt(5)+1;
		while(f.isEmpty() != true)
		try {
			processos p = (processos) f.remove();
			if(p.QntRetornos>1) {
				p.QntRetornos -= decremento;
				if(p.QntRetornos>1) {
				f.insert(p);}
			}
			if(p.QntRetornos<1) {
				Runtime.getRuntime().exec(p.name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
	
}
