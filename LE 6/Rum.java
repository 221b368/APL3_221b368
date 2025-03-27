class Rum extends Decorator{
    public Rum(Offering offering){
        this.offering=offering;
    }
    
    public String getName(){
        return offering.getName()+" with Rum";
    }
    public int getPrice(){
        return offering.getPrice()+55;
    }
}