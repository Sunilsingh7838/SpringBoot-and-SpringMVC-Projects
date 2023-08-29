package org.composite.repository;

import org.composite.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer>{

}
