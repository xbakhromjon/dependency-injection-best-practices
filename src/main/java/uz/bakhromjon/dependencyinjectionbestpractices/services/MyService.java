package uz.bakhromjon.dependencyinjectionbestpractices.services;
/**
 * @author : Bakhromjon Khasanboyev
 **/

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String getHello() {
        return "Hello";
    }
}