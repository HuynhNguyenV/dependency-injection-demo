package com.softech.dependencyinjectiondemo.controllers;

import com.softech.dependencyinjectiondemo.services.GreetingService;

public class GetterInjectedController {
    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
