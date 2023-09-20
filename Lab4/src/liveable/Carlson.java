package liveable;

public class Carlson extends Creature{
    private Sweet sweet = new Sweet();
    
    public Carlson(){
        this.name = "Карлсон";
        sweet.changeProperty("самое вкусное", "малиновое");
        System.out.println("Карлсон прилетел (создан).");
    }
    
    public void buzzing(){
        class Motor{
            private String noise = "бзз-бзз";
            public Motor(){}
            public Motor(String s){
                this.noise = s;
            }
            public String sound() {
                return "*"+this.noise+"* Полетели!";
            }
        }
        Motor m = new Motor();
        System.out.println(this.getName()+
                " заводит моторчик: "+m.sound());
        System.out.println("А где мое "+this.sweet.say()+"?");
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.name.hashCode(); 
    }

    @Override
    public String toString() {
        return "Carlson, "+this.name; 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()==Carlson.class){
            return true;
        }
        return false;
    }
    
    class Sweet{
        private String name = "Варенье";
        private String[] property;
        public Sweet(){}
        public Sweet(String arg){this.name = arg;}
        public void changeProperty(String ... newProperty){
            this.property = newProperty.clone();
        }
        public String say(){
            String result = "";
            if (!(property == null)){
                for (String s:property) {
                    result+=s+" ";
                }
            }
            return result+name;
        }
    }
}
