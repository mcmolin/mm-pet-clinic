package tost.springframework.mmpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tost.sprintframework.mmpetclinic.model.*;
import tost.sprintframework.mmpetclinic.services.OwnerService;
import tost.sprintframework.mmpetclinic.services.PetTypeService;
import tost.sprintframework.mmpetclinic.services.SpecialityService;
import tost.sprintframework.mmpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0) {
            loadData();
        }


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        PetType fish = new PetType();
        dog.setName("Fish");
        PetType saveFishPetType = petTypeService.save(fish);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        specialityService.save(dentistry);


        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1233339999");


        Pet derkPet = new Pet();
        derkPet.setPetType(saveDogPetType);
        derkPet.setOwner(owner1);
        derkPet.setBirthDate(LocalDate.now());
        derkPet.setName("Rosco");
        owner1.getPets().add(derkPet);


        ownerService.save(owner1);


        Owner owner2 = new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanner");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1233335555");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(saveCatPetType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("The Cat");
        owner1.getPets().add(fionasPet);


        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(radiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(surgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets.... " + vetService.findAll().stream().count());


        //vetService.findAll().stream().filter(v -> v.getId().equals(1L)).collect(Collectors.toList()).forEach(res -> System.out.println(res.getFirstName()));
    }
}
