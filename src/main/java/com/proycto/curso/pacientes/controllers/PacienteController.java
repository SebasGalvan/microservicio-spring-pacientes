package com.proycto.curso.pacientes.controllers;

import com.proycto.curso.pacientes.model.Paciente;
import com.proycto.curso.pacientes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService pacienteService;

    @PostMapping()
    public String save(@RequestBody Paciente paciente){
        pacienteService.savePaciente(paciente);
        return "Paciente creado correctamente";
    }
    @GetMapping()
    public List<Paciente> getAll(){
        return pacienteService.getPacientes();
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        pacienteService.deletePaciente(id);
        return "Paciente eliminado.";
    };
    @PutMapping("/{id}")
    public Paciente update(@RequestBody Paciente paciente){
        pacienteService.editPaciente(paciente);
        Paciente pacienteEditado = pacienteService.findPaciente(paciente.getIdPaciente());
        return  pacienteEditado;
    }
    @GetMapping("/{dni}")
    public Paciente getOne(@PathVariable String dni){
        return pacienteService.findPacientePorDNI(dni);

    }
}
