package com.kovrizhkin.spring.boot.controller;

import com.kovrizhkin.spring.boot.model.dto.ShipDto;
import com.kovrizhkin.spring.boot.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ship")
public class ShipController {

    private final ShipService shipService;

    @Autowired
    public ShipController(ShipService shipService) {
        this.shipService = shipService;
    }

    @PostMapping
    public ResponseEntity<ShipDto> create(@RequestBody ShipDto ship) {
        return ResponseEntity.ok(shipService.create(ship));
    }

    @GetMapping
    public ResponseEntity<List<ShipDto>> findAll() {
        return ResponseEntity.ok(shipService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShipDto> findById(@PathVariable long id) {
        return ResponseEntity.ok(shipService.findById(id));
    }

    @PutMapping("/{ship}")
    public ResponseEntity<ShipDto> update(@RequestBody ShipDto ship) {
        return ResponseEntity.ok(shipService.update(ship));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ShipDto> delete(@PathVariable long id) {
        return ResponseEntity.ok(shipService.delete(id));
    }

}


