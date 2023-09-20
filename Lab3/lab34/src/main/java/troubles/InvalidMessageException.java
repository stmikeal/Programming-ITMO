/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troubles;

/**
 *
 * @author mike
 */
public class InvalidMessageException extends Exception{
    private String replacement;
    public String getReplacement(){
        return replacement;
    }
    public InvalidMessageException(String message, String newMessage){
        super(message);
        this.replacement = newMessage;
    }
}
