package tost.springframework.mmpetclinic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tost.sprintframework.mmpetclinic.services.*;
import tost.sprintframework.mmpetclinic.services.map.*;


@Configuration
public class PetClinicConfig {

    @Bean
    public OwnerService ownerService() {
        return new OwnerMapService(petTypeService(), petService());
    }


    @Bean
    public VetService vetService(){
        return new VetMapService(specialityService());
    }

    @Bean
    public PetTypeService petTypeService(){
        return new PetTypeMapService();
    }

    @Bean
    public PetService petService(){
        return new PetMapService();
    }

    @Bean
    public SpecialityService specialityService(){
        return new SpecialityMapService();
    }

}
