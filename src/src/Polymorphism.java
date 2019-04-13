package src;

// Vladimir Hardy
// Makes use of polymorphism with my opinions about different consoles
public class Polymorphism {
  public static void polymorphism() {
    Console xbox = new Xbox();
    Console playStation = new PlayStation();
    Console computer = new Computer();

    System.out.println("My preffered console is " + computer.showConsole());
    System.out.println("My favorite computer games are " + ComputerGame.myComputerGame());

    System.out.println("My brother loves to play" + xbox.showConsole());
    // System.out.println("But I think that " + xbox.xboxOpinion());
  }
}


class Console {
  public String showConsole() {
    return "Console";
  }
}


class Xbox extends Console {
  public static void xboxOpinion() {
    System.out.println("Xbox is for casual gamers, yes I said it");
  }

  public String showConsole() {
    return "xbox";
  }
}


class PlayStation extends Console {
  public static void ps4() {
    System.out.println("Playstation is for casual gamers, just like xbox");
  }

  public String showConsole() {
    return "Playstation";
  }
}


class Computer extends Console {
  public void computer() {
    System.out.println("PC is the master race of all gaming platforms!");
  }

  public String showConsole() {
    return "Computer";
  }
}


class PSGame extends PlayStation {
  public void myPlayStationGame() {
    System.out.println("The Last Of Us");
  }
}


class XboxGame extends Xbox {
  public void halo() {
    System.out.println("Halo is an xbox exclusive game");
  }

  public void myXboxGame() {
    System.out.println("Halo, For Honor, Red Dead Redemption 2");
  }
}


class ComputerGame extends Computer {
  public void steam() {
    System.out.println("Steam is a computer game launching platform");
  }

  public static String myComputerGame() {
    return "Rainbow Six Siege, CounterStrike, League Of Legends";
  }
}
