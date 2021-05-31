package model;

import java.util.List;

public class SomadorExiste {

    public int somaLista(List<Integer> lista){
        int resultado = 0;
        for (int i : lista) resultado += i;
            return resultado;
    }
}
