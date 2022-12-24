package uz.bakhromjon.dependencyinjectionbestpractices.controllers.bestPractices;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import uz.bakhromjon.dependencyinjectionbestpractices.services.BpService;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RequiredArgsConstructor
@RestController
public class BpFinalConstructorController {
    private final BpService bpService;

    public String saySomething() {
        return bpService.getHello();
    }
}

