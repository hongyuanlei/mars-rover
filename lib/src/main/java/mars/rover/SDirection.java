package mars.rover;

public class SDirection implements Direction {
    private final MarsRover marsRover;

    public SDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void turnLeft() {
        marsRover.setDirection(marsRover.getEDirection());
    }

    @Override
    public void turnRight() {
        marsRover.setDirection(marsRover.getWDirection());
    }

    @Override
    public void moveForward() {
        marsRover.decreaseY();
    }

    @Override
    public void moveBackward() {
        marsRover.increaseY();
    }

    @Override
    public String toString() {
        return "S";
    }
}
