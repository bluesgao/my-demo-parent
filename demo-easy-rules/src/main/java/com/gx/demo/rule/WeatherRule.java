package com.gx.demo.rule;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name="WeatherRule", description = "if it rains then take an umbrella")
public class WeatherRule {
    @Condition
    public boolean isRains(@Fact("rain") boolean rain){
        return rain;
    }

    @Action
    public void takeAnUmbrella(){
        System.out.println("It rains, take an umbrella.");
    }
}
