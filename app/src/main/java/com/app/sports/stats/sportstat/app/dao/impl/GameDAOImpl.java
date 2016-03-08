package com.app.sports.stats.sportstat.app.dao.impl;

import com.app.sports.stats.sportstat.app.backendlessObjects.Game;
import com.app.sports.stats.sportstat.app.backendlessObjects.Team;
import com.app.sports.stats.sportstat.app.dao.GameDAO;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class GameDAOImpl implements GameDAO {
    @Override
    public int createGame(Game game) {
        return 0;
    }

    @Override
    public int deleteGame(Game game) {
        return 0;
    }

    @Override
    public int updateGame(Game game) {
        return 0;
    }

    @Override
    public Game getGameById(int gameId) {
        return null;
    }

    @Override
    public ArrayList<Game> getAllGames() {
        return null;
    }

    @Override
    public ArrayList<Game> getAllGamesByTeam(Team team) {
        return null;
    }
}
