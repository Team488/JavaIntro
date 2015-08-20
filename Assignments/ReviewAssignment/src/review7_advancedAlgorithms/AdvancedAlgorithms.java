package review7_advancedAlgorithms;

public class AdvancedAlgorithms
{
    /* TRAVELING SALESMAN ------------------------------------------------------
        The traveling salesman problem is a thought experiment in computer science
        which asks the question:
            Given a list of cities and the distances between each pair of cities,
            what is the shortest possible route that visits each city exactly once
            and returns to the origin city?
    
        The goal of this exercise is to write a method that answers this question,
        by taking in a set of cities and returning the cities sorted in the
        proper order for the shortest path.
        
        The "TSCity" class represents a city in this problem. Each city has a
        name and a Cartesian position. You do not need to modify that class or
        understand how it works. The important method is the
        distanceTo(otherCity) method; it finds the distance from one city
        to the specified other city.
    --------------------------------------------------------------------------*/
    
    /**
     * DIFFICULTY: 4
     * 
     * Finds the distance that a salesman would travel if they visited the given
     * cities in this order. The distance includes the distance that it takes
     * for the salesman to get from the last city back to the origin city.
     * 
     * The total distance is the sum of the distances between each city and the
     * next one in the sequence, plus the distance from the last city back to
     * the original.
     * 
     * HINT: You can use the oneCity.distanceTo(otherCity) method to find the
     * distance between two cities.
     * 
     * @param cityPath The cities that are visited, in order.
     * @return The distance traveled to follow this path.
     */
    public static double findTravelingSalesmanPathDistance(TSCity[] cityPath) {
        return 0;
    }
    
    /**
     * DIFFICULTY: 5
     * 
     * Computes the fastest path that can be taken so that a traveling salesman
     * can visit all cities in the input list and return home.
     * 
     * NOTE: You should use the method that you implemented above to help solve
     * this problem.
     * 
     * @param allCities The cities that one must visit.
     * @return The shortest possible path, in order.
     */
    public static TSCity[] findTravelingSalesmanPath(TSCity[] allCities) {
        return new TSCity[0];
    }
}
