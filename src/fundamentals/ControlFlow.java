package fundamentals;

public class ControlFlow {
        public static void main(String[] args) {

            int age = 22;
            boolean isLoggedIn = true;
            int day = 3;

        /* =======================
           1. IF STATEMENT
           ======================= */
            if (age >= 18) {
                System.out.println("User is eligible to vote.");
            }

        /* =======================
           2. IF - ELSE
           ======================= */
            if (isLoggedIn) {
                System.out.println("User can access the dashboard.");
            } else {
                System.out.println("User must log in first.");
            }

        /* =======================
           3. IF - ELSE IF - ELSE
           ======================= */
            if (age < 13) {
                System.out.println("Child user.");
            } else if (age < 20) {
                System.out.println("Teenage user.");
            } else {
                System.out.println("Adult user.");
            }

        /* =======================
           4. SWITCH CASE
           ======================= */
            switch (day) {
                case 1:
                    System.out.println("Monday - Work day");
                    break;
                case 2:
                    System.out.println("Tuesday - Work day");
                    break;
                case 3:
                    System.out.println("Wednesday - Midweek");
                    break;
                default:
                    System.out.println("Weekend");
            }

        /* =======================
           5. FOR LOOP
           ======================= */
            for (int i = 1; i <= 5; i++) {
                System.out.println("For loop iteration: " + i);
            }

        /* =======================
           6. WHILE LOOP
           ======================= */
            int count = 1;
            while (count <= 3) {
                System.out.println("While loop count: " + count);
                count++;
            }

        /* =======================
           7. DO - WHILE LOOP
           ======================= */
            int attempt = 1;
            do {
                System.out.println("Login attempt: " + attempt);
                attempt++;
            } while (attempt <= 2);

        /* =======================
           8. BREAK
           ======================= */
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    break; // exit loop when condition met
                }
                System.out.println("Break example: " + i);
            }

        /* =======================
           9. CONTINUE
           ======================= */
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    continue; // skip this iteration
                }
                System.out.println("Continue example: " + i);
            }

        /* =======================
           10. RETURN (method call)
           ======================= */
            int result = addNumbers(10, 20);
            System.out.println("Returned value: " + result);
        }

        // Method demonstrating return statement
        public static int addNumbers(int a, int b) {
            return a + b;
        }
    }


