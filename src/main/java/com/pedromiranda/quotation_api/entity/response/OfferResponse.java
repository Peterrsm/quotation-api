package com.pedromiranda.quotation_api.entity.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
public class OfferResponse {
    @JsonProperty("id")
    String id;

    @JsonProperty("name")
    String name;

    @JsonProperty("createdAt")
    LocalDateTime createdAt;

    @JsonProperty("active")
    boolean active;

    @JsonProperty("offers")
    List<String> offers;

    @Override
    public String toString() {
        return "OfferResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", active=" + active +
                ", offers=" + offers +
                '}';
    }
}
