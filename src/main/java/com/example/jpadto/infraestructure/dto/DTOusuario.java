package com.example.jpadto.infraestructure.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public record DTOusuario() {
    private static int id;
    private static String usuario;
    private static String password;
    private static String name;
    private static String surname;
    private static String company_email;
    private static String personal_email;
    private static String city;
    private static boolean active;
    private static Date created_date;
    private static String imagen_url;
    private static Date termination_date;
}
