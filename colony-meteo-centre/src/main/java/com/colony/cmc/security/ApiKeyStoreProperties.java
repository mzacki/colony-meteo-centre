package com.colony.cmc.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "yaml")
@PropertySource(value = "/topsecret/store.yaml", factory = ApiKeyStoreFactory.class)
public class ApiKeyStoreProperties {

    private Owm owm;

    public static class Owm {

        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

    public Owm getOwm() {
        return owm;
    }

    public void setOwm(Owm owm) {
        this.owm = owm;
    }
}
