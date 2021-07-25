package mars.rover;

public class EDirection implements Direction {
    private final MarsRover marsRover;

    public EDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void turnLeft() {
        marsRover.setDirection(marsRover.getNDirection());
    }

    @Override
    public void turnRight() {
        marsRover.setDirection(marsRover.getSDirection());
    }

    @Override
    public void moveForward() {
        marsRover.increaseX();
    }

    @Override
    public void moveBackward() {
        marsRover.decreaseX();
    }

    @Override
    public String toString() {
        return "E";
    }

}
