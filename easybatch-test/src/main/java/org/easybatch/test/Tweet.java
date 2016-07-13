package org.easybatch.test;

public class Tweet {

    private int id;

    private String user;

    private String message;

    public Tweet() {
    }

    public Tweet(int id, String user, String message) {
        this.id = id;
        this.user = user;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tweet{");
        sb.append("id=").append(id);
        sb.append(", user='").append(user).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }

}