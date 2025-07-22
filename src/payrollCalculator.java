public class payrollCalculator {

    // Method to calculate weekly pay
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
        if (hoursWorked < 0 || hourlyRate < 0) {
            System.out.println("Invalid hours or rate.");
            return 0.0;
        }

        switch (employeeType.toUpperCase()) {
            case "FULL_TIME":
                if (hoursWorked > 40) {
                    double overtime = hoursWorked - 40;
                    return (40 * hourlyRate) + (overtime * hourlyRate * 1.5);
                } else {
                    return hoursWorked * hourlyRate;
                }

            case "PART_TIME":
                if (hoursWorked > 25) hoursWorked = 25;
                return hoursWorked * hourlyRate;

            case "CONTRACTOR":
                return hoursWorked * hourlyRate;

            case "INTERN":
                if (hoursWorked > 20) hoursWorked = 20;
                return hoursWorked * (hourlyRate * 0.8);

            default:
                System.out.println("Unknown employee type: " + employeeType);
                return 0.0;
        }
    }

    // Method to calculate tax
    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        double taxRate;

        if (grossPay <= 500) {
            taxRate = 0.10;
        } else if (grossPay <= 1000) {
            taxRate = 0.15;
        } else if (grossPay <= 2000) {
            taxRate = 0.20;
        } else {
            taxRate = 0.25;
        }

        double tax = grossPay * taxRate;
        if (hasHealthInsurance) {
            tax -= 50;
            if (tax < 0) tax = 0;
        }

        return tax;
    }

    // Method to process multiple employees
    public static void processPayroll(String[] employeeTypes, double[] hours, double[] rates, String[] names) {
        int length = Math.min(Math.min(employeeTypes.length, hours.length), Math.min(rates.length, names.length));

        double highestPay = Double.MIN_VALUE;
        double lowestPay = Double.MAX_VALUE;
        String highestPaidEmployee = "";
        String lowestPaidEmployee = "";
        double totalPay = 0;
        int overtimeCount = 0;
    }
}
