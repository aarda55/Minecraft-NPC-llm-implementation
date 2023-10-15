package dev.siea.aitranslator.manager;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;

public class npcManager {
    private HashMap<String, npcInstance> instances = new HashMap<>();
    public npcManager() {
        loadNPCS();
    }
    public void loadNPCS() {
        //load npcs from saved files // (database)
    }

    public npcInstance createNPC(String name, int age, Location loc, Inventory inv, int health, int foodLevel, GameMode gameMode, String playerSkin){
        String id = ""; //Generate unique identifier
        npcInstance npc = new npcInstance(name, age, loc, inv, health, foodLevel, gameMode, playerSkin, id);
        instances.put(id, npc);
        return npc;
    }

    public npcInstance getNPC(String id){
        return instances.get(id);
    }


}
