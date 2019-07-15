package com.stackroute.springannotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    @Autowired
    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void actorInformation(){
        actor.actorInfo();

    }

}
