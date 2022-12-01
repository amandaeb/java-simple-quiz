package com.kenzie.app;

// import necessary libraries


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /* Java Fundamentals Capstone project:
       - Define as many variables, properties, and methods as you decide are necessary to
       solve the program requirements.
       - You are not limited to only the class files included here
       - You must write the HTTP GET call inside the CustomHttpClient.sendGET(String URL) method
         definition provided
       - Your program execution must run from the main() method in Main.java
       - The rest is up to you. Good luck and happy coding!
*/
    public static void main(String[] args) throws IOException {
        //Write main execution code here
        Scanner userInput = new Scanner(System.in);
        //
        try {
            /* GETTING THE LIST OF QUESTIONS*/
            //need the url to call with sendGet
            String gameUrl = "https://jservice.kenzie.academy/api/clues";
            //get response body
            String gameResponse = CustomHttpClient.sendGET(gameUrl);
            //take json and serialize
            QuestionsDTO questions = CustomHttpClient.getQuestionsList(gameResponse);
            //get array of questions
            ArrayList<QuestionsDTO.Clues> displayQuestions = new ArrayList<>();
            for (QuestionsDTO.Clues clue : questions.clues) {
                //System.out.println(clue.toString() + "\n");
                displayQuestions.add(clue);
            }
            //System.out.println(displayQuestions.toString());
            /* ASKING QUESTIONS */
            //use score
            int score = 0;
            Random generate = new Random();
            ArrayList<QuestionsDTO.Clues> askedQuestions = new ArrayList<>();
            int endGame = displayQuestions.size();
            int i = 0;
            int j = 1;
            while(i < 10){
                //get random dto from array
                int arrayIndex = generate.nextInt(endGame);
                QuestionsDTO.Clues clue = displayQuestions.get(arrayIndex);
                //check if is contained in askedquestions
                if(!askedQuestions.contains(clue)){
                    //display category
                    System.out.println("Category: " + clue.category);
                    //display question
                    System.out.println("Question: " + clue.question);
                    //get user input
                    System.out.println("Answer? ");
                    String userAnswer = userInput.nextLine();
                    if(userAnswer.equalsIgnoreCase(clue.answer)){
                        System.out.println("Correct!");
                        score+= 1;
                        System.out.println("Your score is: " + score + " out of: " + j + "\n") ;
                    }else{
                        System.out.println("Not correct\n");
                        System.out.println("Correct answer:" + clue.answer);
                        System.out.println("Your score is: " + score + " out of: " + j + "\n") ;
                    }
                    askedQuestions.add(clue);
                }
                //add this to asked questions
                i++;
                j++;
            }
            System.out.println("Your final score is: " + score);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

