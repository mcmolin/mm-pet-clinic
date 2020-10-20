package tost.sprintframework.mmpetclinic.services;


import tost.sprintframework.mmpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
   Owner findById(Long id);

   Owner findByLastName(Long id);

   Owner save(Owner owner);

   Set<Owner> findAll();


}
