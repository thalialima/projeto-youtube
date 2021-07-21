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
public final class Inscrito extends Pessoa {

    //Atributos
    private String login;
    private int totalAssistido;

    //Método construtor
    public Inscrito(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.totalAssistido = 0;
    }

    //Métodos acessores e modificadores
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    //Método da classe
    public void viuMaisUm() {
        this.setTotalAssistido(this.getTotalAssistido() + 1);
        System.out.println("Total de vídeos assistido pelo inscrito " + this.getLogin());
        System.out.print(": " + this.getTotalAssistido());
    }

    //Métodos abstratos (sobrescritos)
    @Override
    protected void ganharExperiencia() {
        this.setExperiencia(this.getExperiencia() + 10);
        System.out.println("Experiência atual do inscrito: " + this.getExperiencia() + "XP.");
    }

    @Override
    public String toString() {
        return "Inscrito { " + super.toString() + "Login = " + login
                + ", Total Assistido = " + totalAssistido + '}';
    }

}
