package StackOverFlow;

public class Answer extends Post {
    private String answerId;
    private User answerer;
    private Question question;

    public Answer(String answerId, Question question, User answerer) {
        super(answerId, PostType.ANSWER, answerer);
        this.answerId = answerId;
        this.answerer = answerer;
        this.question = question;
    }

    public String getAnswerId() {
        return answerId;
    }

    public Question getQuestion() {
        return question;
    }

    public User getAnswerer() {
        return answerer;
    }
}
