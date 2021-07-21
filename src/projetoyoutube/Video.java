/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author thalia
 */
public final class Video implements AcoesVideo {

    //atributos
    private String titulo;
    private int avaliacao, likes, views;
    private boolean reproduzindo;

    //método construtor
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.avaliacao = 1;
        this.setLikes(0);
        this.setViews(0);
        this.setReproduzindo(false);
    }

    //métodos acessores e modificadores
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int avaliacaoAtual;
        avaliacaoAtual = (int) (this.avaliacao + avaliacao) / this.getViews();
        this.avaliacao = avaliacaoAtual;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //métodos abstratos da interface (sobrescritos)
    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("O vídeo está sendo reproduzido.");
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("O vídeo está pausado.");
    }

    @Override
    public void like() {
        this.setLikes(this.getLikes() + 1);
        System.out.println("Quantidade de likes: " + this.getLikes());
    }

    @Override
    public String toString() {
        return "Vídeo { " + "Título = " + titulo + ", Avaliação = " + avaliacao + ", Likes = "
                + likes + ", Views = " + views + ", Reproduzindo = " + reproduzindo + " }";
    }

}
