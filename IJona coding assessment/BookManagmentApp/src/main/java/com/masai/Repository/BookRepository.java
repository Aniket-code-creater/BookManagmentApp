package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entiy.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
