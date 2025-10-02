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
public class Paciente{
   
 @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer idPaciente;

    @Column(nullable = false, length = 40)
    private String nomePaciente;

    @Column(nullable = false, length = 11)
    private String telefonePaciente;

    @Column(nullable = false)
    private String cpfPaciente;

    @Column(nullable = true)
    private Integer idadePaciente;
}

