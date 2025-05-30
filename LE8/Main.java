/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main{
    public static void main(String[] args){
        Crow crow = new IndianCrow();
        
        CrowAdapter adapter = new CrowAdapter(crow);
        
        client(adapter);
    }
    private static void client(Swan swan){
        swan.sing();
        swan.eat();
        swan.swim();
    }
}