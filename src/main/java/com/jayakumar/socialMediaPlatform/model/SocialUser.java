package com.jayakumar.socialMediaPlatform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(mappedBy = "socialUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private SocialProfile profile;




    @OneToMany(mappedBy = "user")
    private List<Post> posts=new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "user_group",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "group_id"))

    private Set<SocialGroup> groups=new HashSet<>();

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
//used for bidirectional relationship
    public void setProfile(SocialProfile socialProfile) {
        this.profile = socialProfile;
        if(socialProfile!=null)
        {
            profile.setSocialUser(this);

        }
    }
}
