package TrabIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaDeNomes {
    private List<String> nomes = new ArrayList<>();

    public void adicionarNome(String nome) {
        nomes.add(nome);
    }

    public Iterator<String> criarIterator() {
        return new IteratorDeNomes();
    }
    
    private class IteratorDeNomes implements Iterator<String> {
        private int indice = 0;

        @Override
        public boolean hasNext() {
            return indice < nomes.size();
        }

        @Override
        public String next() {
            if (hasNext()) {
                return nomes.get(indice++);
            }
            return null;
        }
    }
}