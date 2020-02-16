package uk.axone.devintest.datatypes;

public class operators {

    public static void main(String[] args) {

        //score between 0 and 30 = No Grade
        //score between 30 and 60 = Grade C
        //score between 60 and 80 = Grade B
        //score above 80 below 100 = Grade A
        //score less than 0 or greater than 100 = Invalid Score

        int score = 30;
        if(score >=0 && score < 30){
            System.out.println("No Score");
        }
        if(score >=30 && score < 60){
            System.out.println("Grade C");
        }
        if(score >=60 && score < 80){
            System.out.println("Grade B");
        }
        if(score >=80 && score <=100){
            System.out.println("Grade A");
        }
        if(score < 0 || score > 100){
            System.out.println("Invalid Score");
        }

    }

}



