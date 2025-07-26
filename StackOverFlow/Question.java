package StackOverFlow;

import java.util.ArrayList;
import java.util.List;

import StackOverFlow.Interfaces.Notification;

public class Question extends Post implements Notification {
    private String questionId;
    private User creator;
    private List<Answer> answerList;

    public Question(String questionId, User creator) {
        super(questionId, PostType.QUESTION, creator);
        this.questionId = questionId;
        this.creator = creator;
        this.answerList = new ArrayList<>();
    }

    public String getQuestionId() {
        return questionId;
    }

    public User getCreator() {
        return creator;
    }

    public void addAnswer(Answer ans) {
        answerList.add(ans);
        String text = String.format(" %s added a new answer to Questtion %s", ans.getAnswerer().getUserName(),
                questionId);
        notifyUsers(this.creator, text);
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    @Override
    public void notifyUsers(User user, String msg) {
        user.update(user, msg);
    }

}
