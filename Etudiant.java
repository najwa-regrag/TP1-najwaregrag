public class Etudiant {
    // Attributs
    private String nom;
    private String prenom;
    private int age;
    private String matricule;
    private String filiere;
    
    // Constructeur
    public Etudiant(String nom, String prenom, int age, String matricule, String filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.matricule = matricule;
        this.filiere = filiere;
    }
    
    // Getters
    public String getNom() {
        return nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getMatricule() {
        return matricule;
    }
    
    public String getFiliere() {
        return filiere;
    }
    
    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    
    // Méthode pour afficher les informations
    public void afficherInfo() {
        System.out.println("=== Informations de l'étudiant ===");
        System.out.println("Matricule: " + matricule);
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Âge: " + age + " ans");
        System.out.println("Filière: " + filiere);
        System.out.println("==================================");
    }
    
    // Méthode pour étudier
    public void etudier() {
        System.out.println(nom + " " + prenom + " est en train d'étudier... 📚");
    }
    
    // Méthode pour passer un examen
    public void passerExamen(String matiere) {
        System.out.println(nom + " " + prenom + " passe l'examen de " + matiere + " 📝");
    }
    
    // Main method pour tester
    public static void main(String[] args) {
        // Créer un étudiant
        Etudiant etudiant1 = new Etudiant("El Amrani", "Youssef", 20, "E2025001", "Informatique");
        
        // Afficher ses informations
        etudiant1.afficherInfo();
        
        // Faire des actions
        etudiant1.etudier();
        etudiant1.passerExamen("Programmation Java");
        
        System.out.println("\n--- Modifier les informations ---");
        
        // Modifier les informations
        etudiant1.setAge(21);
        etudiant1.setFiliere("Génie Logiciel");
        
        // Afficher les nouvelles informations
        etudiant1.afficherInfo();
    }
}