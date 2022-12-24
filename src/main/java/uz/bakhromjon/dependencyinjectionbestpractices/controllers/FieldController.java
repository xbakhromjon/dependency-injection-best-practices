package uz.bakhromjon.dependencyinjectionbestpractices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import uz.bakhromjon.dependencyinjectionbestpractices.services.MyService;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
public class FieldController {

    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public String saySomething() {
        return myService.getHello();
    }
}