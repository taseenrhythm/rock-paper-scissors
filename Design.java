import java.util.Random;

public class Design {
    public String easyLevel(String value){
        if(value.equals("rock") ){
           return "scissors";
        }

        else if(value.equals("scissors") ){
            return "paper";
        }

       else if(value.equals("paper") ){
            return "rock";
        }
        else{
            return "Invalid Input. Try again!";
        }
    }

     public String mediumLevel(String value){

        String[] collection = {"rock","scissors","paper"};
        for(String item : collection){
            if(value.equals(item)){
                Random r = new Random();
                int index = r.nextInt(3);
                String computer = collection[index];
                return computer;
            }
        }
        return "Invalid Input. Try again!";


    }

    public String impossibleLevel(String value){
        if(value.equals("rock") ){
           return "paper";
        }

        else if(value.equals("scissors") ){
            return"rock";
        }

        else if(value.equals("paper") ){
          return "scissors";
        }
        else{
         return "Invalid Input. Try again!";
        }
    }

    public void result(String computerValue, String shoot){
        if(computerValue.equals(shoot) ){
            System.out.println("Computer: "+computerValue+"\nNice Try! Better luck next time!");
        }
        else if ((computerValue.equals("scissors") && shoot.equals("rock") ) ||
                (computerValue.equals("paper") && shoot.equals("scissors") ) ||
                (computerValue.equals("rock") && shoot.equals("paper") )){
            System.out.println("Computer: "+computerValue +"\nCongratulations! You are the Best!");
        }
        else{
            System.out.println("Computer: "+computerValue+"\nAlas! You Loss!");
        }

        }
    }

