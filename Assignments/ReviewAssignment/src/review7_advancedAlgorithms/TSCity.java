package review7_advancedAlgorithms;

// Helper for traveling salesman problem -- NOTHING TO IMPLEMENT HERE

/**
 * A city for use in the traveling salesman problem.
 */
public class TSCity
{
    private int xPos, yPos;
    private String name;
    
    public TSCity(String name, int xPos, int yPos) {
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public String getName() {
        return name;
    }
    
    public int getXPos() {
        return xPos;
    }
    
    public int getYPos() {
        return yPos;
    }
    
    /**
     * Finds the distance between this city and the specified other city.
     * @param other
     * @return
     */
    public double distanceTo(TSCity other) {
        int xDist = xPos - other.getXPos();
        int yDist = yPos - other.getYPos();
        return Math.sqrt(xDist * xDist + yDist * yDist);
    }
    
    @Override
    public String toString() {
        return name + "(" + xPos + ", " + yPos + ")";
    }
}
