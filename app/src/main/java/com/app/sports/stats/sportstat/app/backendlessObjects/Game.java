package com.app.sports.stats.sportstat.app.backendlessObjects;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class Game {

    private int id;
    private Team firstTeam;
    private Team secondTeam;

    private ArrayList<Stat> stats;

    public Game() {
        stats = new ArrayList<Stat>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(Team firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(Team secondTeam) {
        this.secondTeam = secondTeam;
    }

    public ArrayList<Stat> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Stat> stats) {
        this.stats = stats;
    }
}
