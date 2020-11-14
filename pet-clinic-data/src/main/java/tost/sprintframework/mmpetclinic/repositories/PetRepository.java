package tost.sprintframework.mmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.sprintframework.mmpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
