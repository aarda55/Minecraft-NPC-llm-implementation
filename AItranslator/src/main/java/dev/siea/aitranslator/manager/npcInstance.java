package dev.siea.aitranslator.manager;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.Inventory;

public class npcInstance {
    private String name;
    private int age;
    private Location loc;
    private Inventory inv;
    private int health;
    private int foodLevel;
    private GameMode gameMode;
    private String playerSkin;
    private String id;

    public npcInstance(String name, int age, Location loc, Inventory inv, int health, int foodLevel, GameMode gameMode, String playerSkin, String id) {
        this.name = name;
        this.age = age;
        this.loc = loc;
        this.inv = inv;
        this.health = health;
        this.foodLevel = foodLevel;
        this.gameMode = gameMode;
        this.playerSkin = playerSkin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public String getPlayerSkin() {
        return playerSkin;
    }

    public void setPlayerSkin(String playerSkin) {
        this.playerSkin = playerSkin;
    }
}
