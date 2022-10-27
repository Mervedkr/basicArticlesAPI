package com.newAPI.service;

import com.newAPI.dto.EventDTO;
import com.newAPI.repositoriy.EventRepository;
import com.newAPI.request.EventRequest;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    @Cacheable(value = "articles", key = "#source.url")
    public List<EventDTO> getArticlesMap() {
        List<EventDTO> articleListFromDB = eventRepository.findAll();
        List<EventDTO> endPointMapList = new ArrayList<>();
        for (EventDTO articleFromDB : articleListFromDB) {
            endPointMapList.add(articleFromDB);
        }
        return endPointMapList;
    }
    @CachePut(value="articles")
    public EventDTO findNews(EventRequest requestBody) {
        return eventRepository.findbyTitleandAuthor(requestBody.getTitle(), requestBody.getAuthor());
    }
}
