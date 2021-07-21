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
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 05 de HTML");
        
        System.out.println("*****Vídeos*****");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        Inscrito i[] = new Inscrito[3];
        
        i[0] = new Inscrito("Thalia", 24, 'F', "Th4l14");
        i[1] = new Inscrito("Godofredo", 20, 'M', "Dodo");
        i[2] = new Inscrito("Ana", 29, 'F', "Anita");
        
        System.out.println("\n****Inscritos****");
        System.out.println(i[0].toString());
        System.out.println(i[1].toString());
        System.out.println(i[2].toString());
        
        Visualizacao vis[] = new Visualizacao[4];
        
        vis[0] = new Visualizacao(i[0], v[0]);
        vis[0].avaliar(7);
        vis[0].getFilme().setReproduzindo(true);
        vis[0].getFilme().like();
        vis[1] = new Visualizacao(i[1], v[2]);
        vis[1].avaliar(87.0f);
        vis[2] = new Visualizacao(i[2], v[2]);
        vis[2].avaliar();
        vis[3] = new Visualizacao(i[0], v[1]);
        vis[3].avaliar(10);
        
        System.out.println("\n***Visualizações***");
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());
        System.out.println(vis[3].toString());
        
    }
    
}
