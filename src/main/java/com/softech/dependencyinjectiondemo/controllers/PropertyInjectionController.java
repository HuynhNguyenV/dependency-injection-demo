package com.softech.dependencyinjectiondemo.controllers;

import com.softech.dependencyinjectiondemo.services.GreetingServiceImpl;

public class PropertyInjectionController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
