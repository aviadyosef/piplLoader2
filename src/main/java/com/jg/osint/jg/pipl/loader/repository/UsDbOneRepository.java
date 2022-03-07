package com.jg.osint.jg.pipl.loader.repository;

import com.jg.osint.jg.pipl.loader.domain.UsDbOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the UsDbOne entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UsDbOneRepository extends JpaRepository<UsDbOne, Long> {}
