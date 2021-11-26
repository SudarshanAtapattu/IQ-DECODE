package com.newapp.iq_codes;
/***
 * GameQuestionList
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 *  getters for question, getUserSelectedAnswer and setUserSelectedAnswer to the game
 */
public class GameQuestionList {

    private String question1,question2,question3,clue1;
    private String question4,question5,question6,clue2;
    private String question7,question8,question9,clue3;
    private String question10,question11,question12,clue4;
    private String question13,question14,question15,clue5;
    private String option1, option2, option3, option4, answer;
    private String userSelectedAnswer;

    public GameQuestionList(String question1, String question2, String question3, String clue1, String question4, String question5, String question6, String clue2, String question7, String question8, String question9, String clue3, String question10, String question11, String question12, String clue4, String question13, String question14, String question15, String clue5, String option1, String option2, String option3, String option4, String answer, String userSelectedAnswer) {
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.clue1 = clue1;
        this.question4 = question4;
        this.question5 = question5;
        this.question6 = question6;
        this.clue2 = clue2;
        this.question7 = question7;
        this.question8 = question8;
        this.question9 = question9;
        this.clue3 = clue3;
        this.question10 = question10;
        this.question11 = question11;
        this.question12 = question12;
        this.clue4 = clue4;
        this.question13 = question13;
        this.question14 = question14;
        this.question15 = question15;
        this.clue5 = clue5;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public String getClue1() {
        return clue1;
    }

    public String getQuestion4() {
        return question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public String getClue2() {
        return clue2;
    }

    public String getQuestion7() {
        return question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public String getQuestion9() {
        return question9;
    }

    public String getClue3() {
        return clue3;
    }

    public String getQuestion10() {
        return question10;
    }

    public String getQuestion11() {
        return question11;
    }

    public String getQuestion12() {
        return question12;
    }

    public String getClue4() {
        return clue4;
    }

    public String getQuestion13() {
        return question13;
    }

    public String getQuestion14() {
        return question14;
    }

    public String getQuestion15() {
        return question15;
    }

    public String getClue5() {
        return clue5;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}