package com.app.sports.stats.sportstat.app.dao.impl;

import com.app.sports.stats.sportstat.app.backendlessObjects.Manager;
import com.app.sports.stats.sportstat.app.backendlessObjects.Team;
import com.app.sports.stats.sportstat.app.dao.ManagerDAO;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class ManagerDAOImpl implements ManagerDAO {
    @Override
    public int createManager(Manager manager) {
        return 0;
    }

    @Override
    public int deleteManager(Manager manager) {
        return 0;
    }

    @Override
    public int updateManager(Manager manager) {
        return 0;
    }

    @Override
    public Manager getManagerById(int managerId) {
        return null;
    }

    @Override
    public Manager getManagerByName(String managerName) {
        return null;
    }

    @Override
    public ArrayList<Manager> getManagersByTeam(Team team) {
        return null;
    }

    @Override
    public ArrayList<Manager> getAllManagers() {
        return null;
    }
}
