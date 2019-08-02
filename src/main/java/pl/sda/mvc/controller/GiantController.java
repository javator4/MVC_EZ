package pl.sda.mvc.controller;

import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.model.Nourishment;
import pl.sda.mvc.view.GiantView;

import java.util.List;

public class GiantController {

    private List<GiantModel> models;
    private GiantView view;

    public GiantController(List<GiantModel> models, GiantView view) {
        this.models = models;
        this.view = view;
    }

    public Health getHealth(int i) {
        return models.get(i).getHealth();
    }

    public void setHealth(Health health, int i) {
        models.get(i).setHealth(health);
    }

    public Fatigue getFatigue(int i) {
        return models.get(i).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int i) {
        models.get(i).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int i) {
        return models.get(i).getNourishment();
    }

    public void setNourishment(Nourishment nourishment, int i) {
        models.get(i).setNourishment(nourishment);
    }

    public String getName(int i) {
        return models.get(i).getName();
    }

    public void setName(String name, int i) {
        models.get(i).setName(name);
    }

    public void updateView() {
        view.displayGiant(models);
    }
}
