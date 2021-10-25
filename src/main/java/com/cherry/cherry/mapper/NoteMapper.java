package com.cherry.cherry.mapper;

import com.cherry.cherry.dto.NoteDto;
import com.cherry.cherry.entity.NoteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NoteMapper {
    NoteEntity toEntity(NoteDto noteDto);
    NoteDto toDTO(NoteEntity noteEntity);
    List<NoteDto> toDTOs(List<NoteEntity> noteEntity);
}
