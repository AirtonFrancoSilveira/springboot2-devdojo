package academy.devdojo.springboot2.domain;

public class Anime {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public Anime() {
    }

    public Anime(String nome) {
        this.nome = nome;
    }
}
