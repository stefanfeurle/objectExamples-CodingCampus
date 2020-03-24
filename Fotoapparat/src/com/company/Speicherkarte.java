package com.company;

public class  Speicherkarte{
    String marke;
    int speicherkartengroesse;
    int zaehleFoto;



    public int zaehleFoto(){
        zaehleFoto++;
        return zaehleFoto;
    }
    public void delete(){
       if(zaehleFoto > 0) {
           zaehleFoto--;
       }
    }

    public int verfuegbarerSpeicherplatz(){
        return speicherkartengroesse  - zaehleFoto * 5;
    }


    public int getSpeicherkartengroesse() {
        return speicherkartengroesse;
    }

    public void setSpeicherkartengroesse(int speicherkartengroesse) {
        this.speicherkartengroesse = speicherkartengroesse;
    }


    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
}
