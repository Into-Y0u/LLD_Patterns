package StackOverFlow;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

import StackOverFlow.Interfaces.Content;
import StackOverFlow.Interfaces.Notification;
import StackOverFlow.Interfaces.Vote;

public abstract class Post implements Vote, Content, Notification {
    private LocalDateTime createdTime;
    private String postId;
    private PostType postType;
    private AtomicInteger upvotes;
    private AtomicInteger downvotes;
    private User creator;
    private String content;

    public Post(String postId, PostType postType, User creator) {
        this.createdTime = LocalDateTime.now();
        this.postId = postId;
        this.postType = postType;
        this.creator = creator;
        this.upvotes = new AtomicInteger(0);
        this.downvotes = new AtomicInteger(0);
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public User getCreator() {
        return this.creator;
    }

    public AtomicInteger getDownvotes() {
        return downvotes;
    }

    public AtomicInteger getUpvotes() {
        return upvotes;
    }

    public String getPostId() {
        return postId;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void upvotes(Post post) {
        post.upvotes.incrementAndGet();
        String text = String.format(" %s %s upvoted ", post.getPostType().toString(), post.getPostId());
        notifyUsers(post.getCreator(), text);
    }

    public void downvotes(Post post) {
        post.upvotes.decrementAndGet();
        String text = String.format(" %s %s downvoted ", post.getPostType().toString(), post.getPostId());
        notifyUsers(post.getCreator(), text);
    }

    public void notifyUsers(User user, String msg) {
        user.update(creator, msg);
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", creatorUserName=" + creator.getUserName() +
                ", content='" + content + '\'' +
                ", createdAt=" + createdTime +
                ", upvotes=" + upvotes +
                ", downvotes=" + downvotes +
                '}';
    }

}
