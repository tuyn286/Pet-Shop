package com.laptrinhweb.hashing;

import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
@Data
public class HashingPassword {
    public String hashedPass(String pass){
        String salt = BCrypt.gensalt();
        return BCrypt.hashpw(pass,salt);
    }

    public boolean isCorrectPass(String enteredPass,String hashed_pass){
        if(BCrypt.checkpw(enteredPass,hashed_pass))
            return true;
        else
            return false;
    }
}
