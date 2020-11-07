package tost.sprintframework.mmpetclinic.services.map;

import org.springframework.stereotype.Service;
import tost.sprintframework.mmpetclinic.model.Speciality;
import tost.sprintframework.mmpetclinic.services.SpecialtiesService;

import java.util.Set;

@Service
public class SpecialtiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
