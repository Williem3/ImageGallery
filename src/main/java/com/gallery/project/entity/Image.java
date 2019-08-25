package com.gallery.project.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class Image {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String name;

    private String description;

    @Column(name = "file")
    private byte[] file;

    public Image() {
    }

    public Image(String name, String description, byte[] file) {
        this.name = name;
        this.description = description;
        this.file = file;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", file=" + file +
                '}';
    }
}
