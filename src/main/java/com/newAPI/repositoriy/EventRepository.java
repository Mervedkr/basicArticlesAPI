package com.newAPI.repositoriy;
import com.newAPI.dto.EventDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface EventRepository  extends JpaRepository<EventDTO, Long> {
    @Query("SELECT b.author FROM ArticleDB b WHERE b.title IN :titles AND b.author IN :authors")

    EventDTO findbyTitleandAuthor(@Param("titles ") String title ,
                                               @Param("authors") String author);

    List<EventDTO> findAll();
}
