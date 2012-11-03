/*
 * 
 * 
 */
package me.dreamand.mandrill.messages;

import java.util.List;

/**
 * 
 * @since 1.0.0
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 */
public interface MessageService {
    
    /**
     * Set the API key for the service calls
     * @param key a Valid API key
     */
    void setKey(String key);
    
    /**
     * Send a new transactional message through Mandrill
     * @param message to be send
     */
    List<Status> send(Message message);
    
    /**
     * Send a new transactional message through Mandrill using a template
     * @param message to be send
     */
    void sendViaTemplate(String name, List<Content> contents, Message message);
    
}
