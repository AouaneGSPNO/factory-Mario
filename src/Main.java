import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel Mario  voulez vous ?  FEU ou CAPE");
        String type = sc.nextLine();

        MarioMaker in = null;
        GameManager gamer = new GameManager();

        if(type.equals("FEU")){
            in = new FireMaker();
        }
        else if(type.equals("CAPE")){
            in = new CapMaker();
        }
        else {
            System.out.println("erreur");
            System.exit(0);
        }
        gamer.startGame(in);
    }
}