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
public abstract class Pessoa {

    //Atributos
    protected String nome;
    protected int idade, experiencia;
    protected char sexo;

    //Construtor
    public Pessoa(String nome, int idade, char sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.experiencia = 0;
    }

    //Método abstrato
    protected abstract void ganharExperiencia();

    //Métodos acessores e modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //Método Sobrescrito da classe Object
    @Override
    public String toString() {
        return "Nome = " + nome + ", Idade = " + idade + ", Experiência = "
                + experiencia + ", Sexo = " + sexo + ", ";
    }

}
