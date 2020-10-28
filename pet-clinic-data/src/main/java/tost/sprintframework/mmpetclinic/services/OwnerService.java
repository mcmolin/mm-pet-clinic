package tost.sprintframework.mmpetclinic.services;


import tost.sprintframework.mmpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

   Owner findByLastName(Long id);

}
