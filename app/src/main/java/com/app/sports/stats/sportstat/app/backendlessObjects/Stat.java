package com.app.sports.stats.sportstat.app.backendlessObjects;

/**
 * Created by emoibmo on 08/03/2016.
 */
public class Stat {

    private int id;
    private String value;
    private StatType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StatType getType() {
        return type;
    }

    public void setType(StatType type) {
        this.type = type;
    }
}
