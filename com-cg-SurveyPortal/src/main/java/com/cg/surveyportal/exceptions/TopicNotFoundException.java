package com.cg.surveyportal.exceptions;

public class TopicNotFoundException extends Exception{

    public TopicNotFoundException(){

    }

    public TopicNotFoundException(String msg){
        super(msg);
    }
}
