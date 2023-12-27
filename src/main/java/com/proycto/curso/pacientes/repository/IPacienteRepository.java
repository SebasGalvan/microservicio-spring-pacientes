package com.proycto.curso.pacientes.repository;

import com.proycto.curso.pacientes.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
    public Paciente findByDni(String dni);
}
