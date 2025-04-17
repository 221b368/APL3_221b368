/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main{
    public static void main(String[] args){
        Offering offering= new Tea();
        offering=new Rum(offering);
        offering=new Gin(offering);
        System.out.println(offering.getName()+" ......price: "+offering.getPrice());
    }
}