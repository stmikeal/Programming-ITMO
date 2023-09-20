package smi;

public class News implements Media{
    private final String title;
    
    public News(){
        this.title = Media.message;
        System.out.println("Газеты готовы к печати.");
    }
    
    @Override
    public void say(){
        System.out.println("Все газеты выходят с заголовком: \""+
                this.title+"\".");
    };
    
    @Override
    public int hashCode() {
        return super.hashCode()+this.title.hashCode(); 
    }

    @Override
    public String toString() {
        return  "News, "+this.title; 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()== News.class){
            News cloned = (News)obj;
            if (this.title==cloned.title){
                return true;
            }
        }
        return false;
    }
}
