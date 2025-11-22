package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component
public class FrechChef implements Chef {

    public FrechChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe(){
        return "Preparez un Beof";
    }
}
