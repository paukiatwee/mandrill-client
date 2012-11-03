/*
 * 
 * 
 */
package me.dreamand.mandrill.users;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 * @since 1.0.0
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 */
public class Stats {
    
    private Stat today;
    private Stat last7Days;
    private Stat last30Days;
    private Stat last60Days;
    private Stat last90Days;
    private Stat allTime;

    public Stat getToday() {
        return today;
    }

    public void setToday(Stat today) {
        this.today = today;
    }

    public Stat getLast7Days() {
        return last7Days;
    }

    @JsonProperty(value = "last_7_days")
    public void setLast7Days(Stat last7Days) {
        this.last7Days = last7Days;
    }

    public Stat getLast30Days() {
        return last30Days;
    }

    @JsonProperty(value = "last_30_days")
    public void setLast30Days(Stat last30Days) {
        this.last30Days = last30Days;
    }

    public Stat getLast60Days() {
        return last60Days;
    }

    @JsonProperty(value = "last_60_days")
    public void setLast60Days(Stat last60Days) {
        this.last60Days = last60Days;
    }

    public Stat getLast90Days() {
        return last90Days;
    }

    @JsonProperty(value = "last_90_days")
    public void setLast90Days(Stat last90Days) {
        this.last90Days = last90Days;
    }

    public Stat getAllTime() {
        return allTime;
    }

    @JsonProperty(value = "all_time")
    public void setAllTime(Stat allTime) {
        this.allTime = allTime;
    }
}
