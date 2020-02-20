package com.mbouchenoire.competitive.programming.hashcode.qualification2020.model;

public final class Book {

    public final int id;
    public final int score;

    public Book(int id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    int score() {
        return score;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
