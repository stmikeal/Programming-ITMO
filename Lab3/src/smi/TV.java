package smi;

public class TV implements Media {
    private final String reportage;
    
    public TV(){
        this.reportage = Media.message;
        System.out.println("Сотрудники телевидения уже выехали на "
                + "место событий");
    }
    
    @Override
    public void say(){
        System.out.println("Все телевизоры сегодня покажут передачу: \""+
                this.reportage+"\".");
    };
    
    @Override
    public int hashCode() {
        return super.hashCode()+this.reportage.hashCode(); 
    }

    @Override
    public String toString() {
        return  "TV, "+this.reportage; 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()== TV.class){
            TV cloned = (TV)obj;
            if (this.reportage==cloned.reportage){
                return true;
            }
        }
        return false;
    }
}
