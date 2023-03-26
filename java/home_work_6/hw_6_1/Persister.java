package home_work_6.hw_6_1;

public class Persister implements PresisterUser {
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }

}
