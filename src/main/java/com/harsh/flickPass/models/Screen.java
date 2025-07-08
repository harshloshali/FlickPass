package com.harsh.flickPass.models;

import com.harsh.flickPass.enums.Feature;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "screens")
public class Screen extends BaseModel {
    private String name;
    //Screen : Theatre
    //1 : 1
    //M : 1
    @ManyToOne
    private com.harsh.flickPass.models.Theatre theatre;
    //Screen : Seat
    //1 : M
    //1 : 1
    @OneToMany
    private List<com.harsh.flickPass.models.Seat> seats;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
