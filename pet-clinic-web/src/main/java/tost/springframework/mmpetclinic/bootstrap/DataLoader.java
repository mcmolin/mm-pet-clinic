package tost.springframework.mmpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tost.sprintframework.mmpetclinic.model.Owner;
import tost.sprintframework.mmpetclinic.model.Vet;
import tost.sprintframework.mmpetclinic.services.OwnerService;
import tost.sprintframework.mmpetclinic.services.VetService;
import tost.sprintframework.mmpetclinic.services.map.OwnerServiceMap;
import tost.sprintframework.mmpetclinic.services.map.VetServiceMap;

import java.util.stream.Collectors;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFistName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFistName("Fiona");
        owner2.setLastName("Glenanner");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFistName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFistName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

        vetService.findAll().stream().filter(v -> v.getId().equals(1L)).collect(Collectors.toList()).forEach(res -> System.out.println(res.getFistName()));


    }
}
