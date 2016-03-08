package com.app.sports.stats.sportstat.app.dao.impl;

import com.app.sports.stats.sportstat.app.backendlessObjects.Player;
import com.app.sports.stats.sportstat.app.backendlessObjects.Team;
import com.app.sports.stats.sportstat.app.dao.PlayerDAO;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class PlayerDAOImpl implements PlayerDAO {
    @Override
    public int createPlayer(Player player) {
        return 0;
    }

    @Override
    public int deletePlayer(Player player) {
        return 0;
    }

    @Override
    public int updatePlayer(Player player) {
        return 0;
    }

    @Override
    public Player getPlayerById(int playerId) {
        return null;
    }

    @Override
    public Player getPlayerByName(String playerName) {
        return null;
    }

    @Override
    public ArrayList<Player> getAllPlayersByTeam(Team team) {
        return null;
    }
}
