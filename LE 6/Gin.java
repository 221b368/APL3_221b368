class Gin extends Decorator{
    public Gin(Offering offering){
        this.offering=offering;
    }
    
    public String getName(){
        return offering.getName()+" with Gin";
    }
    public int getPrice(){
        return offering.getPrice()+60;
    }
}