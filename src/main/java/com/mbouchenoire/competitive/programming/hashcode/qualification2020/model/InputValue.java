package com.mbouchenoire.competitive.programming.hashcode.qualification2020.model;

import java.util.List;
import java.util.Map;

public final class InputValue {

    public final Map<Integer, Book> books;
    public final List<Library> libraries;

    public InputValue(Map<Integer, Book> books, List<Library> libraries) {
        this.books = books;
        this.libraries = libraries;
    }
}
