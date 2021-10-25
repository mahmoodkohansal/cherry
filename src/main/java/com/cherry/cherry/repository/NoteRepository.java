package com.cherry.cherry.repository;

import com.cherry.cherry.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
    List<NoteEntity> getAllByNotableEntityAndNotableId(String notableEntity, Long notableId);
}
