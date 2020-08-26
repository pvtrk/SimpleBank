package pl.patryk.bank.utils;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "taccountnumbermanager")
public class AccountNumberManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long firstPart;
    private Long secondPart;
    @Transient
    private final Long MAX_VALUE = 9999999999999L;
    @Transient
    private Set<String> resultSet;


    public Long getId() {
        return id;
    }

    public Long getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(Long firstPart) {
        this.firstPart = firstPart;
    }

    public Long getSecondPart() {
        return secondPart;
    }

    public void setSecondPart(Long secondPart) {
        this.secondPart = secondPart;
    }

    public Long getMAX_VALUE() {
        return MAX_VALUE;
    }

    public Set<String> getResultSet() {
        return resultSet;
    }

    public void setResultSet(Set<String> resultSet) {
        this.resultSet = resultSet;
    }

    public String generateNumber(Long first, Long second) {
        if(second == this.MAX_VALUE) {
            first++;
            second = 1000000000000L;
        } else {
            second++;
        }
        this.firstPart = first;
        this.secondPart = second;
        StringBuilder sb = new StringBuilder();
        return sb.append(first.toString()
        ).append(second.toString()).toString();
    }
}
