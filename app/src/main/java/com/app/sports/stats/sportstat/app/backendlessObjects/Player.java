package com.app.sports.stats.sportstat.app.backendlessObjects;

import java.util.ArrayList;

/**
 * Created by Padraic Cashin on 25/02/2016.
 */

public class Player {

    private int id;
    private String playerName;

    private ArrayList<Stat> stats;

    public Player() {
        stats = new ArrayList<Stat>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public ArrayList<Stat> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Stat> stats) {
        this.stats = stats;
    }
}
