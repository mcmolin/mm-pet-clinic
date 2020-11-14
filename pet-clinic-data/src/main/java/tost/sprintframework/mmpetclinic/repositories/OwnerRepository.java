package tost.sprintframework.mmpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.sprintframework.mmpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
