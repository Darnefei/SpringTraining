package tech.leonhardmaier.springwebapp.Repository;

import org.springframework.data.repository.CrudRepository;
import tech.leonhardmaier.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
