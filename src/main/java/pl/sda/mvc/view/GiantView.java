package pl.sda.mvc.view;

import pl.sda.mvc.model.GiantModel;

import java.util.List;

public class GiantView {

    public void displayGiant(List<GiantModel> models) {
        System.out.println("Let's look around...");
        for (int i = 0; i < models.size(); i++) {
            System.out.println(models.get(i));
        }
    }

}

