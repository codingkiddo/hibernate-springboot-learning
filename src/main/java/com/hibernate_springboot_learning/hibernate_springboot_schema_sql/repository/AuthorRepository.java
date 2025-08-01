package com.hibernate_springboot_learning.hibernate_springboot_schema_sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate_springboot_learning.hibernate_springboot_schema_sql.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}