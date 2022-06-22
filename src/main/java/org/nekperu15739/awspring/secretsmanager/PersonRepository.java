package org.nekperu15739.awspring.secretsmanager;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonRepository extends CrudRepository<Person, UUID> {

}
