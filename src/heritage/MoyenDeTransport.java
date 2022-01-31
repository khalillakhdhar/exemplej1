package heritage;

public class MoyenDeTransport {
private int identifiant;
private String nom,marque;
private String couleur;
public int getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(int identifiant) {
	this.identifiant = identifiant;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
@Override
public String toString() {
	return "MoyenDeTransport [identifiant=" + identifiant + ", nom=" + nom + ", marque=" + marque + ", couleur="
			+ couleur + "]";
}







}
