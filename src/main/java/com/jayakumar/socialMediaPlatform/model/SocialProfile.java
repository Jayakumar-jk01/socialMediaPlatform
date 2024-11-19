package com.jayakumar.socialMediaPlatform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "social_user_id")
    @JsonIgnore
    private SocialUser socialUser;

    private String description;

    public void setSocialUser(SocialUser socialUser) {
        this.socialUser = socialUser;
        if(socialUser.getProfile()!=this)
        {
            socialUser.setProfile(this);
        }

    }
}
