package home_work_7;

import home_work_7.controller.UserController;
import home_work_7.dao.impl.FileOperation;
import home_work_7.log.impl.ConsoleLogger;
import home_work_7.model.User;
import home_work_7.repository.GBRepository;
import home_work_7.repository.impl.UserRepository;
import home_work_7.view.UserView;
import home_work_7.wrapper.RepositoryDecor;

import static home_work_5.util.DBConnector.DB_PATH;
import static home_work_5.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new RepositoryDecor<>(new UserRepository(fileOperation),
                                                                    new ConsoleLogger());
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
//        controller.getAllUsers();

    }
}
