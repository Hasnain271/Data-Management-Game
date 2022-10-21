import java.util.Scanner;



class Game {

    public static int twoTimeDmg(int damage) {
        return damage * 2;
    }

    public static int threeTimeDmg(int damage) {
        return damage * 3;
    }

    public static int zeroTimeDmg(int damage) {
        return damage * 0;
    }

    public static int tenTimeDmg(int damage) {
        return damage * 10;
    }





    public static void main(String[] args) {
        Player playerOne = new Player("", 300, 20);
        Player playerTwo = new Player("", 600, 10);


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name (Player one)");
        playerOne.setName(input.nextLine());
        System.out.println("Enter your name (Player two)");
        playerTwo.setName(input.nextLine());

        while ((playerOne.getHp() >= 10) && (playerTwo.getHp() >= 0)) {
            System.out.println(playerOne.getName() + " hp: " + playerOne.getHp());
            System.out.println(playerTwo.getName() + " hp: " + playerTwo.getHp());
            while (true) {

                System.out.println("Player 1 Options: 10 for x10 dmg, 3 for x3 dmg, 0 for x0 dmg, 10 for x10dmg, p for pass");
                String option = input.nextLine();

                if (option.equals("2")) {
                    playerTwo.setHp(playerTwo.getHp() - twoTimeDmg(playerOne.getDmg()));
                    break;
                } else if (option.equals("3")) {
                    playerTwo.setHp(playerTwo.getHp() - threeTimeDmg(playerOne.getDmg()));
                    break;
                } else if (option.equals("0")) {
                    playerTwo.setHp(playerTwo.getHp() - zeroTimeDmg(playerOne.getDmg()));
                    break;
                } else if (option.equals("p")) {
                    break;
                } else if (option.equals("10")) {
                    playerTwo.setHp(playerTwo.getHp() - tenTimeDmg(playerOne.getDmg()));
                    break;
                } 
            }

            while (true) {

                System.out.println("Player 2 Options: 2 for x2 dmg, 3 for x3 dmg, 0 for x0 dmg, 10 for x10dmg, p for pass");
                String option = input.nextLine();

                if (option.equals("2")) {
                    playerOne.setHp(playerOne.getHp() - twoTimeDmg(playerTwo.getDmg()));
                    break;
                } else if (option.equals("3")) {
                    playerOne.setHp(playerOne.getHp() - threeTimeDmg(playerTwo.getDmg()));
                    break;
                } else if (option.equals("0")) {
                    playerOne.setHp(playerOne.getHp() - zeroTimeDmg(playerTwo.getDmg()));
                    break;
                } else if (option.equals("p")) {
                    break;
                } else if (option.equals("10")) {
                    playerOne.setHp(playerTwo.getHp() - tenTimeDmg(playerOne.getDmg()));
                    break;
                }


            }

        }

        System.out.println(playerOne.getName() + " hp: " + playerOne.getHp());
        System.out.println(playerTwo.getName() + " hp: " + playerTwo.getHp());
    
        input.close();
        
    }
}



