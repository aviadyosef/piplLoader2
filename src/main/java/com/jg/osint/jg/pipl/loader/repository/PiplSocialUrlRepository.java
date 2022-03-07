package com.jg.osint.jg.pipl.loader.repository;

import com.jg.osint.jg.pipl.loader.domain.PiplSocialUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the PiplSocialUrl entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PiplSocialUrlRepository extends JpaRepository<PiplSocialUrl, Long> {}
