package com.example.university_db_app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiInfoController {

    @GetMapping("/")
    public Map<String, Object> apiInfo() {
        return Map.of(
                "status", "running",
                "endpoints", List.of(
                        "GET /api/students",
                        "GET /api/students/{code}",
                        "GET /api/students/{code}/enrollments",
                        "GET /api/courses",
                        "GET /api/courses/{code}/students",
                        "GET /api/departments/{code}/lecturers",
                        "GET /api/enrollments?grade={grade}",
                        "GET /api/reports/course-counts"));
    }
}
