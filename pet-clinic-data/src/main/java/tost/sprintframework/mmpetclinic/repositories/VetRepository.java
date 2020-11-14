package tost.sprintframework.mmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.sprintframework.mmpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
