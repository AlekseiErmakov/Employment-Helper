package com.eh.employment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.ZonedDateTime;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Getter
@Setter
@Table(name = "hiring_processes")
public class HiringProcess {

    @Id
    private Long id;

    private String position;

    private String company;

    private String country;

    private String city;

    private String language;

    private String status;

    private Boolean important;

    @CreationTimestamp
    private ZonedDateTime created;

    @UpdateTimestamp
    private ZonedDateTime updated;
}
