package StackOverFlow.Interfaces;

import StackOverFlow.User;
import StackOverFlow.VoteType;

public interface ActionObserver {
    void update(User user, String msg);

    void updateVote(User user, VoteType voteType);
}
