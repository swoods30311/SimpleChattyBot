import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String age = scanner.next();
        String stageOfEducation = scanner.next();
        String yearsOfExperience = scanner.next();
        String cuisinePreference = scanner.next();
        System.out.printf("The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.",firstName,cuisinePreference);



    }
}