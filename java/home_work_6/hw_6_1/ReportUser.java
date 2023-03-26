package home_work_6.hw_6_1;

public class ReportUser implements Report{
    private final User user;

    public ReportUser(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
