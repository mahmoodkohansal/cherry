package com.cherry.cherry.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "note")
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "notable_entity")
    private String notableEntity;

    @Column(name = "notable_id")
    private Long notableId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "text")
    private String text;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Date createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private Date updatedAt;
}
