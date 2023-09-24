package TrabIterator;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
        ListaDeNomes lista = new ListaDeNomes();
        lista.adicionarNome("Alice");
        lista.adicionarNome("Bob");
        lista.adicionarNome("Charlie");

        Iterator<String> iterator = lista.criarIterator();

        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }
    }
}
