package day27exceptions;
//Eger Exception Class'a extend ederseniz sizin Class'iniz "Compile Time Exception" olur
public class IllegalGreatException extends Exception{
    public IllegalGreatException(String message){
        super(message);
    }

}
