package com.mbouchenoire.competitive.programming.hashcode.qualification2020.impl;

import com.mbouchenoire.competitive.programming.hashcode.common.HashCodeAlgorithm;
import com.mbouchenoire.competitive.programming.hashcode.common.HashCodeLogger;
import com.mbouchenoire.competitive.programming.hashcode.common.HashCodeSolution;
import com.mbouchenoire.competitive.programming.hashcode.qualification2020.model.Book;
import com.mbouchenoire.competitive.programming.hashcode.qualification2020.model.InputValue;
import com.mbouchenoire.competitive.programming.hashcode.qualification2020.model.Library;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicAlgorithm implements HashCodeAlgorithm<InputValue> {

    @Override
    public HashCodeSolution run(InputValue input, HashCodeLogger logger) {
        final Map<Integer, Book> books = input.books;
        final List<Library> libraries = input.libraries;

        final Set<Book> scannedBooks = new HashSet<>();

        final List<Library> sortedLibraries = libraries.stream()
                .sorted(Comparator.comparingDouble(Library::signupScore))
                .collect(Collectors.toList());


        final int librariesToSignupCount = sortedLibraries.size();

        final List<String> outputLines = new ArrayList<>(1 + (librariesToSignupCount * 2));

        outputLines.add(String.valueOf(librariesToSignupCount)); // file first line

        int score = 0;

        sortedLibraries
                .forEach(library -> {
                    final List<Book> booksToScan = library.books.stream()
                            .filter(book -> !scannedBooks.contains(book))
                            .sorted((o1, o2) -> Integer.compare(o2.score, o1.score))
                            .peek(scannedBooks::add)
                            .collect(Collectors.toList());

                    if (booksToScan.isEmpty())
                        return;

                    final String libraryFirstLine = library.id + " " + booksToScan.size();
                    outputLines.add(libraryFirstLine); // library first line

                    final String librarySecondLine = booksToScan.stream()
                            .map(book -> Integer.toString(book.id))
                            .collect(Collectors.joining(" "));

                    outputLines.add(librarySecondLine); // library second line
                });

        return new HashCodeSolution(outputLines, -1);
    }
}
