package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HavingSuperAbility[] heroes = {new Magic(), new Madic(), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("");
        }

    }
}
