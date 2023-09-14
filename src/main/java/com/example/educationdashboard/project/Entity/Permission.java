package com.example.educationdashboard.project.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String permissionName;

    @ManyToMany(mappedBy = "roles")
    private Set<Roles> roles = new HashSet<>();


}
