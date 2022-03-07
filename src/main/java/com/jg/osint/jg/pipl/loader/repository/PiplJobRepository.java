package com.jg.osint.jg.pipl.loader.repository;

import com.jg.osint.jg.pipl.loader.domain.PiplJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the PiplJob entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PiplJobRepository extends JpaRepository<PiplJob, Long> {}
