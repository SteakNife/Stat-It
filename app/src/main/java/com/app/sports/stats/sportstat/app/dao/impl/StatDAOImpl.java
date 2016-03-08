package com.app.sports.stats.sportstat.app.dao.impl;

import com.app.sports.stats.sportstat.app.backendlessObjects.Game;
import com.app.sports.stats.sportstat.app.backendlessObjects.Player;
import com.app.sports.stats.sportstat.app.backendlessObjects.Stat;
import com.app.sports.stats.sportstat.app.backendlessObjects.Team;
import com.app.sports.stats.sportstat.app.dao.StatDAO;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class StatDAOImpl implements StatDAO {
    @Override
    public int createStat(Stat stat) {
        return 0;
    }

    @Override
    public int deleteStat(Stat stat) {
        return 0;
    }

    @Override
    public int updateStat(Stat stat) {
        return 0;
    }

    @Override
    public ArrayList<Stat> getAllStatsByTeam(Team team) {
        return null;
    }

    @Override
    public ArrayList<Stat> getAllStatsByGame(Game game) {
        return null;
    }

    @Override
    public ArrayList<Stat> getAllStatsByPlayer(Player player) {
        return null;
    }
}
