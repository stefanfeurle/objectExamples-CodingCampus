package com.company;

public class Objektiv {

    String modell;
    int brennweiteMin = 0;
    int brennweiteMax = 0;

    public String getModell() {
        return modell;
    }

    public Objektiv(int brennweiteMin, int brennweiteMax) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    @Override
    public String toString() {
        return modell;
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }
    public String getBrennweiteVonBis () {
        String output = brennweiteMin + " bis " + brennweiteMax + " mm";
        return output;
    }
}
