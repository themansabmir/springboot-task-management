package com.example.educationdashboard.project.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PermissionDto {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String permissionName;

}
