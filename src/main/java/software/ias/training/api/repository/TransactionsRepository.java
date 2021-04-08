package software.ias.training.api.repository;

import org.springframework.stereotype.Repository;
import software.ias.training.api.domain.BankTransaction;
import software.ias.training.api.test.Database;

import java.util.List;

@Repository
public class TransactionsRepository {
    private final Database database;

    // dependency inversion
    public TransactionsRepository(Database database) {
        this.database = database;
    }
    //post
    public void createBankTransaction(BankTransaction transaction) {
        database.insertData(transaction);
    }
    //get list
    public List<Object> listBankTransactions() {
        return database.listData();
    }
    //delete
    public void deleteBankTransaction(BankTransaction transaction) {
        database.delete(transaction);
    }
    //put
    public Object updateBankTransaction(BankTransaction transaction) {
        return database.update(transaction);
    }
    //get one
    public Object oneTransaction(int id) {
        return database.getTransaction(id);
    }
}
