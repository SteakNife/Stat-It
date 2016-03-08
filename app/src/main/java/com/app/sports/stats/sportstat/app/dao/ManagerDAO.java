package com.app.sports.stats.sportstat.app.dao;

import com.app.sports.stats.sportstat.app.backendlessObjects.Manager;
import com.app.sports.stats.sportstat.app.backendlessObjects.Team;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public interface ManagerDAO {

    public int createManager (Manager manager);
    public int deleteManager (Manager manager);
    public int updateManager (Manager manager);

    public Manager getManagerById (int managerId);
    public Manager getManagerByName (String managerName);

    public ArrayList<Manager> getManagersByTeam (Team team);
    public ArrayList<Manager> getAllManagers ();
}
