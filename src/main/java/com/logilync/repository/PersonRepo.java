package com.logilync.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.logilync.domain.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
