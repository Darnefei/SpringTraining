package tech.leonhardmaier.springwebapp.Repository;

import org.springframework.data.repository.CrudRepository;
import tech.leonhardmaier.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
