package br.com.treinaweb.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainHashTable {

	public static void main(String[] args) {
		Hashtable<String, Pessoa> tabelaPessoas = new Hashtable<String, Pessoa>();
		
		tabelaPessoas.put("legal", new Pessoa(1, "TreinaWeb 1"));
		System.out.println(tabelaPessoas);
		
		tabelaPessoas.put("chato", new Pessoa(2, "TreinaWeb 2"));
		System.out.println(tabelaPessoas);
		
		tabelaPessoas.get("legal");
		
		//Iteração
		//Fail-fast iterator
//		Iterator<String> iteratorChaves = tabelaPessoas.keySet().iterator();
//		//tabelaPessoas.remove("legal");
//		while (iteratorChaves.hasNext()) {
//			String chave = iteratorChaves.next();
//			System.out.println(" - " + tabelaPessoas.get(chave).toString());
//		}
		
		//Non Fail-fast iterator
		
		Enumeration<String> chaves = tabelaPessoas.keys();
		tabelaPessoas.remove("legal");
		while (chaves.hasMoreElements()) {
			String chave = chaves.nextElement();
			System.out.println(" - " + tabelaPessoas.get(chave).toString());
		}
		
		//Verificador antigo
//		Pessoa p = null;
//		if (tabelaPessoas.containsKey("legal")) {
//			p = tabelaPessoas.get("legal");
//		} else {
//			p = new Pessoa(-1, "Não existe");
//		}
//		System.out.println(p);
		
		//Novo jeito orientado à funções
		
		Pessoa p = tabelaPessoas.getOrDefault("legal",new Pessoa(-1, "Non EqXiste"));
		System.out.println(p);
		
		
//		if (!tabelaPessoas.containsKey("legal")) {
//			tabelaPessoas.put("legal", new Pessoa (1, "TreinaWeb"));
//		}
		
		tabelaPessoas.putIfAbsent("legal", new Pessoa(1, "TreinaWeb 1"));
		System.out.println(tabelaPessoas);
		
		tabelaPessoas.forEach((chave, valor) -> {
			System.out.println(String.format("[%s] %s", chave, valor.toString()));
		});
		

	}

}
