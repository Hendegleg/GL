package gl;

import java.util.Date;
import java.util.List;
import java.util.Map;

// Interfaces
interface Cloneable {
    Object clone();
}

interface Element {
    void ajouterElement(Element element);

    void supprimerElement(Element element);

    List<Element> getElements();
}

interface Observer {
    void update();
}

// Classes

class Utilisateur {
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String statut;
    private String role;
    private Date dateInscription;
    private List<String> formations;

    public Utilisateur() {
    }

    public void changeEmail(String nouvelEmail) {
    }

    public void changeMotDePasse(String ancienMdp, String nouveauMdp, String mdpConfirmation) {
    }

    public void seConnecter(String email, String motDePasse) {
    }

    public void seDeconnecter() {
    }

    public void recupererMotDePasse(String email) {
    }

    public void recupererNomUtilisateur(String email) {
    }

    public void ajouterFormation(String formationId) {
    }

    public void supprimerFormation(String formationId) {
    }

    public List<String> listerFormations() {
        return null;
    }

    public void envoyerMessage(String destinataire, String message) {
    }

    public void lireMessages() {
    }

    public void repondreMessage(String messageId, String message) {
    }

    public void ajouterEvaluation(String evaluationId) {
    }

    public void recupererEvaluations() {
    }

    public void consulterFicheEvaluation(String formationId) {
    }

    public void envoyerEmailConfirmation(String email, String motDePasse) {
    }

    public void confirmerCompte(String token) {
    }

    public void modifierUtilisateur(Map<String, String> info) {
    }
}

class Administrateur extends Utilisateur {
    public void ajouterFormation(String formationId) {
    }

    public void supprimerFormation(String formationId) {
    }

    public void ajouterUtilisateur(String utilisateurId) {
    }

    public void supprimerUtilisateur(String utilisateurId) {
    }

    public void genererRapport() {
    }
}

class SuperAdministrateur extends Administrateur {
    public void ajouterAdministrateur(String adminId) {
    }

    public void supprimerAdministrateur(String adminId) {
    }
}

class FormationService {
    public void ajouterModule(String formationId, String moduleId) {
    }

    public void recupererModules(String formationId) {
    }
}

class Formation {
    private String nom;
    private String description;
    private List<String> modules;
    private Date dateDebut;
    private Date dateFin;
    private double prix;
    private List<String> utilisateurs;

    public Formation() {
    }

    public void ajouterModule(String moduleId) {
    }

    public void supprimerModule(String moduleId) {
    }

    public void recupererModules() {
    }

    public void ajouterUtilisateur(String utilisateurId) {
    }

    public void supprimerUtilisateur(String utilisateurId) {
    }

    public void recupererUtilisateurs() {
    }

    public void ajouterEvaluation(String evaluationId) {
    }

    public void recupererEvaluations() {
    }

    public void recupererFicheEvaluation(String formationId) {
    }

    public void suivreFormation(String utilisateurId) {
    }

    public void arreterSuiviFormation(String utilisateurId) {
    }

    public void validerFormation(String utilisateurId) {
    }

    public void obtenirCertification(String utilisateurId) {
    }

    public void getInfos() {
    }
}

class Module implements Element {
    private String titre;
    private List<String> chapitres;
    private String formationId;

    public void ajouterChapitre(String chapitreId) {
    }

    public void supprimerChapitre(String chapitreId) {
    }

    public List<String> recupererChapitres() {
        return null;
    }

    @Override
    public void ajouterElement(Element element) {
    }

    @Override
    public void supprimerElement(Element element) {
    }

    @Override
    public List<Element> getElements() {
        return null;
    }
}

class Chapitre implements Element {
    private String titre;
    private List<String> lecons;
    private String moduleId;

    public void ajouterLecon(String leconId) {
    }

    public void supprimerLecon(String leconId) {
    }

    public List<String> recupererLecons() {
        return null;
    }

    @Override
    public void ajouterElement(Element element) {
    }

    @Override
    public void supprimerElement(Element element) {
    }

    @Override
    public List<Element> getElements() {
        return null;
    }
}

class Lecon {
    private String titre;
    private String contenu;
    private String chapitreId;

    public void ajouterLecon() {
    }

    public void modifierLecon() {
    }

    public void supprimerLecon() {
    }

    public void publierLecon() {
    }

    public void recupererLecons() {
    }

    public void rendreLeconAccessible() {
    }

    public void verifierDepot() {
    }
}

class Commentaire {
    private String contenu;
    private String utilisateurId;
    private Date datePublication;
}

class GestionCommentaire {
    public void ajouterCommentaire() {
    }

    public void modifierCommentaire() {
    }

    public void supprimerCommentaire() {
    }

    public void recupererCommentaires() {
    }
}

class PublicationCommentaire {
    public void publierCommentaire() {
    }

    public void supprimerCommentaire() {
    }
}

class Evenement {
    private String titre;
    private Date dateDebut;
    private Date dateFin;

    public void ajouterSondageTravail() {
    }

    public void supprimerSondageTravail() {
    }

    public void ajouterFormation() {
    }

    public void recupererFormations() {
    }

    public void participerEvenement() {
    }

    public void supprimerParticipation() {
    }
}

class UserController {
    public void handleEvent(Event event) {
    }
}

class Depot {
    private String document;
    private Date dateDepot;

    public void ajouterDepot() {
    }

    public void supprimerDepot() {
    }

    public void modifierDepot() {
    }

    public void recupererDepot() {
    }
}

class DepotEtudiant extends Depot {
    public void parcourirTravaux() {
    }
}

class DepotFormateur extends Depot {
    public void ajouterTravail() {
    }

    public void supprimerTravail() {
    }

    public void parcourirTravauxEtudiant() {
    }
}

class FicheEvaluation {
    private String reponse;
    private String utilisateurId;
    private Date dateEvaluation;

    public void remplirFicheEvaluation() {
    }

    public void recupererFicheEvaluation() {
    }

    public void consulterFicheEvaluation() {
    }
}

class Discuter {
    public void envoyerMessage() {
    }

    public void recevoirMessage() {
    }

    public void recupererDiscussions() {
    }
}

class Clone implements Cloneable {
    @Override
    public Object clone() {
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemple de création et d'utilisation de quelques objets
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.changeEmail("nouvelemail@example.com");

        Administrateur admin = new Administrateur();
        admin.ajouterFormation("Formation1");

        Formation formation = new Formation();
        formation.ajouterModule("Module1");

        Module module = new Module();
        module.ajouterChapitre("Chapitre1");

        Chapitre chapitre = new Chapitre();
        chapitre.ajouterLecon("Leçon1");

        System.out.println("Exécution terminée.");
    }
}
