package com.mbouchenoire.competitive.programming.hashcode.common;

import java.util.List;

public final class HashCodeSolution {

    private final List<String> output;
    private final int score;

    public HashCodeSolution(List<String> output, int score) {
        this.output = output;
        this.score = score;
    }

    public List<String> getOutput() {
        return output;
    }

    public int getScore() {
        return score;
    }
}
