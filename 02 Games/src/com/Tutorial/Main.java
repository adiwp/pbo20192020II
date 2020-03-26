package com.Tutorial;

public class Main{
    public static void main(String[] args) {
        // membuat object player
        Player player1 = new Player("ucup",100.00);
        Player player2 = new Player("otong",50.00);

        // membuat object weapon
        Weapon pedang = new Weapon("pedang",15.00);
        Weapon keris = new Weapon("keris",10.00);

        // membuat object armor
        Armor bajuBesi = new Armor("baju besi",12.00);
        Armor lurik = new Armor("lurik",5.00);
        
        // player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player 2
        player2.equipWeapon(keris);
        player2.equipArmor(lurik);
        player2.display();

        System.out.println("\nPERTEMPURAAAN");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();

        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();

        System.out.println("\nEpisode - 3\n");
        player2.attack(player1);
        player1.display();
        player2.display();

        System.out.println("\nEpisode - 4\n");
        player2.attack(player1);
        player1.display();
        player2.display();

        System.out.println("\nEpisode - 5\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}