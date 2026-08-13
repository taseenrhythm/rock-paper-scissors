    import java.util.Scanner;
    public class Rock_Paper_Scissors {
        public static void main(String[] args) {

            System.out.println("Select Level: " + "\n1. Baby\n2. Master\n3. Impossible");
            Scanner input = new Scanner(System.in);
            int level = input.nextInt();
            String computerValue;
            input.nextLine();
            String shoot;
            Design user = new Design();

            if (level == 1) {
                System.out.println("Shoot: ");
                String value = input.nextLine().toLowerCase();
                if (value.equals("rock") || value.equals("stone")) {
                    value = "rock";
                }
                shoot = value;
                computerValue = user.easyLevel(value);
            } else if (level == 2) {
                System.out.println("Shoot: ");
                String value = input.nextLine().toLowerCase();
                if (value.equals("rock") || value.equals("stone")) {
                    value = "rock";
                }
                shoot = value;
                computerValue = user.mediumLevel(value);
            } else if (level == 3) {
                System.out.println("Shoot: ");
                String value = input.nextLine().toLowerCase();
                if (value.equals("rock") || value.equals("stone")) {
                    value = "rock";
                }
                shoot = value;
                computerValue = user.impossibleLevel(value);
            } else {
                System.out.println("Invalid Level");
                return;
            }


            if (!computerValue.equals("Invalid Input. Try again!")) {
                user.result(computerValue, shoot);
            }
        else {
                System.out.println(computerValue);
            }

        }
    }

