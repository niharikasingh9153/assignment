public class Main {
    public static void main(String[] args) {
        // 1. Employee Profile Setup
        String name = "Niharika Singh";
        int age = 23;
        String city = "Uttar Pradesh";
        float joiningPercentage = 86.7f;
        char performanceGrade;
        final String COMPANY_NAME = "HDFC Life";

        System.out.println("Welcome to " + COMPANY_NAME + "!");
        System.out.println("Employee: " + name + " | Age: " + age + " | City: " + city);
        System.out.println("Joining Percentage: " + joiningPercentage);

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

        System.out.println("\n\n--- Badge Pattern ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        float monthlyCTC = 63000.00f;
        int monthlyCTCInt = (int) monthlyCTC;
        int annualCTC = monthlyCTCInt * 12;
        annualCTC += 10000;

        System.out.println("\nMonthly CTC (float): " + monthlyCTC);
        System.out.println("Monthly CTC (int): " + monthlyCTCInt);
        System.out.println("Annual CTC (after bonus): " + annualCTC);
    }
}