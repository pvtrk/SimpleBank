package pl.patryk.bank.model;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity(name="tplannedtransaction")
public class PlannedTransaction extends Transaction {
    private LocalDateTime plannedDate;

    public LocalDateTime getPlannedDate() {
        return plannedDate;
    }

    public void setPlannedDate(LocalDateTime plannedDate) {
        this.plannedDate = plannedDate;
    }
}
