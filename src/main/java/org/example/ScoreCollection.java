package org.example;

import java.util.ArrayList;

public class ScoreCollection {
    public ArrayList<Integer> scores;
    public ScoreCollection() {
        this.scores = new ArrayList<Integer>();
    }
    public void addScore(Integer score) {
        this.scores.add(score);
    }
    public double avergeScore() {
        double total = 0;

        for (int i = 0; i < this.scores.size(); i++) {
            total += this.scores.get(i);
        }

        return total/this.scores.size();
    }
}
