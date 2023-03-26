package home_work_6.hw_6_1;



public class Main {
    public static void main(String[] args) {
        User user1 = new User("123");
        Persister persister = new Persister(user1);
        ReportUser reportUser = new ReportUser(user1);
        reportUser.report();
        persister.save();

    }
}
