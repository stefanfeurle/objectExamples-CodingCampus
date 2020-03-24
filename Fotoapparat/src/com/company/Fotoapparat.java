package com.company;

public class Fotoapparat {
    String marke;
    String modell;
    String herkunftsland;
    double megapixel;
    int gewicht;


    Speicherkarte speicherkarte;

    public Speicherkarte getSpeicherkarte() {
        return speicherkarte;
    }

    public void setSpeicherkarte(Speicherkarte speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    Objektiv objektiv;

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    Person person;


    public void machFoto() {
        if (this.speicherkarte.verfuegbarerSpeicherplatz() >= 5) {
            this.speicherkarte.zaehleFoto();
            System.out.println("Klick");
            if (this.speicherkarte.verfuegbarerSpeicherplatz() < 50) {
                int verfuegbarerSpeicherplatzProzent = (this.speicherkarte.speicherkartengroesse - this.speicherkarte.verfuegbarerSpeicherplatz()) * 100 / this.speicherkarte.speicherkartengroesse;
                System.out.println("Der Speicherplatz ist zu " + verfuegbarerSpeicherplatzProzent + " % belegt!");
            }
            System.out.println();
        }
        else {
            System.out.println("Die Speicherkarte ist voll, es können keine Bilder mehr gespeichert werden! \n( Speicherkarte wechseln oder Bilder löschen )\n");
        }
    }

    public void filmen() {
        System.out.println(("F i l m   l ä u f t    F i l m   l ä u f t    F i l m   l ä u f t    F i l m   l ä u f t    \n"));
    }

    public void zoomen() {
        System.out.println(" Z O O M \n");
    }
    public String getProduktblatt() {
       //System.out.println( "Marke:         \t\t" + this.marke);
        String output     = "Marke:         \t\t" + this.marke;
        output = output + "\nModell:        \t\t" + this.modell;
        output = output + "\nHerkunftsland: \t\t" + this.herkunftsland;
        output = output + "\nBesitzer:      \t\t" + this.person.firstName + " " + this.person.lastName;
        output = output + "\nMax. Auflösung:\t\t" + this.megapixel + " Megapixel";
        output += "\nObjektiv:      \t\t" + this.objektiv.modell;
        output = output + "\nBrennweite min:\t\t" + this.objektiv.brennweiteMin + " mm";
        output = output + "\nBrennweite max:\t\t" + this.objektiv.brennweiteMax + " mm";
        output = output + "\nSpeicherkarte: \t\t" + this.speicherkarte.marke;
        output = output + "\nKartengröße:   \t\t" + this.speicherkarte.speicherkartengroesse + " GB";
        output = output + "\nGewicht:       \t\t" + this.gewicht + " g\n\n";

        return output;
    }

    @Override
    public String toString() {
        return marke + ' ' + modell + '\n';
    }

    public Fotoapparat(String marke) {
        this.marke = marke;
    }
    public void setModell(String genaueProduktbezeichnung) {
        this.modell = genaueProduktbezeichnung;
    }
    public void setHerkunftsland(String herkunftsland) {
        this.herkunftsland = herkunftsland;
    }
    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
    public String getMarke() {
        return marke;
    }
    public String getModell(){
        return modell;
    }
    public String getHerkunftsland() {
        return herkunftsland;
    }
    public double getMegapixel() {
        return megapixel;
    }
    public int getGewicht() {
        return gewicht;
    }
}

