package org.example.entity;

import lombok.*;
import org.example.entity.enums.Gender;
import org.example.entity.enums.Qualification;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Gender gender;
    private int year;
    private String bloodGroup;
    private String contact;
    private Qualification qualification;
    private String address;
    private Date startDate;
    @Lob
    private byte[] image;
}
