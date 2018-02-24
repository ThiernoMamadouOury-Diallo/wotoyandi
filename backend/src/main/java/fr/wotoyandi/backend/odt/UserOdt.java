package fr.wotoyandi.backend.odt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
public class UserOdt implements Serializable{
     String userId;
     String password;
     public UserOdt(){

     }

    @Override
    public String toString() {
        return "userId=" + userId + ", password=" + password;
    }



}
