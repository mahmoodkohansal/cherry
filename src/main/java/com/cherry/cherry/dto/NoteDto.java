package com.cherry.cherry.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class NoteDto {
    private String notableEntity;
    private Long notableId;
    private Long userId;
    private String text;
}
