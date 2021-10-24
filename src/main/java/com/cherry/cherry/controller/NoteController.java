package com.cherry.cherry.controller;

import com.cherry.cherry.dto.NoteDto;
import com.cherry.cherry.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("notes")
public class NoteController extends BaseController {
    private final NoteService service;

    public NoteController(NoteService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public NoteDto find(@PathVariable Long id) {
        return service.find(id);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/")
    public NoteDto store(@RequestBody @Validated NoteDto noteDto) throws Exception {
        return service.store(noteDto);
    }
}
