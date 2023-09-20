package liveable;

import smi.*;

public class Parent extends Human{
    private final SMI subject = new SMI();
    
    public Parent(Creature carlson){
        this(carlson, "");
    }
    
    public Parent(Creature carlson, String s){
        super(carlson, s);
    }
    
    public void imagine(){
        System.out.println(this.getName()+
                " представляет, что произойдёт,"
                + " если кто-нибудь узнает о Карлсоне:");
        subject.say();
        System.out.println(this.getName()+": Ужас!");
    }
    
    @Override
    public int hashCode() {
        return super.hashCode()+this.subject.hashCode(); 
    }

    @Override
    public String toString() {
        return  "Parent, "+this.name+", "+this.attitude.toString()+", "
                +this.interlocuter.toString()+", "+this.subject.toString(); 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()==Parent.class){
            Parent cloned = (Parent)obj;
            if (this.name==cloned.name&&this.interlocuter==cloned.interlocuter&&
                    this.attitude==cloned.attitude&&
                    this.subject.equals(cloned.subject)){
                return true;
            }
        }
        return false;
    }
    
    static class SMI implements Media{
        private final String[] statement = {"Алла Пугачева похудела "
                + "на g64 килограммов", 
                Media.getMessage(), "Хроники Карабумбы"};
        private final Media[] subject = new Media[3];
        
        public SMI(){
            
            subject[0] = new Media() {
                private final String title = Media.getMessage();
                @Override
                public void say(){
                    System.out.println("Все газеты выходят с заголовком: \""+
                    this.title+"\".");
                };
            };
            
            subject[1] = new Media() {
                private final String[] title = statement.clone();
                @Override
                public void say(){
                    System.out.println("Журналы подготовили к печати заголовки:\n");
                    for (String t:title){
                        System.out.println("\""+t+"\",\n");
                    }
                    System.out.println("И скоро эти развороты выйдут в свет.");
                }
            };
            
            subject[2] = new Media() {
                private final String reportage = Media.getMessage();
                @Override
                public void say(){
                    System.out.println("Все телевизоры сегодня покажут "
                            + "передачу: \""+this.reportage+"\".");
                };
            };
        }
        @Override
        public void say(){
            for (Media m:subject){
                m.say();
            }
        }
    }
}
