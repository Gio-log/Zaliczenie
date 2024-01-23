import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        /*
        CBeam[] Beams = new CBeam[5];
        Beams[0] = new CBeamRound();
        Beams[1] = new CBeamRound(1100,250,20000,32.5);
        Beams[2] = new CBeam2T();
        Beams[3] = new CBeam2T(750,500,1200,80,80,8.5);
        System.out.println(Beams[0].toString());
        System.out.println(Beams[1].toString());
        System.out.println(Beams[2].toString());
        System.out.println(Beams[3].toString());
         */
        while(true)
        {
            String profil;
            System.out.println("Proszę wybrać profil(Belka okrągła[1], Belka Dwuteowa[2])\n");
            profil = myObj.nextLine().trim();
            if(profil.equals("1")) {
                try {
                    System.out.println("\nProszę podać parametry belki\nDługość = ");
                    double L = Double.parseDouble(myObj.nextLine().trim());
                    if(L<0)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nOdległość przyłożenia siły = ");
                    double X = Double.parseDouble(myObj.nextLine().trim());
                    if(X<0)
                    {
                        throw new IllegalArgumentException();
                    } else if (X>L)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nWartość siły = ");
                    double P = Double.parseDouble(myObj.nextLine().trim());
                    if(P<0)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nPromień belki = ");
                    double R = Double.parseDouble(myObj.nextLine().trim());
                    if(R<0)
                    {
                        throw new IllegalArgumentException();
                    }
                    CBeam Beam = new CBeamRound(L, X, P, R);
                    System.out.println(Beam.toString());
                }catch(Exception e){
                    System.out.println("\nPodano niepoprawny parametr");
                }
            }
            if(profil.equals("2")) {
                try {
                    System.out.println("\nProszę podać parametry belki\nDługość = ");
                    double L = Double.parseDouble(myObj.nextLine().trim());
                    if(L<0)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nOdległość przyłożenia siły = ");
                    double X = Double.parseDouble(myObj.nextLine().trim());
                    if(X<0)
                    {
                        throw new IllegalArgumentException();
                    } else if (X>L)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nWartość siły = ");
                    double P = Double.parseDouble(myObj.nextLine().trim());
                    if(P<0)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nSzerokość belki = ");
                    double B = Double.parseDouble(myObj.nextLine().trim());
                    if(B<0)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nGrubość belki = ");
                    double G = Double.parseDouble(myObj.nextLine().trim());
                    if(G<0)
                    {
                        throw new IllegalArgumentException();
                    } else if (G>=B/2)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nWysokość belki = ");
                    double H = Double.parseDouble(myObj.nextLine().trim());
                    if(H<0)
                    {
                        throw new IllegalArgumentException();
                    } else if (G>=H/3)
                    {
                        throw new IllegalArgumentException();
                    }
                    CBeam Beam = new CBeam2T(L, X, P, B,G,H);
                    System.out.println(Beam.toString());
                }catch(Exception e){
                    System.out.println("\nPodano niepoprawny parametr");
                }
            }
            System.out.println("\nCzy chcesz powtórzyć obliczenia?(y/n)\n");
            String repeat = myObj.nextLine().trim();
            if(repeat.equals("n")||repeat.equals("N"))
            {
                break;
            }
        }
    }
}