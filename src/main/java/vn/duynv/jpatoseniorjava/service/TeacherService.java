package vn.duynv.jpatoseniorjava.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.duynv.jpatoseniorjava.dto.request.TeacherCreationRequest;
import vn.duynv.jpatoseniorjava.dto.response.TeacherResponse;
import vn.duynv.jpatoseniorjava.entity.Teacher;
import vn.duynv.jpatoseniorjava.entity.TeachingCertificate;
import vn.duynv.jpatoseniorjava.repository.TeacherRepository;
import vn.duynv.jpatoseniorjava.repository.TeachingCertificationRepository;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final TeachingCertificationRepository teachingCertificationRepository;

    @Transactional
    public TeacherResponse createTeacher(TeacherCreationRequest request) {
        Teacher teacher = new Teacher();
        teacher.setEmail(request.getEmail());
        teacher.setFullName(request.getFullName());
        if (request.getCertificateNumber() != null && request.getIssueDate() != null) {
            TeachingCertificate teachingCertificate = new TeachingCertificate();
            teachingCertificate.setCertificateNumber(request.getCertificateNumber());
            teachingCertificate.setIssueDate(request.getIssueDate());
            teacher.setTeachingCertificate(teachingCertificate);
        }

        Teacher teacherCreated = teacherRepository.save(teacher);
        return TeacherResponse.builder()
                .id(teacherCreated.getId())
                .fullName(teacherCreated.getFullName())
                .email(teacherCreated.getEmail())
                .certificateNumber(teacherCreated.getTeachingCertificate().getCertificateNumber())
                .issueDate(teacherCreated.getTeachingCertificate().getIssueDate())
                .build();
    }
}
