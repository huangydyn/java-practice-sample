import java.util.Objects;

public class MapLocation {

    private final Integer locationX;

    private final Integer locationY;

    private final CarDirection direction;

    public MapLocation(Integer locationX, Integer locationY, CarDirection direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public Integer getLocationX() {
        return locationX;
    }

    public Integer getLocationY() {
        return locationY;
    }

    public CarDirection getDirection() {
        return direction;
    }

    public MapLocation rotate(MoveCommand command) {
        return new MapLocation(this.locationX, this.locationY, this.direction.rotate(command));
    }

    public MapLocation move() {
        switch (this.direction) {
            case E:
                return new MapLocation(this.locationX + 1, this.locationY, this.direction);
            case W:
                return new MapLocation(this.locationX - 1, this.locationY, this.direction);
            case N:
                return new MapLocation(this.locationX, this.locationY + 1, this.direction);
            case S:
                return new MapLocation(this.locationX, this.locationY - 1, this.direction);
            default:
                throw new RuntimeException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapLocation location = (MapLocation) o;
        return Objects.equals(locationX, location.locationX) &&
                Objects.equals(locationY, location.locationY) &&
                direction == location.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationX, locationY, direction);
    }
}
