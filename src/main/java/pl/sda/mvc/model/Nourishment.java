package pl.sda.mvc.model;

public enum Nourishment {
    HUNGRY ("hungry"),
    NOTHUNGRY ("nothungry");

    private String tittle;

    Nourishment(String tittle){
        this.tittle = tittle;
    }
}
