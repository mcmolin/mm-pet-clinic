package tost.sprintframework.mmpetclinic.services;

import tost.sprintframework.mmpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
