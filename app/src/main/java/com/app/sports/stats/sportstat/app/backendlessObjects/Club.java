package com.app.sports.stats.sportstat.app.backendlessObjects;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class Club {

    private int id;
    private String clubName;
    private ArrayList<Team> teams;

    public Club() {
        teams = new ArrayList<Team>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
}
