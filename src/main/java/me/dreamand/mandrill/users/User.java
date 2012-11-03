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
public class User {
    
    private String username;
    private String createdAt;
    private String publicId;
    private int reputation;
    private int hourlyQuota;
    private int backlog;
    private Stats stats;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(value = "created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    public String getPublicId() {
        return publicId;
    }

    @JsonProperty(value = "public_id")
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getHourlyQuota() {
        return hourlyQuota;
    }

    @JsonProperty(value = "hourly_quota")
    public void setHourlyQuota(int hourlyQuota) {
        this.hourlyQuota = hourlyQuota;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
