package com.jg.osint.jg.pipl.loader.repository;

import com.jg.osint.jg.pipl.loader.domain.PiplPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the PiplPerson entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PiplPersonRepository extends JpaRepository<PiplPerson, Long> {}
