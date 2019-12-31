package br.com.treinaweb.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.treinaweb.java.collections.comparadores.PessoaTamanhoNomeComparator;
import br.com.treinaweb.java.collections.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa(1, "TreinaW 1"));
		pessoas.add(new Pessoa(4, "TreinaWe 2"));
		pessoas.add(new Pessoa(3, "Treinaweb 3"));
		
		Collections.sort(pessoas, new PessoaTamanhoNomeComparator());
		System.out.println(pessoas);
		
		pessoas.sort((o1, o2 ) -> {
			if (o1.getNome().length() == o2.getNome().length()) {
				return 0;
			} else if (o1.getNome().length() < o2.getNome().length()) {
				return -1;
			}
			return 1;
		});
		
	/* ***************************************************
	*********** Varrendo a lista com o FOR *********/	
		
//		for (int i = 0; i < pessoas.size(); i++) {
//			Pessoa p = pessoas.get(i);
//			System.out.println(p);
//		}
		
	/* ***************************************************
	*********** Varrendo a lista com o Iterator *********/
		
		System.out.println("\n****** Varrendo com iterator ******\n");
		Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
		while (iteratorPessoa.hasNext()) {
			Pessoa p = iteratorPessoa.next();
			System.out.println(p);
		}
		
	/* ***************************************************
	*********** Varrendo a lista com o For each *********/
		
		System.out.println("\n***** Varrendo com for each ******\n");
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		System.out.println("\nFIM!");
		
	}
	
}
