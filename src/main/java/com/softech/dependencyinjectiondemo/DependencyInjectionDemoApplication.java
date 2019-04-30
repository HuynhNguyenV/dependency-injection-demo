package com.softech.dependencyinjectiondemo;

import com.softech.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import com.softech.dependencyinjectiondemo.controllers.GetterInjectedController;
import com.softech.dependencyinjectiondemo.controllers.MyController;
import com.softech.dependencyinjectiondemo.controllers.PropertyInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(context.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(context.getBean(GetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());

    }

}
