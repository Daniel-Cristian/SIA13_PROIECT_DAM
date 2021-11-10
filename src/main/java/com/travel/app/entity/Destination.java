package com.travel.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Table(name="Destination")
@Entity(name="Destination")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer destinationId;

    @Column(name="destinationName")
    private String destinationName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "continendId")
    private Continent continent;

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
