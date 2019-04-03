package oop;

public class ExceptionsSandbox {


    public static void main(String[] args) {


        ///This is the basics
        String[] words = {"one","two","three"};
//        try {
//            System.out.println(words[8]);
//        } catch (Exception e) {
//            System.out.println("there was an exception");
//        }


        try {


            System.out.println(words[2]);
            throw new Exception("You didn't get it");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("We are catching the built in exception");
            System.out.println(ex);

        } catch (Exception e) {
            System.out.println("We are catching our own exception");
            System.out.println(e);
        }

        System.out.println("Here we are at the end of our program!");



    }
}
