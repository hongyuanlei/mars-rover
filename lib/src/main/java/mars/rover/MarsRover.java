package mars.rover;


public class MarsRover {
    private final NDirection nDirection = new NDirection(this);
    private final EDirection eDirection = new EDirection(this);
    private final SDirection sDirection = new SDirection(this);
    private final WDirection wDirection = new WDirection(this);

    private int x;
    private int y;
    private Grid grid;

    private Direction direction;

    public NDirection getNDirection() {
        return nDirection;
    }

    public EDirection getEDirection() {
        return eDirection;
    }

    public SDirection getSDirection() {
        return sDirection;
    }

    public WDirection getWDirection() {
        return wDirection;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction directionOf(DirectionType direction) {
        switch (direction) {
            case N -> {
                return nDirection;
            }
            case E -> {
                return eDirection;
            }
            case S -> {
                return sDirection;
            }
            case W -> {
                return wDirection;
            }
        }
        return null;
    }

    public MarsRover(int x, int y, DirectionType direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.grid = grid;
        this.direction = directionOf(direction);
    }

    public String execute(String commands) {
        for (String s : commands.split("")) {
            processCommand(s);
        }
        return generateOutput();
    }

    private String generateOutput() {
        return this.x + ":" + this.y + ":" + this.direction;
    }

    private void processCommand(String command) {
        switch (command) {
            case "F" -> moveForward();
            case "B" -> moveBackward();
            case "L" -> turnLeft();
            case "R" -> turnRight();
            default -> throw new RuntimeException("command " + command + " is not allowed");
        }
    }


    private void turnRight() {
        direction.turnRight();
    }

    private void turnLeft() {
        direction.turnLeft();
    }

    public void increaseY() {
        y = y + 1;
    }

    public void decreaseY() {
        y = y - 1;
    }

    public void increaseX() {
        if (x == grid.getX()) {
            x = 1;
            return;
        }
        x = x + 1;
    }

    public void decreaseX() {
        if (x == 1) {
            x = grid.getX();
            return;
        }
        x = x - 1;
    }

    private void moveBackward() {
        direction.moveBackward();
    }

    private void moveForward() {
        direction.moveForward();
    }

    public enum DirectionType {N, S, E, W};
}
