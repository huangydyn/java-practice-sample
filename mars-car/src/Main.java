public class Main {

    public static void main(String[] args) {
        MarMap marMap = new MarMap(5, 5);
        // 1,3,N
        MarCar car = new MarCar(new MapLocation(1, 2, CarDirection.N), marMap);
        car.move("LMLMLMLMM");
        car.printLocation();

        // 5,1,E
        car = new MarCar(new MapLocation(3, 3, CarDirection.E), marMap);
        car.move("MMRMMRMRRM");
        car.printLocation();

        // 5,1,E RIP
        car = new MarCar(new MapLocation(3, 3, CarDirection.E), marMap);
        car.move("MMRMMLMRRM");
        car.printLocation();

        // 5,0,S
        car = new MarCar(new MapLocation(4, 1, CarDirection.S), marMap);
        car.move("MLMLMRMRM");
        car.printLocation();
    }
}
