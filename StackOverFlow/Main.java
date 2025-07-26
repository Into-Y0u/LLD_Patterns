package StackOverFlow;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StackOverFlowService stk = StackOverFlowService.getInstance();

        User tapos = stk.createUser("Tapos");
        User benja = stk.createUser("Benja");
        User gayte = stk.createUser("Gayte");

        Question q = stk.addQuestion("What is java?", tapos);

        printFeed(stk);

        Answer a = stk.addAnswer(q, "java is the brother of javascript", gayte);
        stk.upvote(q);
        stk.upvote(a);
        printFeed(stk);

    }

    public static void printFeed(StackOverFlowService stk) {
        ArrayList<Question> posts = stk.getFeed(false);
        System.out.println("=================Printing Feed=================");
        for (Question q : posts) {
            System.out.println("Type : " + q.getPostType());
            System.out.println("Content : " + q.getContent());
            System.out.println("Creator : " + q.getCreator().getUserName());

            for (Answer ans : q.getAnswerList()) {
                System.out.println("Type : " + ans.getPostType());
                System.out.println("Content : " + ans.getContent());
                System.out.println("Creator : " + ans.getCreator().getUserName());
            }
        }
        System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
    }
}
