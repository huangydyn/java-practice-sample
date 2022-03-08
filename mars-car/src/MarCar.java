import java.util.*;

public class MarCar {

    private final LinkedList<MapLocation> locationRecords;

    private final MarMap marMap;

    private boolean destroy = Boolean.FALSE;

    public MarCar(MapLocation location, MarMap marMap) {
        this.locationRecords = new LinkedList<>();
        this.locationRecords.add(location);
        this.marMap = marMap;
    }

    public void move(String commands) {
        commands.chars()
                .mapToObj(e -> (char) e)
                .map(c -> MoveCommand.valueOf(Character.toString(c)))
                .forEach(this::move);
    }

    private void move(MoveCommand command) {
        if (Objects.isNull(command) || this.destroy) {
            return;
        }
        this.locationRecords.add(getNextLocation(command));

        if (marMap.identifyDangerous(currentLocation())) {
            this.locationRecords.removeLast();
            return;
        }

        if (marMap.outOfBoundary(currentLocation())) {
            this.destroy = Boolean.TRUE;
        }
    }

    private MapLocation getNextLocation(MoveCommand command) {
        switch (command) {
            case L:
                return currentLocation().rotate(MoveCommand.L);
            case R:
                return currentLocation().rotate(MoveCommand.R);
            case M:
                return currentLocation().move();
            default:
                throw new RuntimeException();
        }
    }

    public void printLocation() {
        if (destroy) {
            MapLocation lastAvailableLocation = locationRecords.get(locationRecords.size() - 2);
            System.out.print(lastAvailableLocation.getLocationX() + " "
                    + lastAvailableLocation.getLocationY() + " " + lastAvailableLocation.getDirection() + " ");
            System.out.println("RIP");
        } else {
            System.out.println(currentLocation().getLocationX() + " " + currentLocation().getLocationY()
                    + " " + currentLocation().getDirection());
        }
    }

    private MapLocation currentLocation() {
        return locationRecords.getLast();
    }
}
