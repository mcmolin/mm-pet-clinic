package tost.springframework.mmpetclinic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tost.sprintframework.mmpetclinic.services.OwnerService;
import tost.sprintframework.mmpetclinic.services.PetService;
import tost.sprintframework.mmpetclinic.services.PetTypeService;
import tost.sprintframework.mmpetclinic.services.VetService;
import tost.sprintframework.mmpetclinic.services.map.OwnerServiceMap;
import tost.sprintframework.mmpetclinic.services.map.PetServiceMap;
import tost.sprintframework.mmpetclinic.services.map.PetTypeServiceMap;
import tost.sprintframework.mmpetclinic.services.map.VetServiceMap;


@Configuration
public class PetClinicConfig {

    @Bean
    public OwnerService ownerService() {
        return new OwnerServiceMap(petTypeService(), petService());
    }


    @Bean
    public VetService vetService(){
        return new VetServiceMap();
    }

    @Bean
    public PetTypeService petTypeService(){
        return new PetTypeServiceMap();
    }

    @Bean
    public PetService petService(){
        return new PetServiceMap();
    }

}
