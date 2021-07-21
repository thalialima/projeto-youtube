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
public final class Visualizacao {

    //Atributos
    private Inscrito espectador; //Agregação
    private Video filme; //Agregação

    //Método construtor
    public Visualizacao(Inscrito espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.getEspectador().setTotalAssistido(this.getEspectador().getTotalAssistido() + 1);
        this.getEspectador().ganharExperiencia();
        this.getFilme().setViews(this.getFilme().getViews() + 1);
    }

    //Métodos acessores e modificadores
    public Inscrito getEspectador() {
        return espectador;
    }

    public void setEspectador(Inscrito espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //Método da classe (sobrecarregado)
    public void avaliar() {
        this.getFilme().setAvaliacao(5);
        System.out.println("Avaliação sem parâmetros: " + this.getFilme().getAvaliacao());
    }

    public void avaliar(int nota) {
        this.getFilme().setAvaliacao(nota);
        System.out.println("Avaliação com parâmetro int: " + this.getFilme().getAvaliacao());
    }

    public void avaliar(float porcentagem) {
        int total = 0;
        if (porcentagem <= 30) {
            total = 3;
        } else if (porcentagem <= 50) {
            total = 5;
        } else if (porcentagem <= 70) {
            total = 7;
        } else if (porcentagem <= 90) {
            total = 8;
        } else {
            total = 10;
        }

        this.getFilme().setAvaliacao(total);
        System.out.println("Avaliação com parâmetro float: " + this.getFilme().getAvaliacao());
    }

    //Método Sobrescrito da classe Object
    @Override
    public String toString() {
        return "Visualização { " + "Espectador = " + espectador + "\n Filme = " + filme + " }";
    }

}
