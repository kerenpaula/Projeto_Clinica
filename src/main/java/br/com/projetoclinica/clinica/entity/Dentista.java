package br.com.projetoclinica.clinica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dentista {

@Id  
@GeneratedValue(strategy = GenerationType.AUTO)  
private Integer idDentista;

@Column(nullable = false, length = 40)
private String nomeDentista;

@Column(nullable = false, length = 11)
private String telefoneDentista;

@Column(nullable = false)
private Integer croDentista;




    
}
