package pl.sda.mvc.model;

public enum Nourishment {
    HUNGRY ("hungry"),
    NOTHUNGRY ("not hungry");

    private String title;

    Nourishment(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
