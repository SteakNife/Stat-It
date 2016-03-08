package com.app.sports.stats.sportstat.app.dao;

import com.app.sports.stats.sportstat.app.backendlessObjects.Game;
import com.app.sports.stats.sportstat.app.backendlessObjects.Team;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public interface GameDAO {

    public int createGame (Game game);
    public int deleteGame (Game game);
    public int updateGame (Game game);

    public Game getGameById (int gameId);

    public ArrayList<Game> getAllGames ();
    public ArrayList<Game> getAllGamesByTeam (Team team);
}
