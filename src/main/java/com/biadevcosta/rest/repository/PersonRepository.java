package com.biadevcosta.rest.repository;

import com.biadevcosta.rest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
