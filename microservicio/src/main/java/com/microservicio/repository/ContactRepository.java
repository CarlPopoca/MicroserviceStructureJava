package com.microservicio.repository;

import org.springframework.stereotype.Repository;
import com.microservicio.model.Contact;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {

}

