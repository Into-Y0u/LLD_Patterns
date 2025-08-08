package tick_tack_toe;

public class Player implements Notification {
    private String userName;
    private int userId;

    Player(String userName, int userId) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public void updateUsers(String msg) {
        System.out.println(msg);
    }

    @Override
    public void inviteUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inviteUser'");
    }

}
