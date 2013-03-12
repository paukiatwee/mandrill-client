/*
 * 
 * 
 */
package me.dreamand.mandrill.messages;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @since 1.0.0
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {
    
    private String email;
    private String status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
