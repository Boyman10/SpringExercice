package org.example.demo.ticket.model.bean.utilisateur;

public class Utilisateur {

    private Integer id;
    private String nom;
    private String prenom;

    private String pseudo;
    private String pass;

    public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String pNom) {
        nom = pNom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String pPrenom) {
        prenom = pPrenom;
    }
}
