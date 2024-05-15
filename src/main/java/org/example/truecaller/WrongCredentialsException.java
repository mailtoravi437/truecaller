package org.example.truecaller;

public class WrongCredentialsException extends RuntimeException{
    public WrongCredentialsException(){
        super("Wrong Credentials");
    }
}
