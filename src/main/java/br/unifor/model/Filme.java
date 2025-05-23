package br.unifor.model;

public class Filme {
    private int id;
    private String nome;
    private String genero;
    private String duracao;
    
    public Filme(int id, String nome, String genero, String duracao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
}
