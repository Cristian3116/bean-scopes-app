package pixel.academy.setter_injection_app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.setter_injection_app.common.Chef;


@RestController
public class DemoController {

    private Chef myChef;
    private Chef secondChef;

    @Autowired
    public DemoController(
            @Qualifier("frechChef") Chef theChef,
            @Qualifier("frechChef") Chef theSecondChef) {
        System.out.println("In Constructor:" + getClass().getSimpleName());
        myChef = theChef;
        secondChef = theSecondChef;
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myChef == secondChef, " + (myChef == secondChef);
    }



    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}
