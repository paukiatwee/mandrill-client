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
public class Stat {
    
    private int sent;
    private int hardBounces;
    private int softBounces;
    private int rejects;
    private int complaints;
    private int unsubs;
    private int opens;
    private int uniqueOpens;
    private int clicks;
    private int uniqueClicks;

    public int getSent() {
        return sent;
    }

    public void setSent(int sent) {
        this.sent = sent;
    }

    public int getHardBounces() {
        return hardBounces;
    }

    @JsonProperty(value = "hard_bounces")
    public void setHardBounces(int hardBounces) {
        this.hardBounces = hardBounces;
    }

    public int getSoftBounces() {
        return softBounces;
    }

    @JsonProperty(value = "soft_bounces")
    public void setSoftBounces(int softBounces) {
        this.softBounces = softBounces;
    }

    public int getRejects() {
        return rejects;
    }

    public void setRejects(int rejects) {
        this.rejects = rejects;
    }

    public int getComplaints() {
        return complaints;
    }

    public void setComplaints(int complaints) {
        this.complaints = complaints;
    }

    public int getUnsubs() {
        return unsubs;
    }

    public void setUnsubs(int unsubs) {
        this.unsubs = unsubs;
    }

    public int getOpens() {
        return opens;
    }

    public void setOpens(int opens) {
        this.opens = opens;
    }

    public int getUniqueOpens() {
        return uniqueOpens;
    }

    @JsonProperty(value = "unique_opens")
    public void setUniqueOpens(int uniqueOpens) {
        this.uniqueOpens = uniqueOpens;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getUniqueClicks() {
        return uniqueClicks;
    }

    @JsonProperty(value = "unique_clicks")
    public void setUniqueClicks(int uniqueClicks) {
        this.uniqueClicks = uniqueClicks;
    }
}
