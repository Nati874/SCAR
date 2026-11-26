package main.java.com.scar.model;

import java.time.LocalDate;

public class Equipment {
    private String name;
    private String model;
    private String type;
    private boolean isFunctional;
    private LocalDate importDate;

    public Equipment(String name, String model, String type, boolean isFunctional, LocalDate importDate){
        this.name = name;
        this.model = model;
        this.type = type;
        this.isFunctional = isFunctional;
        this.importDate = importDate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public boolean isFunctional() {
        return isFunctional;
    }

    public LocalDate getImportDate() {
        return importDate;
    }
}
