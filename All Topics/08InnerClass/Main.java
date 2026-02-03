


class Outerclass{
    static int number = 10;
    String name = "Outerclass";

    static class Innerclass{
        public void execute(){
            System.out.println("Inside the inner class : ");
        }
    }
    //rare use cases
    // public void execute(){
    //     Innerclass innerclass = new Innerclass();
    //     innerclass.execute();
    // }
}


public class Main {
    public static void main(String[] args){
        Outerclass.Innerclass innerclass1 = new Outerclass.Innerclass();
        innerclass1.execute();
    }
    
}
