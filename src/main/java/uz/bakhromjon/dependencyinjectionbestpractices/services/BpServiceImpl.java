package uz.bakhromjon.dependencyinjectionbestpractices.services;

import org.springframework.stereotype.Service;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class BpServiceImpl implements BpService {
    @Override
    public String getHello() {
        return "The Best Hello!";
    }
}