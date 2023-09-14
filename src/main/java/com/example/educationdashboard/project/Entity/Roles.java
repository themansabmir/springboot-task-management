package com.example.educationdashboard.project.Entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Roles {
    @Id
    private int roleId;
    private String name;
    @ManyToMany
    @JoinTable(name = "role_permission", joinColumns = @JoinColumn(name = "roleId"),
     inverseJoinColumns = @JoinColumn(name = "permissionId"))
    private Set<Permission> permissions = new HashSet<>();

}
