package com.jayakumar.socialMediaPlatform.repositories;



import com.jayakumar.socialMediaPlatform.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialPostRespository extends JpaRepository<Post,Long> {
}
