import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Select Level: "+"\n1. Easy\n2. Medium\n3. Impossible");
        Scanner input = new Scanner(System.in);
        int level = input.nextInt();
        input.nextLine();

        System.out.println("Shoot: ");
        String value = input.nextLine();

        Design user =  new Design();
        if (level==1){
            user.easyLevel(value);
        }
        else if (level==2){
            user.mediumLevel(value);
        }
        else if (level==3){
            user.impossibleLevel(value);
        }

        else{
            System.out.println("Invalid Level");
        }

    }
}
