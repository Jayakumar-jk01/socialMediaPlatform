package com.jayakumar.socialMediaPlatform;


import com.jayakumar.socialMediaPlatform.model.Post;
import com.jayakumar.socialMediaPlatform.model.SocialGroup;
import com.jayakumar.socialMediaPlatform.model.SocialProfile;
import com.jayakumar.socialMediaPlatform.model.SocialUser;
import com.jayakumar.socialMediaPlatform.repositories.SocialGroupRespository;
import com.jayakumar.socialMediaPlatform.repositories.SocialPostRespository;
import com.jayakumar.socialMediaPlatform.repositories.SocialProfileRespository;
import com.jayakumar.socialMediaPlatform.repositories.SocialUserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    private SocialGroupRespository socialGroupRespository;
    private SocialPostRespository socialPostRespository;
    private SocialProfileRespository socialProfileRespository;
    private SocialUserRespository socialUserRespository;

    @Autowired
    public DataInitializer(SocialGroupRespository socialGroupRespository,
                           SocialPostRespository socialPostRespository,
                           SocialProfileRespository socialProfileRespository,
                           SocialUserRespository socialUserRespository) {
        this.socialGroupRespository = socialGroupRespository;
        this.socialPostRespository = socialPostRespository;
        this.socialProfileRespository = socialProfileRespository;
        this.socialUserRespository = socialUserRespository;
    }

    @Bean
    public CommandLineRunner initializeDate()
    {
        return args -> {

            SocialUser user1=new SocialUser();
            SocialUser user2=new SocialUser();
            SocialUser user3=new SocialUser();

            socialUserRespository.save(user1);
            socialUserRespository.save(user2);
            socialUserRespository.save(user3);



            Post post1=new Post();
            Post post2=new Post();
            Post post3=new Post();
            socialPostRespository.save(post1);
            socialPostRespository.save(post2);
            socialPostRespository.save(post3);



            user1.getPosts().add(post1);
            user1.getPosts().add(post2);
            user3.getPosts().add(post3);

            post1.setUser(user1);
            post2.setUser(user1);
            post3.setUser(user3);

            SocialGroup group1=new SocialGroup();
            SocialGroup group2=new SocialGroup();
            socialGroupRespository.save(group1);
            socialGroupRespository.save(group2);

            group1.getSocialUsers().add(user1);
            group1.getSocialUsers().add(user2);
            group1.getSocialUsers().add(user3);

            group2.getSocialUsers().add(user2);
            group2.getSocialUsers().add(user3);

            user1.getGroups().add(group1);
            user2.getGroups().add(group1);
            user2.getGroups().add(group2);
            user3.getGroups().add(group1);
            user3.getGroups().add(group2);

            socialUserRespository.save(user1);
            socialUserRespository.save(user2);
            socialUserRespository.save(user3);



            socialGroupRespository.save(group1);
            socialGroupRespository.save(group2);

            socialPostRespository.save(post1);
            socialPostRespository.save(post2);
            socialPostRespository.save(post3);

            SocialProfile profile1=new SocialProfile();
            SocialProfile profile2=new SocialProfile();
            SocialProfile profile3=new SocialProfile();

            socialProfileRespository.save(profile1);
            socialProfileRespository.save(profile2);
            socialProfileRespository.save(profile3);


            profile1.setSocialUser(user1);
            profile2.setSocialUser(user2);
            profile3.setSocialUser(user3);

            socialProfileRespository.save(profile1);
            socialProfileRespository.save(profile2);
            socialProfileRespository.save(profile3);









        };
    }
}
