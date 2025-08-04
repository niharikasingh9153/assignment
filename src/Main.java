public class Main {
    public static void main(String[] args) {
        // 1. Employee Profile Setup
        String name = "Priya Mehra";
        int age = 22;
        String city = "Pune";
        float joiningPercentage = 86.7f;
        char performanceGrade;
        final String COMPANY_NAME = "HDFC Life";

        // Welcome Message and Employee Info
        System.out.println("Welcome to " + COMPANY_NAME + "!");
        System.out.println("Employee: " + name + " | Age: " + age + " | City: " + city);
        System.out.println("Joining Percentage: " + joiningPercentage);

        // 2. Performance Rating
        if (joiningPercentage > 90) {
            performanceGrade = 'A';
        } else if (joiningPercentage >= 75) {
            performanceGrade = 'B';
        } else if (joiningPercentage >= 60) {
            performanceGrade = 'C';
        } else {
            performanceGrade = 'D';
        }

        System.out.println("Performance Grade: " + performanceGrade);

        // HR Feedback
        switch (performanceGrade) {
            case 'A':
                System.out.println("HR Feedback: Star Performer");
                break;
            case 'B':
                System.out.println("HR Feedback: Strong Start");
                break;
            case 'C':
                System.out.println("HR Feedback: Satisfactory");
                break;
            case 'D':
                System.out.println("HR Feedback: Needs Mentorship");
                break;
            default:
                System.out.println("HR Feedback: Invalid Grade");
        }

        // 3a. Prime Employee Code Generator
        System.out.println("\n--- Prime Employee Codes ---");
        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) continue;
            System.out.print(num + " ");
        }

        // 3b. ID Card Pattern Generator
        System.out.println("\n\n--- Badge Pattern ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3c. Compensation Calculator
        float monthlyCTC = 58000.50f;
        int monthlyCTCInt = (int) monthlyCTC;
        int annualCTC = monthlyCTCInt * 12;
        annualCTC += 10000;

        System.out.println("\nMonthly CTC (float): " + monthlyCTC);
        System.out.println("Monthly CTC (int): " + monthlyCTCInt);
        System.out.println("Annual CTC (after bonus): " + annualCTC);
    }
}
