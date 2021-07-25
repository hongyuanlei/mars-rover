package mars.rover;

public class WDirection implements Direction {
    private final MarsRover marsRover;

    public WDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void turnLeft() {
        marsRover.setDirection(marsRover.getSDirection());
    }

    @Override
    public void turnRight() {
        marsRover.setDirection(marsRover.getNDirection());
    }

    @Override
    public void moveForward() {
        marsRover.decreaseX();
    }

    @Override
    public void moveBackward() {
        marsRover.increaseX();
    }

    @Override
    public String toString() {
        return "W";
    }
}
