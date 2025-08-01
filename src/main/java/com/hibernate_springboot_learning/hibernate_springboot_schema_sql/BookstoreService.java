package com.hibernate_springboot_learning.hibernate_springboot_schema_sql;

import org.springframework.stereotype.Service;

import com.hibernate_springboot_learning.hibernate_springboot_schema_sql.entity.Author;
import com.hibernate_springboot_learning.hibernate_springboot_schema_sql.repository.AuthorRepository;

@Service
public class BookstoreService {

	private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author persistAuthor() {
        Author author = new Author();
        author.setName("Joana Nimar");
        author.setGenre("History");
        author.setAge(34);

        return authorRepository.save(author);
    }
}
