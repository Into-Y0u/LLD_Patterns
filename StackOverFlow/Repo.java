package StackOverFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Repo {
    public static class QuestionRepo {
        private static List<Question> questionList = new ArrayList<Question>();
        private static PriorityQueue<Question> qFeed = new PriorityQueue<Question>(
                (q1, q2) -> Integer.compare(q2.getUpvotes().intValue(), q1.getUpvotes().intValue()));

        public static void addQuestion(Question q) {
            questionList.add(q);
            qFeed.offer(q);
        }

        public static ArrayList<Question> getQuestionList() {
            return (ArrayList<Question>) questionList;
        }

        public static ArrayList<Question> getUpvotedQuestionList() {
            return (ArrayList<Question>) qFeed.stream().collect(Collectors.toCollection(ArrayList::new));
        }

    }

    // public class AnswerRepo {

    // }
}
