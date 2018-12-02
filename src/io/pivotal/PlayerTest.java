package io.pivotal;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PlayerTest {
    @Test
    public void winningPlayerIncrementsWin() {
        Player winner = new Player();
        Player loser = new Player();
        winner.defeats(loser);

        assertTrue(winner.getWins() == 1);
    }
}
