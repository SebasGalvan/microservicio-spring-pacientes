package com.proycto.curso.pacientes.service;

import com.proycto.curso.pacientes.model.Paciente;

import java.util.List;

public interface IPacienteService {

    public List<Paciente> getPacientes();
    public void savePaciente(Paciente paciente);
    public void deletePaciente(Long id);
    public Paciente findPaciente(Long id);
    public Paciente findPacientePorDNI(String dni);
    public void editPaciente(Paciente paciente);


}
