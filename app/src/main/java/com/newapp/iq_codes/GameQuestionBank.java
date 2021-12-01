package com.newapp.iq_codes;

import java.util.ArrayList;
import java.util.List;
/**
 * GameQuestionBank
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 */
public class GameQuestionBank {


    private static List<GameQuestionList> NewbieQuestion() {
        /**
         *  NewbieQuestion
         */
        final List<GameQuestionList> questionLists = new ArrayList<>();

        final GameQuestionList question1 = new GameQuestionList(
                "5","6","7","One number is correct and well placed",
                "4","5","3","Nothing is correct",
                "0","6","7","Two numbers are correct and well placed",
                "1","0","2","one number is correct and correctly placed",
                "7","2","1","One number is correct but wrong placed",
                "0      0      7","5      6      7","1      4      2","2      5      3","0      0      7","");

        final GameQuestionList question2 = new GameQuestionList(
                "6","8","2","One number is correct and well placed",
                "7","3","8","Nothing is correct",
                "2","0","6","Two numbers are correct but wrong places",
                "6","1","4","One number is correct but wrong place",
                "7","8","0","One number is correct but wrong place",
                "0      0      8","6      4      2","0      4      2","0      8      4","0      4      2","");


        final GameQuestionList question3 = new GameQuestionList(
                "6","8","2","One number is correct and well placed",
                "6","4","5","One number is correct but wrong place",
                "2","0","6","Two numbers are correct but wrong places",
                "7","3","8","Nothing is correct",
                "7","8","0","One number is correct but in wrong place",
                "0      0      8","0      5      2","0      4      2","0      8      4","0      5      2","");

        /**
         *  add question to the game
         */
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);

