package com.kovrizhkin.spring.boot.controller;

import com.kovrizhkin.spring.boot.model.dto.StaffDto;
import com.kovrizhkin.spring.boot.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @PostMapping
    public ResponseEntity<StaffDto> create(@RequestBody StaffDto staffDto) {
        return ResponseEntity.ok(staffService.create(staffDto));
    }

    @GetMapping
    public ResponseEntity<List<StaffDto>> findAll() {
        return ResponseEntity.ok(staffService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StaffDto> findById(@PathVariable long id) {
        return ResponseEntity.ok(staffService.findById(id));
    }

    @PutMapping("/{staff}")
    public ResponseEntity<StaffDto> update(@RequestBody StaffDto staffDto) {
        return ResponseEntity.ok(staffService.update(staffDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<StaffDto> delete(@PathVariable long id) {
        return ResponseEntity.ok(staffService.delete(id));
    }

}
