package com.orange.Vehicle.dto.category;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categories")
public class CategoryRegistrationDTO {
    @Id
    private String id;

    private String name;
    private String description;
    private String status;
    private String iconUrl;

    public CategoryRegistrationDTO() {
    }

    public CategoryRegistrationDTO(String id, String name, String description, String status, String iconUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.iconUrl = iconUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
