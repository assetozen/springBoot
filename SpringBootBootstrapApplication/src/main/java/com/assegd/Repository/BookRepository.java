package com.assegd.Repository;

import com.assegd.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository {
    List<Book> findByTitle(String title);

    Book save(Book book);
}
