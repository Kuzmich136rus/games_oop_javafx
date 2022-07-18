package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void ifCreatePositionF8ThenMethodPositionF8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell actual = bishopBlack.position();
        assertEquals(actual, Cell.F8);
    }

    @Test
    public void ifStartF8copyToB4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure rsl = bishopBlack.copy(Cell.F8);
        Cell expected = bishopBlack.position();
        Cell actual = rsl.position();
        assertEquals(expected, actual);
    }
    @Test
    public void ifStartPositionC1FinishG5ThenWayD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected,actual);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void ifWayImpossible(){
        BishopBlack one = new BishopBlack(Cell.C1);
        one.way(Cell.G4);
    }
}