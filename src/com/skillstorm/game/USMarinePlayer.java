package com.skillstorm.game;
import java.util.Random;

public class USMarinePlayer extends Player {
    private int combatExperience;
    private int ammo;

    public USMarinePlayer(String name, int health, int supplies, int gold, int combatExperience, int ammo) {
        super(name, health, supplies, gold);
        this.combatExperience = combatExperience;
        this.ammo = ammo;
    }

    public USMarinePlayer() {
        super("Marine", 90, 60, 40);
        Random random = new Random();
        combatExperience = random.nextInt(50) + 50;
        ammo = random.nextInt(50);
    }

    public int getCombatExperience() {
        return combatExperience;
    }

    public int getAmmo() {
        return ammo;
    }

    public void increaseCombatExperience(int amount) {
        combatExperience += amount;
        if (combatExperience > 100) {
            combatExperience = 100;
        }
    }

    public void decreaseCombatExperience(int amount) {
        combatExperience -= amount;
        if (combatExperience < 0) {
            combatExperience = 0;
        }
    }

    public void increaseAmmo(int amount) {
        ammo += amount;
        if (ammo > 100) {
            ammo = 100;
        }
    }

    public void decreaseAmmo(int amount) {
        ammo -= amount;
        if (ammo < 0) {
            ammo = 0;
        }
    }
}