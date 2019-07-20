package pl.sda.mvc.model;

public enum Fatigue {
    TIRED("tired"),
    NOTTIRED("nottired"),
    SLEEPING("sleeping");

    private String title;

    Fatigue(String title) {
        this.title = title;
    }
}
