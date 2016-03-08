package com.app.sports.stats.sportstat.app.dao.impl;

import com.app.sports.stats.sportstat.app.backendlessObjects.Club;
import com.app.sports.stats.sportstat.app.dao.ClubDAO;
import com.backendless.Backendless;
import com.backendless.BackendlessCollection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class ClubDAOImpl implements ClubDAO {
    @Override
    public int createClub(Club club) {
        return 0;
    }

    @Override
    public int deleteClub(Club club) {
        return 0;
    }

    @Override
    public int updateClub(Club club) {
        return 0;
    }

    @Override
    public Club getClubById(int clubId) {
        return null;
    }

    @Override
    public Club getClubByName(String clubName) {
        return null;
    }

    @Override
    public ArrayList<Club> getAllClubs() {

        ArrayList<Club> clubs = new ArrayList<Club>();
        BackendlessCollection<Club> result = Backendless.Persistence.of( Club.class ).find();

        Iterator<Club> iterator = result.getCurrentPage().iterator();
        while (iterator.hasNext()) {
            Club club = iterator.next();
            clubs.add(club);
        }
        return clubs;
    }
}
