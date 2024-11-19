package com.jayakumar.socialMediaPlatform.repositories;

import com.jayakumar.socialMediaPlatform.model.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialUserRespository extends JpaRepository<SocialUser,Long> {
}
