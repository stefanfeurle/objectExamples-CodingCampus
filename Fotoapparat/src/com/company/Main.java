package com.company;

public class Main {

    public static void main(String[] args) {
        Fotoapparat nikon = new Fotoapparat("NIKON");
        //nikon.setMarke("NIKON");
        nikon.setModell("D 7500");
        nikon.setHerkunftsland("Japan");
        nikon.setMegapixel(20.9);
        nikon.setGewicht(721);


        Fotoapparat sony = new Fotoapparat("SONY");
        sony.setModell("DSC-HX60");
        sony.setHerkunftsland("Japan");
        sony.setMegapixel(20.4);
        sony.setGewicht(272);

        Fotoapparat canon = new Fotoapparat("CANON");
        canon.setModell("EOS 80D");
        canon.setHerkunftsland("Japan");
        canon.setMegapixel(24.2);
        canon.setGewicht(1530);

        Fotoapparat panasonic = new Fotoapparat("PANASONIC");
        panasonic.setModell("Lumix DC-TZ91");
        panasonic.setHerkunftsland("Japan");
        panasonic.setMegapixel(20);
        panasonic.setGewicht(322);


        Fotoapparat[] cameras = new Fotoapparat[4];
        cameras[0] = nikon;
        cameras[1] = sony;
        cameras[2] = canon;
        cameras[3] = panasonic;

        Objektiv eF_S_55_Objektiv =new Objektiv(24,720);
        eF_S_55_Objektiv.setModell("EF S 55");

        Objektiv rH_5_Objektiv =new Objektiv(18,35);
        rH_5_Objektiv.setModell("RH 5");

        nikon.setObjektiv(eF_S_55_Objektiv);
        sony.setObjektiv(rH_5_Objektiv);
        canon.setObjektiv(eF_S_55_Objektiv);
        panasonic.setObjektiv(rH_5_Objektiv);

        Speicherkarte sunDiskSpeicherkarte = new Speicherkarte();
        sunDiskSpeicherkarte.setMarke("SunDisk");
        sunDiskSpeicherkarte.setSpeicherkartengroesse(128);

        Speicherkarte transcendSpeicherkarte = new Speicherkarte();
        transcendSpeicherkarte.setMarke("Transcend");
        transcendSpeicherkarte.setSpeicherkartengroesse(256);

        nikon.setSpeicherkarte(sunDiskSpeicherkarte);
        sony.setSpeicherkarte(transcendSpeicherkarte);
        canon.setSpeicherkarte(transcendSpeicherkarte);
        panasonic.setSpeicherkarte(sunDiskSpeicherkarte);

        Person unterhuber = new Person("Marc","Unterhauser", 31, "Mann",0);
        Person bhergler = new Person("Dietmar", "Bhergler", 43,"Mann",0);
        Person leuchten = new Person("Iris", "Leuchten", 47, "Frau",0);
        Person messerle = new Person("Andrea", "Messerle",41, "Frau",0);
        Person wasserle = new Person("Stefan", "Wasserle", 43,"Mann",0);
        wasserle.setMaritalStatus("free");

        Person[] people = {unterhuber,bhergler,leuchten,messerle,wasserle};


        nikon.setPerson(unterhuber);
        sony.setPerson(bhergler);
        canon.setPerson(leuchten);
        panasonic.setPerson(messerle);




        System.out.println();
        nikon.zoomen();
        nikon.machFoto();
        nikon.getSpeicherkarte().delete();
        nikon.filmen();

        for (int i = 0; i < cameras.length; i++) {
            System.out.println(cameras[i].getProduktblatt());
        }
        for (int i = 0; i < cameras.length; i++) {
            System.out.println(cameras[i]);
        }
        System.out.println(eF_S_55_Objektiv + " oder " + rH_5_Objektiv);
        System.out.println(eF_S_55_Objektiv.getBrennweiteVonBis());
        System.out.println(rH_5_Objektiv.getBrennweiteVonBis() + "\n\n");
        System.out.println(nikon.speicherkarte.verfuegbarerSpeicherplatz());
        nikon.machFoto();nikon.machFoto();
        System.out.println(nikon.speicherkarte.verfuegbarerSpeicherplatz());
        System.out.println(nikon.speicherkarte.zaehleFoto());

        nikon.setSpeicherkarte(transcendSpeicherkarte);
        sony.setSpeicherkarte(sunDiskSpeicherkarte);

        System.out.println(sony.speicherkarte.verfuegbarerSpeicherplatz());
        System.out.println(nikon.speicherkarte.verfuegbarerSpeicherplatz());
        sony.speicherkarte.delete();
        System.out.println(sony.speicherkarte.verfuegbarerSpeicherplatz());
        sony.getSpeicherkarte().delete();
        System.out.println(sony.speicherkarte.verfuegbarerSpeicherplatz());
        sony.getSpeicherkarte().delete();
        sony.getSpeicherkarte().delete();
        System.out.println(sony.speicherkarte.verfuegbarerSpeicherplatz());
        System.out.println(sony.speicherkarte.zaehleFoto);

        for (int i = 0; i < 26; i++) {
            sony.machFoto();
        }

        // PERSON

        wasserle.setMaritalStatus("married");
        //leuchten.setAge(17);

        String output = Person.marry(wasserle,leuchten);
        System.out.println(output);

        System.out.println(unterhuber.marry(messerle));

        System.out.println(unterhuber.divored(messerle));
        System.out.println(unterhuber.divored(leuchten));

        Person gmeiner = new Person("Joachim", "Gmeiner", 108, "Mann",0);
        Person fetz = new Person("Theresia", "Fetz", 103,"Frau",0);
        gmeiner.marry(fetz);
        gmeiner.produceBaby(fetz, "Joachim", "Mann",1);
        gmeiner.produceBaby(fetz,"Anneliese", "Frau",1);
        gmeiner.produceBaby(fetz, "Maria", "Frau",1);

        Person feurle = new Person("Josef", "Feurle", 116, "Mann",0);
        Person heim = new Person ("Stefanie", "Heim", 106, "Frau",0);
        feurle.marry(heim);
        feurle.produceBaby(heim, "Hubert","Mann",1);
        feurle.produceBaby(heim,"Maria", "Frau",1);

        feurle.childrenArr[0].marry(gmeiner.childrenArr[1]);
        feurle.childrenArr[0].produceBaby(gmeiner.childrenArr[1],"Stefan","Mann",2);
        feurle.childrenArr[0].produceBaby(gmeiner.childrenArr[1],"Elisabeth","Frau",2);

        Person matt = new Person("Iris", "Matt",48, "Frau",2);
        Person mueller = new Person("Günther", "Müller", 53, "Mann",2);
        matt.marry(mueller);
        matt.produceBaby(mueller, "Marcel", "Mann",3);
        matt.divored(mueller);

        System.out.println(matt.marry(feurle.childrenArr[0].childrenArr[0]));
        matt.produceBaby(feurle.childrenArr[0].childrenArr[0], "Michelle", "Frau",3);

        Person prinz = new Person("Kent", "Prinz",24, "Mann",3);
        feurle.childrenArr[0].childrenArr[0].childrenArr[0].marry(prinz);
        feurle.childrenArr[0].childrenArr[0].childrenArr[0].produceBaby(prinz, "Annabel", "Frau",4);

        System.out.println(fetz.getFamilyTree(""));
        System.out.println();
        feurle.getFamilyTree();
        System.out.println();
        matt.getFamilyTree();
    }
}
