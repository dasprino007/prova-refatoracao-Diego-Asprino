package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculos v1 = new Veiculos();
        v1.setIndividuo("Carlos");
        v1.setPl("ABC-1234");
        v1.setGas(-10); // PERIGO: Valores negativos permitidos!
        v1.adicionar(50);
        v1.gasta(100); // PERIGO: Consome mais que o disponível!
        v1.printInformacao();
	}

}
