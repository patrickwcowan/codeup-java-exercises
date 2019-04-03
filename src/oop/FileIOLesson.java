package oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIOLesson {



    //Method that will print out my file
    public static void retrieveContent(Path input,String input2) {
        try {
            List<String> lines = Files.readAllLines(input);

            int nameIndex = lines.indexOf(input2);
            String name  = lines.get(nameIndex);
            String number = lines.get(nameIndex+1);

            System.out.printf("Name: %s Number: %s",name,number);

    } catch (IOException ex) {
            System.out.println(ex);
        }
    }




    public static void retrieveAll(Path input) {
        try {
            List<String> lines = Files.readAllLines(input);
            for (int i = 0;i<lines.size();i = i + 2) {
                String name  = lines.get(i);
                String number = lines.get(i+1);
                System.out.printf("Name: %s Number: %s\n",name,number);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }








    public static void main(String[] args) {
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory,filename);




        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }



            //Write my file

//            List<String> people = new ArrayList<>();
//            people.add("patrick");
//            people.add("jason");
//            people.add("howard");
//            Files.write(dataFile,people);



//            //append my file
//            Files.write(
//                    Paths.get(directory, filename),
//                    Arrays.asList("Adrien"),
//
//                    StandardOpenOption.APPEND
//            );





            ////Read my file
//            List<String> lines = Files.readAllLines(dataFile);
//
//            for (String line : lines) {
//                System.out.println(line);
//            }


            retrieveContent(dataFile,"James");

//            retrieveAll(dataFile);








        } catch (IOException ioe) {
            System.out.println(ioe);
        }




    }
}
