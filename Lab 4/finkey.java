// class A{
 
// }
//   final class B{
//     static int variable;}
//     class Main{
//         public static void(){
//             a=new A();
//             b=new B();
//             variable =12;

//         }

        
//     }
//   }  
// }
final class A{
   static int variable;
    void display(){
        System.out.println("This is a final class");
    }
}
class Main{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        A.variable=12;
        
        System.out.println("The value of variable is: "+A.variable);
 
    }
}