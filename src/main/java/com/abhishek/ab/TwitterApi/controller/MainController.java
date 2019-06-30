package com.abhishek.ab.TwitterApi.controller;

import com.abhishek.ab.TwitterApi.dao.DaoTwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import twitter4j.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    DaoTwitterService daoTwitterService ;



    @PostMapping("/twitter/{message}")
    public void writeMessage(@PathVariable String message) throws TwitterException {
        System.out.println(daoTwitterService.createTweet(message));
    }

    @GetMapping("/twitter/user/{handle}")
    public User getUserDetail(@PathVariable String handle) throws TwitterException {
        return daoTwitterService.showUser(handle) ;
    }

    @GetMapping("/twitter/user/home")
    public List<String> UserTimeline() throws TwitterException{
        return daoTwitterService.getHomeTimeline();
    }
}
