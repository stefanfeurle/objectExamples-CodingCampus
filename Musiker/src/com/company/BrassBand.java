package com.company;

public class BrassBand extends Band{
    private Conductor conductor;

    public BrassBand(String name) {
        super(name);
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
