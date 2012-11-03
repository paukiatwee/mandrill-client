/*
 * 
 * 
 */
package me.dreamand.mandrill.messages;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * 
 * @since 1.0.0
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 */
public class DefaultMessageService implements MessageService {

    private Client client;
    private WebResource r;
    private String key;

    public DefaultMessageService() {
        ClientConfig config = new DefaultClientConfig();
        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        client = Client.create(config);
        r = client.resource("https://mandrillapp.com/api/1.0/");
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public List<Status> send(Message message) {
        try {
            Map<String, Object> values = new HashMap<String, Object>();
            values.put("key", key);
            values.put("message", message);
            values.put("async", Boolean.FALSE);
            String json = new ObjectMapper().writeValueAsString(values);
            String result = r.path("/messages/send.json").type(MediaType.APPLICATION_JSON).post(String.class, json);
            return new ObjectMapper().readValue(result, new TypeReference<List<Status>>() {});
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public void sendViaTemplate(String name, List<Content> contents, Message message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
