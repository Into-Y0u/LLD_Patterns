package StackOverFlow;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import StackOverFlow.Repo.QuestionRepo;

public class StackOverFlowService {

    private AtomicInteger questionNo;
    private AtomicInteger answerNo;
    private AtomicInteger userNo;

    private String QUESTION_PREFIX = "Q_";
    private String ANSWER_PREFIX = "A_";
    private String USER_PREFIX = "U_";

    private static class SingleTonHelper {
        private static final StackOverFlowService INSTANCE = new StackOverFlowService();
    }

    private StackOverFlowService() {
        System.err.println("Inside construto");
        this.questionNo = new AtomicInteger(1);
        this.answerNo = new AtomicInteger(1);
        this.userNo = new AtomicInteger(1);
    }

    public static StackOverFlowService getInstance() {
        return SingleTonHelper.INSTANCE;
    }

    public ArrayList<Question> getFeed(boolean upvoted) {
        ArrayList<Question> res = null;
        if (upvoted) {
            res = Repo.QuestionRepo.getUpvotedQuestionList();
        } else {
            res = Repo.QuestionRepo.getQuestionList();
        }
        return res;
    }

    public Question addQuestion(String questionContent, User user) {
        String q_no = QUESTION_PREFIX + this.questionNo.incrementAndGet();
        Question q = new Question(q_no, user);
        q.setContent(questionContent);

        QuestionRepo.addQuestion(q);
        return q;
    }

    public Answer addAnswer(Question q, String answerContent, User user) {
        String a_no = ANSWER_PREFIX + this.answerNo.incrementAndGet();
        Answer a = new Answer(a_no, q, user);
        a.setContent(answerContent);
        q.addAnswer(a);
        return a;
    }

    public void upvote(Post post) {
        post.upvotes(post);
    }

    public void downvote(Post post) {
        post.downvotes(post);
    }

    public User createUser(String userName) {
        String userId = USER_PREFIX + this.userNo.incrementAndGet();
        return new User(userName, userId);
    }

}
