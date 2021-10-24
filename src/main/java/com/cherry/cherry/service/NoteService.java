package com.cherry.cherry.service;

import com.cherry.cherry.dto.NoteDto;
import com.cherry.cherry.mapper.NoteMapper;
import com.cherry.cherry.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    private final NoteRepository repository;
    private final NoteMapper mapper;

    public NoteService(NoteRepository repository, NoteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public NoteDto store(NoteDto noteDto) {
        return mapper.toDTO(repository.save(mapper.toEntity(noteDto)));
    }

    public NoteDto find(Long id) {
        return mapper.toDTO(repository.getById(id));
    }
}
