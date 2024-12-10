package org.example;

public class User {
    private String username;
    private String password;
    private boolean loggedIn; // Indicateur de connexion
public User(){
    super();
}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false; // Par défaut, l'utilisateur n'est pas connecté
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void login(String username, String password ) {
    System.out.println("Utilisateur connecté");
    this.loggedIn = true; // L'utilisateur se connecte
    }

    public void logout() {
        this.loggedIn = false; // L'utilisateur se déconnecte
    }
}
