package io.pivotal;

public class Player {
    private int wins = 0;

    public void defeats(Player player) {
        wins++;
    }

    public int getWins() {
        return wins;
    }
}
