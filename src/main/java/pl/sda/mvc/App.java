package pl.sda.mvc;

import pl.sda.mvc.controller.GiantController;
import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.model.Nourishment;
import pl.sda.mvc.view.GiantView;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        GiantModel Francesco = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY, "Franceso");
        GiantModel Romeo = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.NOTHUNGRY, "Romeo");
        GiantModel Marco = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.HUNGRY, "Marco");
        GiantModel Roberto = new GiantModel(Health.DEAD, Fatigue.NOTTIRED, Nourishment.NOTHUNGRY, "Roberto");

        List<GiantModel> models = new ArrayList<>();
        models.add(Francesco);
        models.add(Romeo);
        models.add(Marco);
        models.add(Roberto);

        GiantView view = new GiantView();

        GiantController controller = new GiantController(models, view);

        controller.updateView();
        controller.setHealth(Health.DEAD, 0);
        controller.updateView();
        controller.setFatigue(Fatigue.SLEEPING, 1);
        controller.updateView();

    }

}
