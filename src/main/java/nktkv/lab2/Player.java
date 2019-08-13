package nktkv.lab2;

import com.google.firebase.database.DatabaseReference;

public class Player {

     String name;
     int score;
     String email;

     public Player (){

     }

     public Player(String name, int score){
         this.name = name;
         this.score = score;
     }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name){
         this.name = name;
    }
    public void setScore(int score){this.score = score;}
}
