package com.sebli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResumeMaker {

    ArrayList<Person> jobSeekers;


    public ResumeMaker() {
        jobSeekers = new ArrayList<>();

    }


    public void resumeBuilder() {
        Scanner input = new Scanner(System.in);
        String anyOtherPerson = "";
        do {
            Person person = new Person();
        //  Create a new object called person of type(class) Person
       // Ask the user for  personal information
            System.out.println("Your Name:");
            String name = input.nextLine();
            System.out.println("Your E-Mail Adrress:");
            String email = input.nextLine();
            System.out.println("Your Phone Number:");
            String phoneNumber = input.nextLine();
       //  Set the name and email and phone number variables to the new object person
            person.setName(name);
            person.setEmail(email);
            person.setPhoneNumber(phoneNumber);

            System.out.println("Do you have any Educational Background?(Yes/No)");
            String anyEducation = "";
            anyEducation = input.nextLine();
       //If the user has experience call the method Experience
            if (anyEducation.equalsIgnoreCase("Yes")) {
                education(person, input);
            }


            System.out.println("Do you have any Experience?(Yes/No)");
            String anyExperinces = "";
            anyExperinces = input.nextLine();
     //If the Person has Educational back Ground call the method Education
             if (anyExperinces.equalsIgnoreCase("Yes")) {
                experience(person, input);
            }
            System.out.println("Do you have any skills?(Yes/No)");
            String anySkills = "";
            anySkills = input.nextLine();
     //If the person has skills call the method skill
            if (anySkills.equalsIgnoreCase("Yes")) {
                skill(person, input);
            }
     // Add the person to the list of Job Seekers every time the loop runs
            jobSeekers.add(person);

            System.out.println("Any Other Person to build a resume? (Yes/No)");
            anyOtherPerson=input.nextLine();
        } while (anyOtherPerson.equalsIgnoreCase("yes"));
    //call the printAll method to print all resumes
        printAll(jobSeekers);
    }


    public void education(Person aperson, Scanner input) {
        //Ask the user for educational background
        System.out.println("\n*Education*\n ");
        //Declare a Sting variable anyEducation to use it in the condition for the do loop and initialize it to empty String,
       // if the user says yes for the question "do you have any other education achievement" then the loop continues
        String anyEducation = "";

        do {
       // Create a new object called ed of class type Education
            Education ed = new Education();
            System.out.println("Field Of Study:");
            String fieldofstudy = input.nextLine();
            System.out.println("Name of school");
            String nameofschool = input.nextLine();
            System.out.println("Year of Graduation:");
            String yearofgraduation = input.nextLine();

       // Set the variables (nameofschool,fieldofstudy,yearofgraduation) to the new object ed
            ed.setNameOfSchool(nameofschool);
            ed.setField(fieldofstudy);
            ed.setYearOfGrad(yearofgraduation);
       // Add the new object ed to the educations list for the person
            aperson.getEducations().add(ed);
       // Ask the user if they have any other Education if yes the loop continues if no it will end

            System.out.println("Do you have any other Education achievement?");
            anyEducation = input.nextLine();

        } while (anyEducation.equalsIgnoreCase("Yes"));

    }

    public void experience(Person aperson, Scanner input) {

        System.out.println("\n*Experience*");
        String anyExperience = "";
        do {
        // Create a new object called exp of class type Education
            Experience exp = new Experience();

       // Ask the user for inputs and set the variables to the new exp
            System.out.println("\nPosition:");
            String position = input.nextLine();
            System.out.println("\nCompany Name:");
            String companyName = input.nextLine();
            System.out.println("From Date:");
            String fromDate = input.nextLine();
            System.out.println("To Date");
            String toDate = input.nextLine();
            exp.setPosition(position);
            exp.setCompanyName(companyName);
            exp.setFromDate(fromDate);
            exp.setToDate(toDate);

        // Ask the user for duties input and set it to the duties list of the new exp
       // we need a loop because we may have more than duty for each exp
            String anyDuty = "";
            int count = 1;
            do {
                System.out.println("\nDuty" + count + ":");
                String duty = input.nextLine();
       //Add each duty inserted to the duties ArrayList
                exp.getDuty().add(duty);
                System.out.println("Any other Duties?");
                anyDuty = input.nextLine();
                count++;
            } while (anyDuty.equalsIgnoreCase("yes"));


       //Add the new exp to the Arralist experiences each time the loop runs
            aperson.getExperiences().add(exp);
            System.out.println("\nDo you have any other Experience? ");
            anyExperience = input.nextLine();

        } while (anyExperience.equalsIgnoreCase("yes"));
    }

    public void skill(Person aPerson, Scanner input) {

        //Declare a Sting variable anySkills to use it in the condition for the do loop and initialize it to empty String,
       // if the user says yes for the question "do you have any other Skills" then the loop continues

        System.out.println("\n*Skills*\n ");
        String anySkills = "";
       //create a  new ArrayLis of the class type Skills called skills
        do {
      // Create a new object called ski of class type Skills
            Skill ski = new Skill();
            System.out.println("Skill:");
            String skill = input.nextLine();
            System.out.println("Select the Competency Proficiency rating:\n- Fundamental, \n-Novice, \n-Intermediate, \n-Advanced, \n-Expert");
            String rating = input.nextLine();
            // Set the variables (skill and rating) to the new object ski
            ski.setSkills(skill);
            ski.setRating(rating);
            // Add the new object ski to the list of skills of the person
            aPerson.getSkills().add(ski);
            // Ask the user if they have any other Skills if yes the loop continues if no it will end
            System.out.println("\nAny other Skills?");
            anySkills = input.nextLine();
        } while (anySkills.equalsIgnoreCase("Yes"));
    }

    public void printAll(ArrayList<Person> jobSeekers) {
        for (Person eachPerson : jobSeekers) {
            System.out.println("==============================================================================================");
            System.out.println(eachPerson.getName() + "\n" + eachPerson.getEmail() +"\n"+ eachPerson.getPhoneNumber()+"\n");
           if (eachPerson.getEducations().isEmpty()){
               System.out.println("No Educational BackGround");
           }
           else {
               System.out.println("**Education**");
               for (Education edu : eachPerson.getEducations()) {
                   System.out.println(edu.getField() + ",\n" + edu.getNameOfSchool() + "," + edu.getYearOfGrad() + "\n");
               }
           }
           if (eachPerson.getExperiences().isEmpty()){
               System.out.println("Zero Experience ");
           }
           else {
               System.out.println("**Experience**");

               for (Experience ex : eachPerson.getExperiences()) {
                   System.out.println(ex.getPosition() + "\n" + ex.getCompanyName() + "," + "From " + ex.getFromDate() +
                           " - " + ex.getToDate());
                   for (String duty : ex.getDuty()) {
                       int count = 1;
                       System.out.println("\tDuty" + count + ". " + duty);
                       count++;
                   }
               }
           }
           if (eachPerson.getSkills().isEmpty()){
               System.out.println("No Skills");
           }
           else {
               System.out.println("\n**Skills**");
               for (Skill sk : eachPerson.getSkills()) {
                   System.out.println(sk.getSkills() + "," + sk.getRating());
               }
           }

        }

    }
}
