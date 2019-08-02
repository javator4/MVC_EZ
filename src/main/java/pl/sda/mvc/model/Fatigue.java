package pl.sda.mvc.model;

public enum Fatigue {
    TIRED("tired"),
    NOTTIRED("not tired"),
    SLEEPING("sleeping");

    private String title;

    Fatigue(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
