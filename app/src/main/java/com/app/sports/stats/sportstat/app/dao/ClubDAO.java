package com.app.sports.stats.sportstat.app.dao;

import com.app.sports.stats.sportstat.app.backendlessObjects.Club;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public interface ClubDAO {

    public int createClub (Club club);
    public int deleteClub (Club club);
    public int updateClub (Club club);

    public Club getClubById (int clubId);
    public Club getClubByName (String clubName);

    public ArrayList<Club> getAllClubs ();

}
