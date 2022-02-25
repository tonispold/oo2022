import java.util.Scanner;

    //parem klõps -> refactor -> rename
public class Game2 {
    //main
    public static void main(String[] args) {
        //sout
        // double -- 15 kohaline komakohaga number
        // float -- 7 kohaline komakohaga number
        // byte -- 128 kohta
        // short -- 32 000 kohta
        // Long -- 9,223,372,036,854,775,807 kohta
        //boolean -- kahendväärtus true/false
        // Math.random() -- 0 .. 0.9999

        world world = new world(5, 10);
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        enemy vaenlane1 = new enemy(world.worldHeight, world.worldWidth);

        world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);

        // klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            mangija1.movePlayer(input, world.worldHeight, world.worldWidth);

            world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
