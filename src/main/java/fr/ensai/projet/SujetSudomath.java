package fr.ensai.projet;

public class SujetSudomath {
    public int  id;
    public String commentaires;
    public Exercices[] exercices;
    public Utilisateur auteur; 

    public SujetSudomath (int id, String commentaires, Exercices[] exercices, Utilisateur auteur){
        this.id = id;
        this.commentaires = commentaires;
        this.exercices = exercices;
        this.auteur = auteur;
    }
}