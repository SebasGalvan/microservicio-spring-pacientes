package com.proycto.curso.pacientes.service;

import com.proycto.curso.pacientes.model.Paciente;
import com.proycto.curso.pacientes.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements IPacienteService{
    @Autowired
    private IPacienteRepository pacienteRepository;
    @Override
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }
    @Override
    public void savePaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }
    @Override
    public void deletePaciente(Long id) {
        pacienteRepository.deleteById(id);
    }
    @Override
    public Paciente findPaciente(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }
    @Override
    public Paciente findPacientePorDNI(String dni) {
        return pacienteRepository.findByDni(dni);
    }
    @Override
    public void editPaciente(Paciente paciente) {
        this.savePaciente(paciente);
    }
}
