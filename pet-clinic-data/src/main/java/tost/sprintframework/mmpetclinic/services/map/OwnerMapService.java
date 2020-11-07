package tost.sprintframework.mmpetclinic.services.map;

import org.springframework.stereotype.Service;
import tost.sprintframework.mmpetclinic.model.Owner;
import tost.sprintframework.mmpetclinic.services.OwnerService;
import tost.sprintframework.mmpetclinic.services.PetService;
import tost.sprintframework.mmpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        if(object != null){
            if(object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                       petTypeService.save(pet.getPetType());
                    }else{
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        petService.save(pet);
                    }
                });
            }
        }

        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(Long id) {
        return null;
    }
}
