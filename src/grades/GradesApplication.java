package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {




    public static void gradeApp(Map<String,Student> input) {
        Input test = new Input();
        System.out.println("Welcome\n");
        System.out.println("Here are the github usernames of our students:\n");
    do {
        String usernames = "|";
        for (String key : input.keySet()){
            usernames += " " + key + " |";
        }
        System.out.println(usernames);
            System.out.println("\n\nWhat student would you like to see more information on?");
            String studentResponse = test.getString();
            String convertedResponse = studentResponse.toLowerCase();
            if (input.containsKey(convertedResponse)) {
                System.out.printf("\nName: %s - Github Username: %s \n" +
                                  "Current Average: %s\n", input.get(convertedResponse).getName(), convertedResponse, input.get(convertedResponse).getGradeAverage());
                System.out.print("List of student Grades:");
                String commas = " ";
                for (int x : input.get(convertedResponse).getGrades()) {
                    commas += ", " + x + "";
                }
                System.out.println(commas);
                System.out.println();
            } else {
                System.out.printf("Sorry, no student found with the github username of  \"%s\" \n", convertedResponse);
            }
        System.out.println("\nWould you like to see another student?");
        } while (test.yesNo());
    }


//    public void classAverage(Map<String,Student> input) {
//        for (String k : input.get()) {
//            System.out.println(k);
//        }
//
//    }



    public static void main(String[] args) {

        //
        Map<String,Student> students = new HashMap<>();


        Student s1 = new Student("Colt");
        Student s2 = new Student("Ty");
        Student s3 = new Student("Peyton");
        Student s4 = new Student("Chad");

        s1.addGrade(89);
        s1.addGrade(100);
        s1.addGrade(78);
        s1.addGrade(91);

        s2.addGrade(99);
        s2.addGrade(76);
        s2.addGrade(89);
        s2.addGrade(83);

        s3.addGrade(67);
        s3.addGrade(71);
        s3.addGrade(88);
        s3.addGrade(78);

        s4.addGrade(100);
        s4.addGrade(100);
        s4.addGrade(100);
        s4.addGrade(95);

//        System.out.println(s4.getGradeAverage());

        students.put("coltyboy",s1);
        students.put("tymagnifiction",s2);
        students.put("peydawg",s3);
        students.put("chadhunter",s4);


        gradeApp(students);














    }
}
