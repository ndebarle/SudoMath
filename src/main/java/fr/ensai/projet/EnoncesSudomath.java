package fr.ensai.projet;

public class EnoncesSudomath {
    public int  id;
    public String commentaires;
    public Exercices[] exercices;
    public Utilisateur auteur; 

    public EnoncesSudomath (int id, String commentaires, Exercices[] exercices, Utilisateur auteur){
        this.id = id;
        this.commentaires = commentaires;
        this.exercices = exercices;
        this.auteur = auteur;
    }
    
}
