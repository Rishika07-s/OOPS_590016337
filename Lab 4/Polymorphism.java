class Subject {
    int sum(int a, int b){
        return a+b;

    }
}
class BMW extends Subject{
    //override
    int sum(int a, int b){
        return a-b;

    }
    // not using override
    int display(){
        int v=super.sum(4,5);
        return v;
    }
}

 class Polymorphism{
    public static void main(String[] args) {
        Subject d=new Subject();
        BMW e=new BMW();
         System.out.println(e.sum(2,3));
        System.out.println(d.sum(2,3));
    }
}