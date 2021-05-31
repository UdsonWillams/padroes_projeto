package view;

import model.Cliente;
import model.SomadorAdapter;
import model.SomadorExiste;

public class Main {
    public static void main(String[] args) {

        SomadorExiste somadorExiste = new SomadorExiste();
        SomadorAdapter somadorAdapter = new SomadorAdapter(somadorExiste);
        Cliente c1 = new Cliente(somadorAdapter);
        c1.executar();
    }
}
