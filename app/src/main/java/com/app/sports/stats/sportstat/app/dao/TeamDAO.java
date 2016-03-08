package com.app.sports.stats.sportstat.app.dao;

import com.app.sports.stats.sportstat.app.backendlessObjects.Team;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public interface TeamDAO {

    public int createTeam (Team team);
    public int deleteTeam (Team team);
    public int updateTeam (Team team);

    public Team getTeamById (int teamId);
    public Team getTeamByName (String teamName);
    public ArrayList<Team> getAllTeams ();
}
