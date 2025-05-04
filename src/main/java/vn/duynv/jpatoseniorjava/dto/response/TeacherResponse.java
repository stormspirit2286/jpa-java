package vn.duynv.jpatoseniorjava.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class TeacherResponse {
    private Long id;
    private String fullName;
    private String email;
    private String certificateNumber;
    private LocalDate issueDate;
}