        return questionLists;
    }

    private static List<GameQuestionList> AdventurerQuestion() {
        /**
         *  AdventurerQuestion
         */
        final List<GameQuestionList> questionLists = new ArrayList<>();

        final GameQuestionList question1 = new GameQuestionList(
                "3","4","2","One number is correct but wrong placed",
                "2","7","3","One number is correct but wrong placed",
                "1","6","5","Two numbers are correct and well placed",
                "8","5","3","Two number are correct but wrong placed",
                "2","6","4","Nothing is correct",
                "2      3      5","8      4      4","1      3      5","8      3      3","1      3      5","");

        final GameQuestionList question2 = new GameQuestionList(
                "7","9","3","One number is correct and well placed",
                "8","4","9","Nothing is correct",
                "3","1","7","Two numbers are correct but wrong places",
                "7","3","8","One number is correct but wrong placed",
                "7","8","0","one number is correct but in wrong placed",
                "3      9      9","1      1      3","3      5      5","3      5      5","1      5      3","");


        final GameQuestionList question3 = new GameQuestionList(
                "3","4","2","One number is correct and well placed",
                "2","7","3","Nothing is correct",
                "1","6","5","Two numbers are correct but wrong places",
                "8","5","3","One number is correct but wrong placed",
                "8","6","5","One number is correct but in wrong placed",
                "1      5      8","8      5      1","5      6      8","1      7      6","1      5      8","");

        final GameQuestionList question4 = new GameQuestionList(
                "1","6","2","One number is correct and well placed",
                "9","8","5","One number is correct but wrong placed",
                "2","3","4","Two numbers are correct and well placed",
                "1","7","3","Two numbers are correct but wrong placed",
                "5","7","4","Two numbers are correct but only well placed",
                "8      7      0","7      1      4","5      8      2","2      8      5","2      8      5","");

        /**
         *  add question to the game
         */
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);

        return questionLists;
    }

    private static List<GameQuestionList> ExplorerQuestion() {
        /**
         *  ExplorerQuestion
         */
        final List<GameQuestionList> questionLists = new ArrayList<>();

        final GameQuestionList question1 = new GameQuestionList(
                "3","4","2","Two numbers are correct but wrong placed",
                "2","7","3","One number is correct and well placed",
                "1","6","5","One is number correct but well placed",
                "8","5","3","Nothing is correct",
                "1","3","4","One number is correct and well placed",
                "2      7      5","8      6      2","1      2      3","2      6      4","2      6      4","");

        final GameQuestionList question2 = new GameQuestionList(
                "3","4","2","Two numbers are correct.One well placed and other wrong place",
                "2","7","3","Nothing is correct",
                "1","6","5","One number is correct and well placed",
                "8","5","3","Two numbers are correct but wrong placed",
                "2","6","4","Two numbers are correct .One well placed and other wrong placed",
                "3      3      4","3      1      4","4      6      7","5      0      2","3      1      4","");


        final GameQuestionList question3 = new GameQuestionList(
                "1","6","2","One number is correct and well placed",
                "9","8","5","Nothing is correct",
                "2","3","4","One number is correct and well placed",
                "1","7","3","Two numbers are correct but wrong placed",
                "5","7","4","Two numbers are correct .One well placed and other wrong placed",
                "1      7      2","3      1      4","6      3      2","5      7      4","6      3      2","");

        final GameQuestionList question4 = new GameQuestionList(
                "3","4","2","One number is correct and well placed",
                "2","7","3","Nothing is correct",
                "1","6","5","Two numbers are correct but wrong places",
                "8","5","3","One number is correct but wrong placed",
                "8","6","5","One number is correct but in wrong placed",
                "1      5      8","8      5      1","5      6      8","1      7      6","1      5      8","");

        final GameQuestionList question5 = new GameQuestionList(
                "7","9","3","One number is correct and well placed",
                "8","4","9","Nothing is correct",
                "3","1","7","Two numbers are correct but wrong places",
                "7","3","8","One number is correct but wrong placed",
                "7","8","0","one number is correct but in wrong placed",
                "3      9      9","1      1      3","3      5      5","3      5      5","1      5      3","");

        final GameQuestionList question6 = new GameQuestionList(
                "2","4","1","One number is correct and well placed",
                "4","1","3","Nothing is correct",
                "5","3","2","Two numbers are correct but wrong places",
                "3","4","7","One number is correct but wrong placed",
                "7","5","1","Two numbers are correct but wrong places",
                "2      1      5","5      4      2","2      7      5","7      5      4","2      7      5","");

        final GameQuestionList question7 = new GameQuestionList(
                "4","0","5","One number is correct but wrong place",
                "5","3","0","One numbers is correct and in the right place",
                "8","2","7","Two number are correct but wrong placed",
                "2","4","3","One numbers is correct but wrong place",
                "7","1","4","Nothing is correct",
                "5      2      8","3      1      4","6      2      2","5      7      8","5      2      8","");


        /**
         *  add question to the game
         */
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);

        return questionLists;
    }

    private static List<GameQuestionList> SuperstarQuestion() {
        /**
         *  SuperstarQuestion
         */
        final List<GameQuestionList> questionLists = new ArrayList<>();

        final GameQuestionList question1 = new GameQuestionList(
                "5","4","8","One number is correct and well placed",
                "5","3","0","Nothing is correct",
                "1","5","7","Two numbers are correct but wrong places",
                "8","0","6","One number is correct but wrong placed",
                "6","7","4","One number is correct but wrong place",
                "7      1      5","8      6      2","7      1      8","7      6      4","7      1      8","");

        final GameQuestionList question2 = new GameQuestionList(
                "3","4","2","One number is correct and well placed",
                "2","7","3","Nothing is correct",
                "1","6","5","One number is correct but wrong placed",
                "8","5","3","Two numbers are correct and  well placed",
                "2","6","4","Two numbers are correct and  well placed",
                "8      4      6","3      1      4","6      3      2","5      7      4","8      4      6","");


        final GameQuestionList question3 = new GameQuestionList(
                "1","6","2","One number is correct and well placed",
                "9","8","5","Nothing is correct",
                "2","3","4","One number is correct and well placed",
                "1","7","3","One number is correct but wrong placed",
                "5","7","4","Two numbers are correct one well placed and \nother wrong placed",
                "8      3      6","7      1      4","6      3      2","7      6      4","7      6      4","");

        final GameQuestionList question4 = new GameQuestionList(
                "7","9","3","One number is correct and well placed",
                "8","4","9","Nothing is correct",
                "3","1","7","Two numbers are correct but wrong places",
                "7","3","8","One number is correct but wrong placed",
                "7","8","0","one number is correct but in wrong placed",
                "3      9      9","1      1      3","3      5      5","3      5      5","1      5      3","");


        final GameQuestionList question5 = new GameQuestionList(
                "3","4","2","One number is correct and well placed",
                "2","7","3","Nothing is correct",
                "1","6","5","Two numbers are correct but wrong places",
                "8","5","3","One number is correct but wrong placed",
                "8","6","5","One number is correct but in wrong placed",
                "1      5      8","8      5      1","5      6      8","1      7      6","1      5      8","");

        final GameQuestionList question6 = new GameQuestionList(
                "3","4","2","Two numbers are correct but wrong placed",
                "2","7","3","One number is correct and well placed",
                "1","6","5","One is number correct but well placed",
                "8","5","3","Nothing is correct",
                "1","3","4","One number is correct and well placed",
                "2      7      5","8      6      2","1      2      3","2      6      4","2      6      4","");

        final GameQuestionList question7 = new GameQuestionList(
                "3","4","2","Two numbers are correct.One well placed and other wrong place",
                "2","7","3","Nothing is correct",
                "1","6","5","One number is correct and well placed",
                "8","5","3","Two numbers are correct but wrong placed",
                "2","6","4","Two numbers are correct .One well placed and other wrong placed",
                "3      3      4","3      1      4","4      6      7","5      0      2","3      1      4","");


        final GameQuestionList question8 = new GameQuestionList(
                "1","6","2","One number is correct and well placed",
                "9","8","5","Nothing is correct",
                "2","3","4","One number is correct and well placed",
                "1","7","3","Two numbers are correct but wrong placed",
                "5","7","4","Two numbers are correct .One well placed and other wrong placed",
                "1      7      2","3      1      4","6      3      2","5      7      4","6      3      2","");



        /**
         *  add question to the game
         */

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);


        return questionLists;
    }

    private static List<GameQuestionList> CrunckedQuestion() {
        /**
         *  CrunckedQuestion
         */
        final List<GameQuestionList> questionLists = new ArrayList<>();

        final GameQuestionList question1 = new GameQuestionList(
                "1","5","4","One number is correct and well placed",
                "4","3","1","One number is correct but wrong placed",
                "8","1","3","Two numbers are correct  and well placed",
                "2","6","4","One number is correct  but wrongly placed",
                "4","3","5","Two numbers are correct but wrong places",
                "4      1      5","8      5      3","7      1      8","8      6      3","8      5      3","");

        final GameQuestionList question2 = new GameQuestionList(
                "6","5","9","One number is correct and well placed",
                "6","4","1","One number is correct but wrong placed",
                "2","8","8","Two numbers are correct but wrong place",
                "9","1","7","Nothing is correct",
                "7","5","8","One number is correct but wrong place ",
                "8      4      9","2      1      4","9      3      2","8      2      9","8      2      9","");


        final GameQuestionList question3 = new GameQuestionList(
                "1","4","7","One number is correct but wrong placed",
                "1","8","9","One number is correct and well placed",
                "9","6","5","Two numbers are correct place but wrong placed",
                "5","2","3","Nothing is correct",
                "2","8","6","One number is correct place but in the wrong place",
                "4      3      9","6      1      4","6      7      9","7      6      4","6      7      9","");


        final GameQuestionList question4 = new GameQuestionList(
                "5","6","7","One number is correct and well placed",
                "4","5","3","Nothing is correct",
                "0","6","7","Two numbers are correct and well placed",
                "1","0","2","one number is correct and correctly placed",
                "7","2","1","One number is correct but wrong placed",
                "0      0      7","5      6      7","1      4      2","2      5      3","0      0      7","");


        final GameQuestionList question5 = new GameQuestionList(
                "3","4","2","Two numbers are correct.One well placed and other wrong place",
                "2","7","3","Nothing is correct",
                "1","6","5","One number is correct and well placed",
                "8","5","3","Two numbers are correct but wrong placed",
                "2","6","4","Two numbers are correct .One well placed and other wrong placed",
                "3      3      4","3      1      4","4      6      7","5      0      2","3      1      4","");


        final GameQuestionList question6 = new GameQuestionList(
                "1","6","2","One number is correct and well placed",
                "9","8","5","Nothing is correct",
                "2","3","4","One number is correct and well placed",
                "1","7","3","Two numbers are correct but wrong placed",
                "5","7","4","Two numbers are correct .One well placed and other wrong placed",
                "1      7      2","3      1      4","6      3      2","5      7      4","6      3      2","");

        final GameQuestionList question7 = new GameQuestionList(
                "3","4","2","One number is correct and well placed",
                "2","7","3","Nothing is correct",
                "1","6","5","Two numbers are correct but wrong places",
                "8","5","3","One number is correct but wrong placed",
                "8","6","5","One number is correct but in wrong placed",
                "1      5      8","8      5      1","5      6      8","1      7      6","1      5      8","");


        /**
         *  add question to the game
         */
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);



        return questionLists;
    }

    private static List<GameQuestionList> SuperuserQuestion() {
        /**
         *  SuperuserQuestion
         */
        final List<GameQuestionList> questionLists = new ArrayList<>();

        final GameQuestionList question1 = new GameQuestionList(
                "2","4","1","One number is correct and well placed",
                "4","1","3","Nothing is correct",
                "5","3","2","Two numbers are correct but wrong places",
                "3","4","7","One number is correct but wrong placed",
                "7","5","1","Two numbers are correct but wrong places",
                "2      1      5","5      4      2","2      7      5","7      5      4","2      7      5","");

        final GameQuestionList question2 = new GameQuestionList(
                "4","0","5","One number is correct but wrong place",
                "5","3","0","One numbers is correct and in the right place",
                "8","2","7","Two number are correct but wrong placed",
                "2","4","3","One numbers is correct but wrong place",
                "7","1","4","Nothing is correct",
                "5      2      8","3      1      4","6      2      2","5      7      8","5      2      8","");


        final GameQuestionList question3 = new GameQuestionList(
                "1","6","2","One number is correct and well placed",
                "9","8","5","One number is correct but wrong placed",
                "2","3","4","Two numbers are correct and well placed",
                "1","7","3","Two numbers are correct but wrong placed",
                "5","7","4","Two numbers are correct but only well placed",
                "8      7      0","7      1      4","5      8      2","2      8      5","2      8      5","");

        final GameQuestionList question4 = new GameQuestionList(
                "3","4","2","Two numbers are correct but wrong placed",
                "2","7","3","One number is correct and well placed",
                "1","6","5","One is number correct but well placed",
                "8","5","3","Nothing is correct",
                "1","3","4","One number is correct and well placed",
                "2      7      5","8      6      2","1      2      3","2      6      4","2      6      4","");

        final GameQuestionList question5 = new GameQuestionList(
                "3","4","2","Two numbers are correct.One well placed and other wrong place",
                "2","7","3","Nothing is correct",
                "1","6","5","One number is correct and well placed",
                "8","5","3","Two numbers are correct but wrong placed",
                "2","6","4","Two numbers are correct .One well placed and other wrong placed",
                "3      3      4","3      1      4","4      6      7","5      0      2","3      1      4","");


        /**
         *  add question to the game
         */
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);

        return questionLists;
    }
    /**
     *  use switch case  for show questions
     */
    public static List<GameQuestionList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "NEWBIE":
                return NewbieQuestion();
            case "ADVENTURER":
                return AdventurerQuestion();
            case "EXPLORER":
                return ExplorerQuestion();
            case "SUPERSTAR":
                return SuperstarQuestion();
            case "CRUNKED":
                return CrunckedQuestion();
            default:
                return SuperuserQuestion();
        }

    }





}
