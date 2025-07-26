package StackOverFlow;

import java.util.concurrent.atomic.AtomicInteger;

import StackOverFlow.Interfaces.ActionObserver;
import StackOverFlow.Interfaces.Notification;

public class User implements ActionObserver {
    private String userName;
    private String userId;
    private AtomicInteger reputation;

    public User(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
        this.reputation = new AtomicInteger(0);
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public AtomicInteger getReputation() {
        return reputation;
    }

    @Override
    public void update(User user, String msg) {
        String text = String.format("Hi %s, %s", userName, msg);
        System.out.println(text);
    }

    @Override
    public void updateVote(User user, VoteType voteType) {
        if (voteType.equals(VoteType.UPVOTE)) {
            reputation.incrementAndGet();
        } else {
            reputation.decrementAndGet();
        }
    }

}
