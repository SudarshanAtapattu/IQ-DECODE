package com.newapp.iq_codes;
/**
 * Level Models
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 * this level model for firebase Insert data and fetch data score ,
 */
public class Level_Model {

    String level;
    String correct ;
    String incorrect;
    String name;
    String  time;

    public Level_Model(String level, String correct, String incorrect,String name,String time) {
        this.level = level;
        this.correct = correct;
        this.incorrect = incorrect;
        this.name = name;
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public String getCorrect() {
        return correct;
    }

    public String getIncorrect() {
        return incorrect;
    }

    public  String getName(){return  name ;}

    public String getTime() { return time; }




    public void setLevel(String level) {
        this.level = level;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public void setIncorrect(String incorrect) {
        this.incorrect = incorrect;
    }

    public  void  setName(String  name ){ this.name = name ;  }

    public void setTime(String time) {this.time = time;}



    public Level_Model() {
    }
}
