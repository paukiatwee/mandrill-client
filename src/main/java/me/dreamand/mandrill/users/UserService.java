/*
 * 
 * 
 */
package me.dreamand.mandrill.users;

/**
 * 
 * @since 1.0.0
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 */
public interface UserService {
    
    /**
     * Return the information about the API-connected user
     * @param key the API key
     * @return connected user
     */
    User info(String key);
    
}
