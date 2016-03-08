package com.app.sports.stats.sportstat.app.dao;

import com.app.sports.stats.sportstat.app.backendlessObjects.User;

import java.util.ArrayList;

/**
 * Created by emoibmo on 08/03/2016.
 */
public interface UserDAO {

    public int createUser (User user);
    public int deleteUser (User user);
    public int updateUser (User user);

    public User getUserById (User user);
    public ArrayList<User> getAllUsers ();

}
