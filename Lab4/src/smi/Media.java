package smi;

import troubles.InvalidMessageException;

public interface Media {
    void say();
    static final String message = "Карлсон у себя дома";
    static String getMessage(){
        String msg = message;
        try{
            if (msg.equals(""))
                 throw new InvalidMessageException("Извините, мы не можем "
                         + "найти нужное сообщение:(", "*Здесь могла бы быть "
                                 + "ваша реклама* Мы не смогли тему для "
                                 + "репортажа");   
        }catch(InvalidMessageException e){
            System.out.println(e.getMessage());
            msg = e.getReplacement();
        }
        return msg;
    } 
}
