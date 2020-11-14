package tost.sprintframework.mmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.sprintframework.mmpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
