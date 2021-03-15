public class Cliente {
    private String nome;
    private int pontosDeAlugadorFrequente;
    public Cliente(String nome) {
        this.nome = nome;
        this.pontosDeAlugadorFrequente = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
	public int getPontosDeAlugadorFrequente() {
		return pontosDeAlugadorFrequente;
	}
	public void setPontosDeAlugadorFrequente(int pontosDeAlugadorFrequente) {
		this.pontosDeAlugadorFrequente = pontosDeAlugadorFrequente;
	}
}