package com.crud.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts", schema="flyway_db")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private long updated;
    private long created;
    private PostStatus status;

   @OneToMany(cascade = CascadeType.ALL)
       private List<Label> labels;

   @ManyToOne(fetch = FetchType.LAZY)
      private Writer writer;


    public Post() {
    }

    public Post(String content, long updated, long created, PostStatus status, List<Label> labels, Writer writer) {
        this.content = content;
        this.updated = updated;
        this.created = created;
        this.status = status;
        this.labels = labels;
        this.writer = writer;
    }

    public Integer getId() {
        return id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public PostStatus getStatus() {
        return status;
    }

    public void setStatus(PostStatus status) {
        this.status = status;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", updated=" + updated +
                ", created=" + created +
                ", status=" + status +
                ", labels=" + labels +
                ", writer=" + writer +
                '}';
    }
}
