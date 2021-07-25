package mars.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    public static final Grid GRID = new Grid(10, 10);

    @Test public void shouldMoveRoverWhichDirectionIsNForward1Step() {
        MarsRover marsRover = new MarsRover(1, 2, MarsRover.DirectionType.N, GRID);
        assertEquals("1:3:N", marsRover.execute("F"));
    }

    @Test public void shouldMoveRoverWhichDirectionIsNForward2Step() {
        MarsRover marsRover = new MarsRover(1, 2, MarsRover.DirectionType.N, GRID);
        assertEquals("1:4:N", marsRover.execute("FF"));
    }

    @Test public void shouldMoveRoverWhichDirectionIsSForward1Step() {
        MarsRover marsRover = new MarsRover(1, 2, MarsRover.DirectionType.S, GRID);
        assertEquals("1:1:S", marsRover.execute("F"));
    }

    @Test public void shouldMoveRoverWhichDirectionIsEForward1Step() {
        MarsRover marsRover = new MarsRover(1, 2, MarsRover.DirectionType.E, GRID);
        assertEquals("2:2:E", marsRover.execute("F"));
    }

    @Test public void shouldMoveRoverWhichDirectionIsWForward1Step() {
        MarsRover marsRover = new MarsRover(2, 2, MarsRover.DirectionType.W, GRID);
        assertEquals(marsRover.execute("F"), "1:2:W");
    }

    @Test public void shouldMoveRoverWhichDirectionIsNBackward1Step() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.N, GRID);
        assertEquals(marsRover.execute("B"), "2:2:N");
    }

    @Test public void shouldMoveRoverWhichDirectionIsSBackward1Step() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.S, GRID);
        assertEquals(marsRover.execute("B"), "2:4:S");
    }

    @Test public void shouldMoveRoverWhichDirectionIsEBackward1Step() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.E, GRID);
        assertEquals(marsRover.execute("B"), "1:3:E");
    }

    @Test public void shouldMoveRoverWhichDirectionIsWBackward1Step() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.W, GRID);
        assertEquals(marsRover.execute("B"), "3:3:W");
    }

    @Test public void shouldTurnTheRoverLeftWhenTheRoverDirectionIsN() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.N, GRID);
        assertEquals(marsRover.execute("L"), "2:3:W");
    }

    @Test public void shouldTurnTheRoverLeftWhenTheRoverDirectionIsW() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.W, GRID);
        assertEquals(marsRover.execute("L"), "2:3:S");
    }

    @Test public void shouldTurnTheRoverLeftWhenTheRoverDirectionIsS() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.S, GRID);
        assertEquals(marsRover.execute("L"), "2:3:E");
    }

    @Test public void shouldTurnTheRoverLeftWhenTheRoverDirectionIsE() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.E, GRID);
        assertEquals(marsRover.execute("L"), "2:3:N");
    }

    @Test public void shouldTurnTheRoverRightWhenTheRoverDirectionIsN() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.N, GRID);
        assertEquals(marsRover.execute("R"), "2:3:E");
    }

    @Test public void shouldTurnTheRoverRightWhenTheRoverDirectionIsE() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.E, GRID);
        assertEquals(marsRover.execute("R"), "2:3:S");
    }

    @Test public void shouldTurnTheRoverRightWhenTheRoverDirectionIsS() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.S, GRID);
        assertEquals(marsRover.execute("R"), "2:3:W");
    }

    @Test public void shouldTurnTheRoverRightWhenTheRoverDirectionIsW() {
        MarsRover marsRover = new MarsRover(2, 3, MarsRover.DirectionType.W, GRID);
        assertEquals(marsRover.execute("R"), "2:3:N");
    }

    @Test public void shouldWrapTheXEdgeToAnotherXEdgeWhenMoveBackwardAndDirectionIsE() {
        MarsRover marsRover = new MarsRover(1, 1, MarsRover.DirectionType.E, GRID);
        assertEquals(marsRover.execute("B"), "10:1:E");
    }

    @Test public void shouldWrapTheXEdgeToAnotherXEdgeWhenMoveForwardAndDirectionE() {
        MarsRover marsRover = new MarsRover(10, 1, MarsRover.DirectionType.E, GRID);
        assertEquals(marsRover.execute("F"), "1:1:E");
    }

    @Test public void shouldWrapTheXEdgeToAnotherXEdgeWhenMoveBackwardAndDirectionIsW() {
        MarsRover marsRover = new MarsRover(10, 1, MarsRover.DirectionType.W, GRID);
        assertEquals("1:1:W", marsRover.execute("B"));
    }

    @Test public void shouldWrapTheXEdgeToAnotherXEdgeWhenMoveForwardAndDirectionIsW() {
        MarsRover marsRover = new MarsRover(1, 1, MarsRover.DirectionType.W, GRID);
        assertEquals(marsRover.execute("F"), "10:1:W");
    }
}
