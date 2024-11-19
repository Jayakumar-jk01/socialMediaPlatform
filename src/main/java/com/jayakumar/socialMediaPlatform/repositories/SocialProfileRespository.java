package com.jayakumar.socialMediaPlatform.repositories;


import com.jayakumar.socialMediaPlatform.model.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialProfileRespository extends  JpaRepository<SocialProfile,Long> {
}
