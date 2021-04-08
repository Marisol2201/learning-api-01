package software.ias.training.api.test;

import org.springframework.stereotype.Component;
import software.ias.training.api.domain.BankTransaction;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Database {
    private final List<Object> data = new ArrayList<>();

    //post
    public void insertData(Object item) {
        data.add(item);
    }
    //get list
    public List<Object> listData() {
        return data;
    }
    //delete
    public void delete(Object item) {
        data.remove(item);
    }
    //update-put
    public Object update(Object item) {
        data.add(item);
        return item;
    }
    //get one
    public Object getTransaction(int item) {
        return data.get(item);
    }

    @PostConstruct
    public void init() {
        data.add(new BankTransaction(1, LocalDate.now(), 100, "coffee"));
        data.add(new BankTransaction(2, LocalDate.now(), 150, "water"));
    }
}
