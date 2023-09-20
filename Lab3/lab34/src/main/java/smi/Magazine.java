package smi;

public class Magazine implements Media {
    private final String[] title = {"Алла Пугачева похудела на g64 килограммов", 
                Media.getMessage(), "Хроники Карабумбы"};
    
    public Magazine(){
        System.out.println("Журналы уже покрыты глянцем.");
    }
    
    @Override
    public void say(){
        System.out.println("Журналы подготовили к печати заголовки:\n");
        for (String t:title){
            System.out.println("\""+t+"\",\n");
        }
        System.out.println("И скоро эти развороты выйдут в свет.");
    }
    
    @Override
    public int hashCode() {
        return super.hashCode()+this.title.hashCode(); 
    }

    @Override
    public String toString() {
        return  "Magazine, "+this.title.toString(); 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()== Magazine.class){
            Magazine cloned = (Magazine)obj;
            if (this.title.equals(cloned.title)){
                return true;
            }
        }
        return false;
    }
}
