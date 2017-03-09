package com.eightbitplatoon.jhipster.test.cucumber.stepdefs;

import com.eightbitplatoon.jhipster.test.MyAppAngular2App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MyAppAngular2App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
