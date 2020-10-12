package com.colony.cmc.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "yaml")
@PropertySource(value = "/topsecret/store.yaml", factory = ApiKeyStoreFactory.class)
public class ApiKeyStoreProperties {

    private Acw acw;
    private Owm owm;
    private Wts wts;

    public static class Acw {

        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

    public static class Owm {

        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

    }

    public static class Wts {

        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

    public Acw getAcw() {
        return acw;
    }

    public void setAcw(Acw acw) {
        this.acw = acw;
    }

    public Owm getOwm() {
        return owm;
    }

    public void setOwm(Owm owm) {
        this.owm = owm;
    }

    public Wts getWts() {
        return wts;
    }

    public void setWts(Wts wts) {
        this.wts = wts;
    }
}
