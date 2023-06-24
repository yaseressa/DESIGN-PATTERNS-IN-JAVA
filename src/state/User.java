package state;

public class User {
    private Profile profile;

    public User(Profile profile) {
        this.profile = profile;
    }

    public void changeBackground(){
        profile.changeBackground();
    }
}
