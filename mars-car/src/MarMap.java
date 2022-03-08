import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MarMap {

    private final Integer boundaryX;

    private final Integer boundaryY;

    private final Set<MapLocation> dangerousLocations = new HashSet<>();

    public MarMap(Integer boundaryX, Integer boundaryY) {
        this.boundaryX = boundaryX;
        this.boundaryY = boundaryY;
    }

    public boolean outOfBoundary(MapLocation location) {
        if (location.getLocationX() > boundaryX || location.getLocationY() > boundaryY) {
            dangerousLocations.add(location);
            return true;
        } else {
            return false;
        }
    }

    public boolean identifyDangerous(MapLocation location) {
        return dangerousLocations.contains(location);
    }
}