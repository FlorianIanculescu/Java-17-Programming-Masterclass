import course.game.GameConsole;
import course.pirate.Pirate;
import course.pirate.PirateGame;
import course.pirate.Weapon;

public class Main {
    public static void main(String[] args) {

//        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
//
//        int playerIndex = console.addPlayer();;
//        console.playGame(playerIndex);

        printSeparators();
        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println("weapon = " + weapon + ", hitPoints = " + weapon.getHitPoints() + ", minLevel = " + weapon.getMinLevel());

        printSeparators();
        var list = Weapon.getWeaponByLevel(1);
        list.forEach(System.out::println);

        printSeparators();
        Pirate tim = new Pirate("Tim");
        System.out.println(tim);

        printSeparators();
        PirateGame.getTowns(0).forEach(System.out::println);

        printSeparators();
        PirateGame.getTowns(1).forEach(System.out::println);

        printSeparators();
        var console = new GameConsole<>(new PirateGame("The Pirate Game"));
        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);

        printSeparators();
    }

    public static void printSeparators() {
        System.out.println("-".repeat(50));
    }
}