import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* String pozdrav = "Ahoj svete";

        //Toto je pro vypsani textu

        System.out.println("Ahoj svete!");
        System.out.println("Ahoj svete!");
        System.out.println("Ahoj svete!");


        int prvniCislo = 10;
        int druheCislo = 5;



        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);*/

        /*String pozdrav2 = "Ahoj";
        String jmeno = "Honza";

        System.out.println(pozdrav2 + jmeno);*/

        //Uloha: Uzivatel napise sve jmeno a program ho pozdravi
        /*String pozdrav3 = "Ahoj, ";
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve jmeno:");
        String jmeno = mujScanner.nextLine();
        System.out.println(pozdrav3 + jmeno);

        //kalkulacka
        int prvniCislo;
        int druheCislo;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        prvniCislo = mujScanner.nextInt();

        System.out.println("Zadej druhe cislo:");
        druheCislo = mujScanner.nextInt();

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);*/

        //int NEJAKE_CISLO = 5;

        //Uzivatel zada slovo, ve vypisu budou vsechna pismena velke
        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve slovo:");
        String slovo = mujScanner.nextLine();

        System.out.println(slovo);*/

        //Prevod typu
        //int prevedeneCislo = Integrer.parseInt("5");

        int prvniCislo = 8;
        int druheCislo = 3;


        //prvniCislo = prvniCislo + druheCislo;
        //prvniCislo += druheCislo;

        /*System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo % druheCislo);

        System.out.println(prvniCislo <= druheCislo);*/

        /*int cisloKPorovnani = 5;

        System.out.println(cisloKPorovnani > 0 && cisloKPorovnani <= 8);
        System.out.println(cisloKPorovnani > 8 || cisloKPorovnani< 0);
        System.out.println(!(cisloKPorovnani > 8 || cisloKPorovnani< 0));*/
        //Feature pro kontrolu veku, bude-li mit uzivatel 18 a vice vypis do konzole vitej v aplikaci
       /* int vek;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej svuj vek:");
        vek = mujScanner.nextInt();

        if (vek >= 18) {
            System.out.println("Uzivatel je dospely");
            if (vek >= 65) {
                System.out.println("Uzivatel je senior");
        }
    }
        else if (vek >=0 && vek < 18) {
            System.out.println("Uzivatel je nezletily");
        }
        else {
            System.out.println("Nelze zadat zaporny vek");
        }*/

        //Vypocet BMI hmotnost (kg)/vyska(m) na druhou,
        /*float vyska;
        float hmotnost;
        float bmi;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej vysku(m):");
        vyska = mujScanner.nextFloat();
        System.out.println("Zadej vahu(kg)");
        hmotnost = mujScanner.nextFloat();
        bmi = hmotnost / (vyska * vyska);

        if(bmi < 18.5f) {
            System.out.println("Uzivatel ma podvahu");
        }
        else if(bmi>=18.5f && bmi<25){
            System.out.println("Uzivatel ma optimalni vahu");
        }
        else if(bmi>=25) {
            System.out.println("Uzivatel ma nadvahu");
        }
        System.out.println(bmi);*/

        //Liche cislo = vyhrava, Sude cislo = prohrava
        /*int hozeneCislo;
        Random nahodnyGenerator = new Random();

        System.out.println("Pro hozeni kostkou stiskni Enter");
        Scanner mujScanner = new Scanner(System.in);
        mujScanner.nextLine();

        hozeneCislo = nahodnyGenerator.nextInt(1,7);
        System.out.println("Hozene cislo je: " + hozeneCislo);

        if (hozeneCislo % 2 == 1) {
            System.out.println("Licha - Vyhravas!");
        }
        else {
            System.out.println("Suda - Prohravas!");
        }*/

        //Switch - den v týdnu
       /*Scanner mujScanner = new Scanner(System.in);
        int cisloDne;
        System.out.println("Zadej cislo dne");
        cisloDne = mujScanner.nextInt();

        switch (cisloDne){
            case 1:
                System.out.println("Je pondeli");
                break;
            case 2:
                System.out.println("Je utery");
                break;
            case 3:
                System.out.println("Je streda");
                break;
            case 4:
                System.out.println("Je ctvrtek");
                break;
            case 5:
                System.out.println("Je patek");
                break;
            case 6:
                System.out.println("Je sobota");
                break;
            case 7:
                System.out.println("Je nedele");
                break;
            default:
                System.out.println("Neplatne cislo dne");
        }

        switch (cisloDne){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Je pracovni den");
                break;
            case 6:
            case 7:
                System.out.println("Je vikend");
                break;
        }*/

        //Pole
        /*int[] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 24353499;
        znamky[3] = 3;
        znamky[4] = 1;

        int[] znamky2 = new int[] {3, 5, 1, 3, 1};

        System.out.println(znamky[2]);*/

        /*String [] jmena = new String[] {"Petr", "Jan", "Katka", "Eva", "Jana"};
        jmena[0] = "Linda";
        System.out.println(jmena[0]);*/

        /*int[][] pole20 = new int[3][3];
        pole20[0][0] = 464;
        pole20[0][1] = 92;*/

        //Smycky
        /*for (int i = 0; i < 10; i++){
            //System.out.println(i * 5);
            if (i == 5){
                //break;
                continue;
            }
            System.out.println(i);

        }*/
        /*String [] jmena = new String[] {"Petr", "Jan", "Katka", "Eva", "Jana"};

        //for
        for (int i = 0; i < jmena.length; i++){
            System.out.println(jmena[i]);
        }

        //foreach
        for (String jmeno: jmena){
            System.out.println(jmeno);
        }*/

        //while
        /*int ridiciPromenna = 0;
        while (ridiciPromenna < 5){
            System.out.println(ridiciPromenna);
            ridiciPromenna++;
        }
        System.out.println("Tady pokracuju");*/

        //do...while (provede se mi minimalne jednou bez ohledu na podminku
        /*int ridiciPromena2 = 0;
        do {
            System.out.println(ridiciPromena2);
            ridiciPromena2++;
        } while (ridiciPromena2 == 5);
        System.out.println("Tady pokracuju");*/

        //Vylepseni ulohy hodu kostkami
        int hozeneCislo;
        Random nahodnyGenerator = new Random();
        boolean ridiciPromenna = true;

        do {
        System.out.println("Pro hozeni kostkou stiskni Enter");
        Scanner mujScanner = new Scanner(System.in);
        mujScanner.nextLine();

        hozeneCislo = nahodnyGenerator.nextInt(1,7);
        System.out.println("Hozene cislo je: " + hozeneCislo);

        if (hozeneCislo % 2 == 1) {
            System.out.println("Licha - Vyhravas!");
        }
        else {
            System.out.println("Suda - Prohravas!");
        } while (ridiciPromenna);




    }
}