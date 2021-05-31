package model;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado{

    private SomadorExiste somadorExiste;
    private List list;

    public SomadorAdapter(SomadorExiste somadorExiste){
        this.somadorExiste = somadorExiste;
        this.list = new ArrayList();
    }

    public int somaVetor(int[] vetor){
        for (int j : vetor) {
            list.add(j);
        }
        int resultado = somadorExiste.somaLista(list);
        return resultado;
    }
}
