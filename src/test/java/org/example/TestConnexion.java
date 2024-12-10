package org.example;

import org.junit.jupiter.api.Test;

public class TestConnexion {
    @Test
    public void connexion (){
        User user= new User();
        user.login("syrine", "syrine123");
    }
}
