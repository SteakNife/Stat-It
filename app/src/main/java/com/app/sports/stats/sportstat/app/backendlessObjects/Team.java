package com.app.sports.stats.sportstat.app.backendlessObjects;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class Team {

    private int id;
    private String teamName;
    private ArrayList<Player> players;
    private ArrayList<Manager> managers;
    private ArrayList<Stat> stats;

    public Team() {
        players = new ArrayList<Player>();
        managers = new ArrayList<Manager>();
        stats = new ArrayList<Stat>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<Stat> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Stat> stats) {
        this.stats = stats;
    }
}
