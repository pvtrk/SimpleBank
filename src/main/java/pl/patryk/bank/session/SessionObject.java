package pl.patryk.bank.session;


import pl.patryk.bank.model.User;

public class SessionObject {

    private User user;
    private boolean isLogged;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }
}
