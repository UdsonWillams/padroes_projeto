package model;

public class Cliente {

    private SomadorAdapter somadorAdapter;
    public Cliente (SomadorAdapter somador){
        this.somadorAdapter = somador;
    }
    public void executar(){
        int[] vetor = new int[] {1,2,3,4,5,6,7,8,9,10};
        int soma = somadorAdapter.somaVetor(vetor);
        System.out.println("Resultado: " + soma);

    }
}
