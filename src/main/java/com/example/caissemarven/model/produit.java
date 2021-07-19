/*
 * Pour modifier cet en-tête de licence, choisissez En-têtes de licence dans les propriétés du projet.
* Pour modifier ce fichier modèle, choisissez Outils | Modèles
 * et ouvrez le modèle dans l'éditeur.
 */
package  com.example.caissemarven.model ;

importer  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
importer  javax.persistence.GenerationType ;
importer  javax.persistence.Id ;


/**
 *
* @auteur Dory
 */
@Entité
 classe  publique produit {

    @Identifiant
    @GeneratedValue ( stratégie  =  GenerationType . AUTO )
     ID d' entier privé ;
     nom de chaîne privé ;
     prix entier privé ;
    
    
    public  Entier  getId () {
        renvoyer l' identifiant ;
    }

    public  void  setId ( ID entier  ) {
        ça . identifiant = identifiant;
    }

     chaîne  publique getName () {
        renvoyer le nom ;
    }

    public  void  setName ( nom de chaîne  ) {
        ça . nom = nom;
    }

    public  Entier  getPrice () {
        prix de retour ;
    }

    public  void  setPrice ( prix entier  ) {
        ça . prix = prix ;
    }
}
