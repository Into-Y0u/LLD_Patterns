package StackOverFlow.Interfaces;

import StackOverFlow.Post;

public interface Vote {
    void upvotes(Post post);

    void downvotes(Post post);
}
