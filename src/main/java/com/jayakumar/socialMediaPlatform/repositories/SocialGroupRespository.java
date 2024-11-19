package com.jayakumar.socialMediaPlatform.repositories;

import com.jayakumar.socialMediaPlatform.model.SocialGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialGroupRespository extends JpaRepository<SocialGroup,Long> {
}
