package pl.borysworks.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BankingExpences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String description;
    @Column(scale = 2)
    private Double value;
    @Column(length = 10)
    private String date;

    public BankingExpences(String description, Double value, String date) {
        this.description = description;
        this.value = value;
        this.date = date;
    }

    public BankingExpences() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }
}
