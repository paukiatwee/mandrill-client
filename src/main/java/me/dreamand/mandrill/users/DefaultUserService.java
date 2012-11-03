/*
 * 
 * 
 */
package me.dreamand.mandrill.users;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @since 1.0.0
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 */
public class DefaultUserService implements UserService {
    
    private Client client;
    private WebResource r;

    public DefaultUserService() {
        ClientConfig config = new DefaultClientConfig();
        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        client = Client.create(config);
        r = client.resource("https://mandrillapp.com/api/1.0/");
    }
    
    @Override
    public User info(String key) {
        User result = r.path("/users/info.json").queryParam("key", key).accept(MediaType.APPLICATION_JSON).post(User.class);
        return result;
    }
}
