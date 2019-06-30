package com.abhishek.ab.TwitterApi.dao;

import com.abhishek.ab.TwitterApi.configuration.TwitterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.User;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DaoTwitterService {

    @Autowired
    TwitterConfig twitterConfig ;

    public String createTweet(String message) throws TwitterException {

        Status status = twitterConfig.twitter.updateStatus(message);
        System.out.println(status.getText());
        return status.getText();
    }

    public User showUser(String handle) throws TwitterException {

        User user = twitterConfig.twitter.showUser(handle);
        return user;
    }

    public List<String> getHomeTimeline() throws TwitterException {
        return twitterConfig.twitter.getHomeTimeline().stream()
                .map(item -> item.getText())
                .collect(Collectors.toList());
    }
}
