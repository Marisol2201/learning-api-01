package software.ias.training.api.domain;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {
    private final int id;
    private final LocalDate date;
    private final double amount;
    private final String description;

    public BankTransaction(int id, LocalDate date, double amount, String description) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "BankTransaction{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Objects.equals(id, that.id) && Double.compare(that.amount, amount) == 0 && Objects.equals(date, that.date) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, amount, description);
    }
}
