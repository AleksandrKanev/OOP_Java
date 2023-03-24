package home_work_5;

import home_work_5.controller.UserController;
import home_work_5.dao.impl.FileOperation;
import home_work_5.model.User;
import home_work_5.repository.GBRepository;
import home_work_5.repository.impl.UserRepository;
import home_work_5.view.UserView;

import static home_work_5.util.DBConnector.DB_PATH;
import static home_work_5.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
