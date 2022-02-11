public class Game {
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
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
