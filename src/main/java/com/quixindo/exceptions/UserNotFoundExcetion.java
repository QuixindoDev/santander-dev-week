package com.quixindo.exceptions;

public class UserNotFoundExcetion extends RuntimeException{
    public UserNotFoundExcetion(){
        super("Usuario nao encontrado no sistema");
    }

    public UserNotFoundExcetion(String message){
        super(message);
    }
}
