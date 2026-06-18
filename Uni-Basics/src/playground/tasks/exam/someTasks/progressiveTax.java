package playground.tasks.exam.someTasks;

public class progressiveTax {

    public static double solution(double income) {

        if (income <= 0) {
            return 0;
        }

        double tax = 0;

        if (income > 60000) {
            tax += (income - 60000) * 0.30;
            income = 60000;
        }

        if (income > 30000) {
            tax += (income - 30000) * 0.20;
            income = 30000;
        }

        if (income > 10000) {
            tax += (income - 10000) * 0.10;
            income = 10000;
        }

        return tax;
    }

    public static void main(String[] args) {

        System.out.println(
                solution(40000)
        );

    }
}
