package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MexicanChef implements Chef {
    public MexicanChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyRecipe(){
        return "Preparo tacos";
    }
}
