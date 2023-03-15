package com.example.portfoliobackend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "PORTFOLIO")
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "portfolio_generator")
    @SequenceGenerator(name = "portfolio_generator", sequenceName = "portfolio_seq", allocationSize = 1)
    private int id;

    private String name;

    private String url;

    private String description;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

}
