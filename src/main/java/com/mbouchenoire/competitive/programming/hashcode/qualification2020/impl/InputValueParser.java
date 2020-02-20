package com.mbouchenoire.competitive.programming.hashcode.qualification2020.impl;

import com.mbouchenoire.competitive.programming.hashcode.common.HashCodeInputValueParser;
import com.mbouchenoire.competitive.programming.hashcode.qualification2020.model.Book;
import com.mbouchenoire.competitive.programming.hashcode.qualification2020.model.InputValue;
import com.mbouchenoire.competitive.programming.hashcode.qualification2020.model.Library;

import java.util.*;

public class InputValueParser implements HashCodeInputValueParser<InputValue> {

    @Override
    public InputValue parse(Scanner scanner) {
        // scanner.nextLine()
        final String[] firstLine = scanner.nextLine().split(" ");
        final int bookCount = Integer.parseInt(firstLine[0]);
        final int libraryCount = Integer.parseInt(firstLine[1]);
        final int dayCount = Integer.parseInt(firstLine[2]);

        final String[] bookIdStrings = scanner.nextLine().split(" ");

        final Map<Integer, Book> books = new HashMap<>(bookCount);

        for (int bookId = 0; bookId < bookCount; bookId++) {
            final int bookScore = Integer.parseInt(bookIdStrings[bookId]);
            final Book book = new Book(bookId, bookScore);
            books.put(bookId, book);
        }

        final List<Library> libraries = new ArrayList<>(libraryCount);

        for (int libraryId = 0; libraryId < libraryCount; libraryId++) {
            final String[] libraryFirstLine = scanner.nextLine().split(" ");
            final int libraryBookCount = Integer.parseInt(libraryFirstLine[0]);
            final int signupLength = Integer.parseInt(libraryFirstLine[1]);
            final int booksPerDay = Integer.parseInt(libraryFirstLine[2]);

            final String[] librarySecondLine = scanner.nextLine().split(" ");
            final Set<Book> libraryBooks = new HashSet<>(libraryBookCount);

            for (int libraryBookIndex = 0; libraryBookIndex < libraryBookCount; libraryBookIndex++) {
                final int libraryBookId = Integer.parseInt(librarySecondLine[libraryBookIndex]);
                final Book libraryBook = books.get(libraryBookId);
                libraryBooks.add(libraryBook);
            }

            final Library library = new Library(libraryId, signupLength, booksPerDay, libraryBooks);

            libraries.add(library);
        }

        return new InputValue(books, libraries);
    }
}
