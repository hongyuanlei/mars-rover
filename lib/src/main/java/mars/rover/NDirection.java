package mars.rover;

public class NDirection implements Direction {
    private final MarsRover marsRover;

    public NDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void turnLeft() {
        marsRover.setDirection(marsRover.getWDirection());
    }

    @Override
    public void turnRight() {
        marsRover.setDirection(marsRover.getEDirection());
    }

    @Override
    public void moveForward() {
        marsRover.increaseY();
    }

    @Override
    public void moveBackward() {
        marsRover.decreaseY();
    }

    @Override
    public String toString() {
        return "N";
    }
}
