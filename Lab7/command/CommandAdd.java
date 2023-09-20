package command;

import element.Worker;
import java.io.IOException;
import tools.Speaker;
import tools.ReadWorker;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;

/**
 * Класс-команда add.
 *
 * @author mike
 */
public class CommandAdd extends Command{

    /**
     * Интерактивный метод добавления. Получает на вход поток, с которого
     * подаются данные работика, обрабатывает их и добавляет в коллекцию.
     *
     */
    
    private Worker worker;
    
    public CommandAdd(String ... args){
        try {
            this.worker = ReadWorker.read(System.in);
            this.ready = true;
        } catch(IOException e) {
            Speaker.println(Speaker.FontColor.RED, "Не удалось добавить работника. "
                    + "IOException thrown from <Command Add>.");
        }
    }
    
    @Override
    public Speaker event(TreeSet<Worker> collection) throws ExecutionException{
        try {
            collection.add(worker);
            speaker = new Speaker("Мы добавили элемент в коллекцию!");
            speaker.success();
            return speaker;
        } catch (Exception e) {
            speaker = new Speaker("Мы не смогли добавить элемент в коллекцию.");
            speaker.error();
            return speaker;
        }
    }
}
