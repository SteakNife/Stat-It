package com.app.sports.stats.sportstat.app.dao;

import com.app.sports.stats.sportstat.app.backendlessObjects.Game;
import com.app.sports.stats.sportstat.app.backendlessObjects.Player;
import com.app.sports.stats.sportstat.app.backendlessObjects.Stat;
import com.app.sports.stats.sportstat.app.backendlessObjects.Team;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public interface StatDAO {

    public int createStat (Stat stat);
    public int deleteStat (Stat stat);
    public int updateStat (Stat stat);

    public ArrayList<Stat> getAllStatsByTeam (Team team);
    public ArrayList<Stat> getAllStatsByGame (Game game);
    public ArrayList<Stat> getAllStatsByPlayer (Player player);
}
