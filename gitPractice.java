//Testing out git hub in VS Code
//Testing the second commit
//Testing third commit

import java.util.HashMap;

class GitPractice {

/**
* The goal is to create profiles for students as their names are inputed from a text file
* and their id is a number that starts from 4050000 and increments by 1.
* 
* For now, we'll hard code the student names to work on incrementing the ids and then we'll
* work on reading in a text file.
 */
    public static void main (String[] args){
        HashMap<String, Integer> studentProfileMap = new HashMap<>();

        int startingId = 405000;

        studentProfileMap.put("James", startingId += 1);

        System.out.println(studentProfileMap);
    }
}