package oop;

public class Parent {
    public String inherittedString;

//    public Parent(String str) {
//        this.inherittedString = str;
//    }

    public void inherittedMethod(){
        System.out.printf("Hello from %s",this.inherittedString);
    }

   public Parent() {
        this.inherittedString = "parent";

   }

    public static void main(String[] args) {

        Parent parent = new Parent();

        parent.inherittedMethod();

    }
}
