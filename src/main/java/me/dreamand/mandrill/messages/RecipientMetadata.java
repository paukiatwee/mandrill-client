/*
 * 
 * 
 */
package me.dreamand.mandrill.messages;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @since 1.0.0
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 */
public class RecipientMetadata {
    
    private String rcpt;
    private List<String> values = new ArrayList<String>();

    public String getRcpt() {
        return rcpt;
    }

    public void setRcpt(String rcpt) {
        this.rcpt = rcpt;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
