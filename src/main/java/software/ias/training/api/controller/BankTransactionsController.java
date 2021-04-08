package software.ias.training.api.controller;

import org.springframework.web.bind.annotation.*;
import software.ias.training.api.domain.BankTransaction;
import software.ias.training.api.repository.TransactionsRepository;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class BankTransactionsController {
    private final TransactionsRepository repository;

    public BankTransactionsController(TransactionsRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Object> listTransactions() {
        return repository.listBankTransactions();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createTransaction(
            @RequestBody BankTransaction transaction) {
        repository.createBankTransaction(transaction);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteTransaction(
            @RequestBody BankTransaction transaction) {
        repository.deleteBankTransaction(transaction);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public void updateTransaction(
            @PathVariable final int id,
            @RequestBody BankTransaction transaction) {
        repository.updateBankTransaction(transaction);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object oneTransaction(
            @PathVariable final int id) {
        return repository.oneTransaction(id);
    }
}
