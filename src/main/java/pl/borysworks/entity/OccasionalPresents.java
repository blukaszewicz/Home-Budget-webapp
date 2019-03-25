package pl.borysworks.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
public class OccasionalPresents {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String description;
    @Column(scale = 2)
    private Double value;
    @Column(length = 10)
    private String date;

    public OccasionalPresents(String description, Double value, String date) {
        this.description = description;
        this.value = value;
        this.date = date;
    }

    public OccasionalPresents() {
    }


    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
