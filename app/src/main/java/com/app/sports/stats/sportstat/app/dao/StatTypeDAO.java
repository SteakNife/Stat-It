package com.app.sports.stats.sportstat.app.dao;

import com.app.sports.stats.sportstat.app.backendlessObjects.StatType;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public interface StatTypeDAO {

    public int createStatType (StatType statType);
    public int deleteStatType (StatType statType);
    public int updateStatType (StatType statType);

    public ArrayList<StatType> getAllStatTypes ();

}
