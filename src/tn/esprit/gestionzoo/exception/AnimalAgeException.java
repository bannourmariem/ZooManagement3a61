package tn.esprit.gestionzoo.exception;

public class AnimalAgeException extends Exception {

    public AnimalAgeException(){}
    public AnimalAgeException(String msg){
        super("invalid animal age");
    }
}
