public class enemy {
    int coordinateY;
    int coordinateX;

    public enemy(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
    }
    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
