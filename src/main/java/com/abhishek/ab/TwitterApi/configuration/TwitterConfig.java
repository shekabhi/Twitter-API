package com.abhishek.ab.TwitterApi.configuration;
import org.springframework.stereotype.Component;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class TwitterConfig {


   public static ConfigurationBuilder cb = new ConfigurationBuilder();

    public ConfigurationBuilder getCb() {

        return cb;
    }

    public static void setCb(ConfigurationBuilder cb) {
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("cOBP26k1PqGdw9XZOkiFjBihW") ;
        cb.setOAuthConsumerSecret("xU46oVqUyQm1qzQy4hCqQUBb1IR4ItoCVeLcacncVizPI6EzHs");
        cb.setOAuthAccessToken("1144937201777573888-m9AeFrP43rzYOv1KbsdlpPG8FsbNlL");
        cb.setOAuthAccessTokenSecret("JSzqw0lTD0qh74IMQlwKmWVgnIORkjHD75BV2c7m7Akhg");
    }

    public static TwitterFactory tf = new TwitterFactory(cb.build());
    public static Twitter twitter = tf.getInstance();

}
