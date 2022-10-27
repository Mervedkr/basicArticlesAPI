package com.newAPI;

import com.newAPI.dto.EventDTO;
import com.newAPI.request.EventRequest;
import com.newAPI.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RestController
@Service
@EnableCaching
@RequiredArgsConstructor
public class APIController {
    @Autowired
    EventService eventService;

    @GetMapping(value = "/findNews", produces = MediaType.APPLICATION_JSON_VALUE)
    public EventDTO findNews(EventRequest requestBody) {
        EventDTO responseBody = eventService.findNews(requestBody);
        return responseBody;
    }

    @GetMapping(value = "/fetchArticles", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventDTO> fetchArcticles() {
        return eventService.getArticlesMap();
    }
}
