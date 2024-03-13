package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class AnimalsCage {
    private Animal animal;
    private Timer time;

    @Autowired
    public AnimalsCage(@Qualifier("dogBean") Animal animal, Timer time) {
        this.animal = animal;
        this.time = time;
    }
    public Timer getTimer() {
        return time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println(time.getTime());
        System.out.println("________________________");

    }
}
