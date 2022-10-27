package com.newAPI.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
@Table(name = "users")
@Entity
public class EventDTO {
    private Long id;
    private String title;
    private String author;
    private String description;
    private String content;
    private String url;
    private String image;
    private LocalDate publishedate;
    private List<Source> source;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventDTO eventDTO = (EventDTO) o;
        return Objects.equals(id, eventDTO.id) && Objects.equals(title, eventDTO.title) && Objects.equals(author, eventDTO.author) && Objects.equals(description, eventDTO.description) && Objects.equals(content, eventDTO.content) && Objects.equals(url, eventDTO.url) && Objects.equals(image, eventDTO.image) && Objects.equals(publishedate, eventDTO.publishedate) && Objects.equals(source, eventDTO.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, description, content, url, image, publishedate, source);
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                ", publishedate=" + publishedate +
                ", source=" + source +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getPublishedate() {
        return publishedate;
    }

    public void setPublishedate(LocalDate publishedate) {
        this.publishedate = publishedate;
    }

    public List<Source> getSource() {
        return source;
    }

    public void setSource(List<Source> source) {
        this.source = source;
    }
}
