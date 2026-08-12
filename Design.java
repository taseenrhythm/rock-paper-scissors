import java.util.Random;

public class Design {
    public void easyLevel(String value){
        if(value.equalsIgnoreCase("Stone") ){
            System.out.println("Computer: Scissors\n Congratulations! You are the Best!");
        }

        else if(value.equalsIgnoreCase("Scissors") ){
            System.out.println("Computer: Stone\nCongratulations! You are the Best!");
        }

       else if(value.equalsIgnoreCase("Paper") ){
            System.out.println("Computer: Stone\nCongratulations! You are the Best!");
        }
        else{
            System.out.println("Invalid Input. "+"\nTry again!");
        }
    }

     public void mediumLevel(String value){
        String[] collection = {"Rock","Scissors","Paper"};
        Random r = new Random();
        int index = r.nextInt(3);
        String computerValue = collection[index];

        if(computerValue.equalsIgnoreCase(value) ){
            System.out.println("Computer: "+computerValue+"\nNice Try! Better luck next time!");
        }
        else if ((computerValue.equalsIgnoreCase("Scissors") && value.equalsIgnoreCase("Stone") ) ||
                     (computerValue.equalsIgnoreCase("Paper") && value.equalsIgnoreCase("Scissors") ) ||
                (computerValue.equalsIgnoreCase("Stone") && value.equalsIgnoreCase("Paper") )){
            System.out.println("Computer:"+computerValue +"\nCongratulations! You are the Best!");
        }
        else{
            System.out.println("Computer: "+computerValue+"\nAlas! You Loss!");
        }

    }

    public void impossibleLevel(String value){
        if(value.equalsIgnoreCase("Stone") ){
            System.out.println("Computer: Paper\nAlas! You Loss!");
        }

        else if(value.equalsIgnoreCase("Scissors") ){
            System.out.println("Computer: Stone\nAlas! You Loss!");
        }

        else if(value.equalsIgnoreCase("Paper") ){
            System.out.println("Computer: Scissors\nAlas! You Loss!");
        }
        else{
            System.out.println("Invalid Input. "+"\nTry again!");
        }
    }


}
