package tost.springframework.mmpetclinic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tost.sprintframework.mmpetclinic.services.OwnerService;
import tost.sprintframework.mmpetclinic.services.VetService;
import tost.sprintframework.mmpetclinic.services.map.OwnerServiceMap;
import tost.sprintframework.mmpetclinic.services.map.VetServiceMap;


@Configuration
public class PetClinicConfig {

    @Bean
    public OwnerService ownerService() {
        return new OwnerServiceMap();
    }


    @Bean
    public VetService vetService(){
        return new VetServiceMap();
    }

}
