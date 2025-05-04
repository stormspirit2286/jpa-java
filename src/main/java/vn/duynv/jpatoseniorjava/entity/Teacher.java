package vn.duynv.jpatoseniorjava.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teachers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "certificate_id")
    private TeachingCertificate teachingCertificate;
}
