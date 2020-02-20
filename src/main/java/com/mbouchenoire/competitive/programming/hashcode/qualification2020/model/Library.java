package com.mbouchenoire.competitive.programming.hashcode.qualification2020.model;

import java.util.Set;

public final class Library {

    public final int id;
    public final int signupLength;
    public final int booksPerDay;
    public final Set<Book> books;

    private double signupScore = -1;

    public Library(int id, int signupLength, int booksPerDay, Set<Book> books) {
        this.id = id;
        this.signupLength = signupLength;
        this.booksPerDay = booksPerDay;
        this.books = books;
    }

    public double signupScore() {
        if (signupScore != -1)
            return signupScore;

        signupScore = (1d / signupLength) + (booksPerDay * books.size());

        return signupScore;
    }
}
