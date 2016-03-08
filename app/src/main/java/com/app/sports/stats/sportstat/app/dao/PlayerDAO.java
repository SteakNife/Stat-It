package com.app.sports.stats.sportstat.app.dao;

import com.app.sports.stats.sportstat.app.backendlessObjects.Player;
import com.app.sports.stats.sportstat.app.backendlessObjects.Team;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public interface PlayerDAO {

    public int createPlayer (Player player);
    public int deletePlayer (Player player);
    public int updatePlayer (Player player);

    public Player getPlayerById (int playerId);
    public Player getPlayerByName (String playerName);

    public ArrayList<Player> getAllPlayersByTeam (Team team);
}
