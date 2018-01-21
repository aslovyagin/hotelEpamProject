package com.epam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "roomType")
    private Set<RoomRequest> requests = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "roomType")
    private Set<Room> rooms = new HashSet<>();
}
