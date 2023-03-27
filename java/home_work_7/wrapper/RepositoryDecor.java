package home_work_7.wrapper;

import home_work_7.log.Logger;
import home_work_7.model.User;
import home_work_7.repository.GBRepository;
import home_work_7.repository.impl.UserRepository;

import java.util.List;
import java.util.Optional;

public class RepositoryDecor<E,I> implements GBRepository<User,Long> {
    private final UserRepository repository;
    private final Logger log;

    public RepositoryDecor(UserRepository repository, Logger log) {
        this.repository = repository;
        this.log = log;
    }

    @Override
    public List<User> findAll() {
//        repository.findAll();
        log.log("Получение контактов из БД");
        return repository.findAll();
    }

    @Override
    public User create(User e) {
        User res = repository.create(e);
        log.log("Добавление в БД");
        return res;
    }

    @Override
    public Optional<User> findById(Long id) {
        Optional<User> res = repository.findById( id);
        log.log("Получение контакта из БД");
        return res;
    }

    @Override
    public Optional<User> update(Long id, User e) {
        Optional<User> res = repository.update(id,e);
        log.log("Перезапись контакта");
        return res;
    }

    @Override
    public boolean delete(Long id) {
        boolean res = repository.delete(id);
        log.log("Удаление контакта");
        return res;
    }
}
