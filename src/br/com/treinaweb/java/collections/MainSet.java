package br.com.treinaweb.java.collections;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainSet {

	public static void main(String[] args) {
		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		
//		System.out.println(set);
		
		Set<Pessoa> set2 = new LinkedHashSet<Pessoa>();
		
		set2.add(new Pessoa(1, "TreinaWeb 1"));
		set2.add(new Pessoa(2, "Treina 2"));
		System.out.println(set2);
		set2.add(new Pessoa(2, "Treina 2"));
		
		System.out.println(set2);
	}

}
