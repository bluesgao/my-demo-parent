package com.gx;

import com.gx.demo.rule.WeatherRule;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

/**
 * Copyright (C), 2011-2018 {company}
 * FileName: com.gx.RuleTest.java
 * Author: gaoxin
 * Email: gaoxin11@jd.com
 * Date: 2018/1/5 12:25
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * {xxx}   12:25    1.0          Create
 */

public class RuleTest {
    public static void main(String[] args) {
        Facts facts = new Facts();
        facts.put("rain", true);

        Rules rules = new Rules();
        rules.register(new WeatherRule());

        RulesEngine rulesEngine = new DefaultRulesEngine();
        rulesEngine.fire(rules, facts);
    }
}
