package vn.duynv.jpatoseniorjava.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "certificates")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeachingCertificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String certificateNumber;
    private LocalDate issueDate;
    @OneToOne(mappedBy = "teachingCertificate")
    private Teacher teacher;
}
