package application;

import java.util.Map;
import java.util.TreeMap;

public class Project {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>(); // como eu estou usando o treemap e ele e ordenado, tambem nao preciso implemantar o comparable, por receber obj do tipo String

		cookies.put("Username", "Maria"); // faco a insercao da minha chave valor, username --> chave, maria --> valor
		cookies.put("email", "Maria@gmail.com");
		cookies.put("phone", "448322367363");
		
		if(cookies.containsKey("phone")	== true ) {
			System.out.println(cookies.get("phone"));
		}

		// System.out.println(cookies.get("Username"));
		cookies.remove("email");// removo uma chave

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key)); // percorro um laco for para imprimir dados da minhas chaves/valor
		}
	}

}