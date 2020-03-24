package com.company;

public class Main {

    public static void main(String[] args) {
        Bassist bassist1_1 = new Bassist("Eugen ", "Netzer",72);
        Bassist bassist1_2 = new Bassist("Georg", "Hörmann",63);
        Bassist bassist2_1 = new Bassist("Joachim", "Ambrosig",40);

        Trumpeter trumpeter1_1 = new Trumpeter("Johannes",  "Kennerknecht",38);
        Trumpeter trumpeter2_1 = new Trumpeter("Andreas", "Sutter", 16);
        Trumpeter trumpeter2_2 = new Trumpeter("Eva", "Waldinger", 17);
        Trumpeter trumpeter3_1 = new Trumpeter("Claudia", "Waldinger", 41);

        Clarinetist clarinetist1_1 = new Clarinetist("Herbert","Heim", 60);
        Clarinetist clarinetist1_2 = new Clarinetist("Katharina", "Spettel", 18);
        Clarinetist clarinetist1_3 = new Clarinetist("Elisabeth", "Kennerknecht", 38);
        Clarinetist clarinetist2_1 = new Clarinetist("Bettina", "Lässer", 37);
        Clarinetist clarinetist3_1 = new Clarinetist("Tatjana", "Ruech", 30);

        Conductor conductor1 = new Conductor("Alois", "Jäger", 63);
        Conductor conductor2 = new Conductor("Daniel", "Rädler", 33);

        BrassBand langenMV = new BrassBand("Musikverein Langen");
        BrassBand langenBK = new BrassBand("Bauernkapelle Langen");

        langenMV.setConductor(conductor1);
        langenBK.setConductor(conductor2);

        langenMV.joinMusican(bassist1_1);
        langenMV.joinMusican(bassist1_2);
        langenBK.joinMusican(bassist1_2);
        langenMV.joinMusican(bassist2_1);
        langenMV.joinMusican(trumpeter1_1);
        langenBK.joinMusican(trumpeter1_1);
        langenMV.joinMusican(trumpeter2_1);
        langenBK.joinMusican(trumpeter2_1);
        langenMV.joinMusican(trumpeter2_2);
        langenMV.joinMusican(trumpeter3_1);
        langenMV.joinMusican(clarinetist1_1);
        langenMV.joinMusican(clarinetist1_2);
        langenMV.joinMusican(clarinetist1_3);
        langenMV.joinMusican(clarinetist2_1);
        langenBK.joinMusican(clarinetist2_1);
        langenMV.joinMusican(clarinetist3_1);

        System.out.println("\nDie Mitglieder des Musikverein Langens: \n");

        Musician[] musicianMVLangenHelpArr = langenMV.getJoinedMusicansArr();

        for (Musician musician : musicianMVLangenHelpArr) {
            if (musician != null) {
                System.out.println(musician);
            }
        }

        /* oder
        for (int i = 0; i < musicianMVLangenHelpArr.length; i++) {
            if (musicianMVLangenHelpArr[i] != null) {
                System.out.println(musicianMVLangenHelpArr[i]);
            }
        }*/

        System.out.println("\nUnter der Leitung von " + langenMV.getConductor().toString().toUpperCase() + ".\n");

        System.out.println("\n\nDie Mitglieder der Bauernkapelle Langens und ihr Sound:\n");
        for (int i = 0; i < langenBK.getJoinedMusicansArr().length; i++) {
            if (langenBK.getJoinedMusicansArr()[i] != null) {
                System.out.println(langenBK.getJoinedMusicansArr()[i] + " --> " + langenBK.getJoinedMusicansArr()[i].makeMusic());
            }
        }
        System.out.println("\nUnter der Leitung von " + langenBK.getConductor().toString().toUpperCase() + ".\n");
    }
}
