package com.jayakumar.socialMediaPlatform.service;

import com.jayakumar.socialMediaPlatform.model.SocialUser;
import com.jayakumar.socialMediaPlatform.repositories.SocialUserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {


    @Autowired
    private SocialUserRespository socialUserRespository;


    public List<SocialUser> getAllUsers() {

       return socialUserRespository.findAll();
    }

    public SocialUser createUser(SocialUser socialUser) {

        return socialUserRespository.save(socialUser);
    }
}
