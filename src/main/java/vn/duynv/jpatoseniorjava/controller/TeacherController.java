package vn.duynv.jpatoseniorjava.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.duynv.jpatoseniorjava.dto.request.TeacherCreationRequest;
import vn.duynv.jpatoseniorjava.dto.response.TeacherResponse;
import vn.duynv.jpatoseniorjava.service.TeacherService;

@RestController
@RequestMapping("/api/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;

    @PostMapping()
    public ResponseEntity<TeacherResponse> createTeacher(@Valid @RequestBody TeacherCreationRequest request) {
        System.out.println("Request received: " + request.getFullName()); // Debug
        return new ResponseEntity<>(teacherService.createTeacher(request), HttpStatus.CREATED);
    }
}
