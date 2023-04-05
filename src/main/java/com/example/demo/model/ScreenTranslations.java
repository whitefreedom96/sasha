package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class ScreenTranslations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TRANSLATION")
    private String translation;

    @Column(name = "DATE_TRANSLATION")
    private Date dateTranslation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCREEN_ID")
    private Screen screen;



}
