package it.polito.tdp.corsi.model;

public class TestModel {

	//testo il model per assicurarmi che funzioni
	public static void main(String[] args) {
		Model model = new Model();
		System.out.println(model.getCorsiByPeriodo(1));
		
		System.out.println(model.getIscrittiByPeriodo(2));
		

	}

}
