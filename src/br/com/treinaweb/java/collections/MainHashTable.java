package br.com.treinaweb.java.collections;

import java.util.Hashtable;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainHashTable {

	public static void main(String[] args) {
		Hashtable<String, Pessoa> tabelaPessoas = new Hashtable<String, Pessoa>();
		
		tabelaPessoas.put("legal", new Pessoa(1, "TreinaWeb 1"));
		System.out.println(tabelaPessoas);
		
		tabelaPessoas.put("chato", new Pessoa(2, "TreinaWeb 2"));
		System.out.println(tabelaPessoas);
		
		tabelaPessoas.get("legal");

	}

}
