package br.com.treinaweb.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainMap {

	public static void main(String[] args) {
	
		Map<String, Pessoa> mapaPessoas = new LinkedHashMap<String, Pessoa>();
		
		System.out.println(mapaPessoas.put("legal", new Pessoa(1, "TreinaWeb 1")));
		System.out.println(mapaPessoas);
		System.out.println(mapaPessoas.put("legal", new Pessoa(2, "TreinaWeb 2")));
		System.out.println(mapaPessoas);
		mapaPessoas.put(null, new Pessoa(-1, "NULO"));
		System.out.println(mapaPessoas);
		mapaPessoas.put(null, new Pessoa(-2, "NULO 2"));
		System.out.println(mapaPessoas);
		mapaPessoas.put("teste", null);
		System.out.println(mapaPessoas);
		

	}

}
