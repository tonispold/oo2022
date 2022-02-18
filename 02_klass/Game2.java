import java.util.Scanner;

    //parem klõps -> refactor -> rename
public class Game2 {
    //main
    public static void main(String[] args) {
        //sout
        System.out.println("Hello World");
        // double -- 15 kohaline komakohaga number
        // float -- 7 kohaline komakohaga number
        // byte -- 128 kohta
        // short -- 32 000 kohta
        // Long -- 9,223,372,036,854,775,807 kohta
        //boolean -- kahendväärtus true/false
        int worldHeight = 5;
        int worldWidth = 10;
        // Math.random() -- 0 .. 0.9999

        Player mangija1 = new Player(worldHeight,worldWidth);

        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        printMap(worldHeight,worldWidth, mangija1.playerCoordinateY, mangija1.playerCoordinateX, enemyCoordinateY,enemyCoordinateX);

        // klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            mangija1.movePlayer(input, worldHeight, worldWidth);

            printMap(worldHeight,worldWidth, mangija1.playerCoordinateY, mangija1.playerCoordinateX, enemyCoordinateY,enemyCoordinateX);
            input = scanner.nextLine();
        }
    }
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
    public static void printMap(int worldHeight, int worldWidth, int playerCoordinateY, int playerCoordinateX, int enemyCoordinateY, int enemyCoordinateX) {
        //fori
        char symbol;
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) {
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x)  {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x)  {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
