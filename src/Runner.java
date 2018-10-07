import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập kích cỡ của bàn cờ (min: 3): ");
        int size = sc.nextInt();
        Caro caro = new Caro(size);

        while (0 < 1) {
            printer(caro);
            System.out.println("người chơi " + caro.getCurrentTurn() + ": ");
            System.out.print("x: ");
            int x = sc.nextInt();
            System.out.print("y: ");
            int y = sc.nextInt();
            caro.mark(x, y);
        }

    }

    static void printer(Caro caro) {
        String rowLenght = "-";
        for (int i = 0; i < caro.getMap().length; i++) {
            rowLenght += "--";
        }
        for (String[] x : caro.getMap()) {
            System.out.println("\n" + rowLenght);
            for (String e : x) {
                System.out.print("|" + e);
            }
            System.out.print("|");
        }
        System.out.println("\n" + rowLenght);

    }
}
