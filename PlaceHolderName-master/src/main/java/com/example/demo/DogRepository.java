package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DogRepository {
    private List<Dog> dogs = new ArrayList<>();

    public DogRepository() {
        dogs.add(new Dog("Bruno", 4, "Brown", AdoptionStatus.RESERVED, AgeCategory.ADULT, 1, Breed.LABRADOR, "/labrador1.jpg", "The dog"));
        dogs.add(new Dog("Simba", 8, "Brown", AdoptionStatus.URGENT, AgeCategory.ADULT, 2, Breed.PITBULL, "/pitbull1.jpg", "The dog"));
        dogs.add(new Dog("Tintin", 3, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 3, Breed.LABRADOR, "/labrador2.jpg", "The dog"));
        dogs.add(new Dog("Freddie", 4, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 4, Breed.GOLDEN_RETREIVER, "/goldenRetriever.jpg", "The dog"));
        dogs.add(new Dog("Charlie", 2, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 5, Breed.MIXED, "/mixed1.jpg", "The dog"));
        dogs.add(new Dog("Lilly", 6, "Grey", AdoptionStatus.RESERVED, AgeCategory.ADULT, 6, Breed.DAlMATIAN, "/dalmatian.jpg", "The dog"));
        dogs.add(new Dog("Maximus", 5, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 7, Breed.SHITZU, "/shitzu1.jpg", "The dog"));
        dogs.add(new Dog("Timothy", 10, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.SENIOR, 8, Breed.COCKER_SPANIEL, "/cockerSpaneil.jpg", "The dog"));
        dogs.add(new Dog("Sparkles", 3, "Grey", AdoptionStatus.URGENT, AgeCategory.PUPPY, 9, Breed.SAINT_BERNARD, "/saintBernard1.jpg", "The dog"));
        dogs.add(new Dog("Fork", 5, "Grey", AdoptionStatus.URGENT, AgeCategory.ADULT, 10, Breed.STAFFORDSHIRE_TERRIER, "/staffordBullTerrier1.jpg", "The dog"));
        dogs.add(new Dog("Ragnhild", 3, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 11, Breed.CHIHUAHUA, "/chihuahua1.jpg", "The dog"));
        dogs.add(new Dog("Fido", 1, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 12, Breed.SAINT_BERNARD, "/saintBernard2.jpg", "The dog"));
        dogs.add(new Dog("Killer", 2, "Grey", AdoptionStatus.RESERVED, AgeCategory.PUPPY, 13, Breed.GREYHOUND, "/greyHound.jpg", "The dog"));
        dogs.add(new Dog("Sammy", 11, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.SENIOR, 14, Breed.SHIBA_INU, "/shibaInu.jpg", "The dog"));
        dogs.add(new Dog("Claudia", 5, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 15, Breed.PITBULL, "/pitbull2.jpg", "The dog"));
        dogs.add(new Dog("Thunder", 7, "Grey", AdoptionStatus.RESERVED, AgeCategory.ADULT, 16, Breed.MIXED, "/mixed2.jpg", "The dog"));
        dogs.add(new Dog("Shooter", 4, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 17, Breed.CHIHUAHUA, "/chihuahua2.jpg", "The dog"));
        dogs.add(new Dog("Barbra", 2, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 18, Breed.STAFFORDSHIRE_TERRIER, "/staffordBullTerrier2.jpg", "The dog"));
        dogs.add(new Dog("Jimmy", 3, "Grey", AdoptionStatus.URGENT, AgeCategory.PUPPY, 19, Breed.MIXED, "/mixed3.jpg", "The dog"));
        dogs.add(new Dog("AGATON", 1, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 20, Breed.SHITZU, "/shitzu2.jpg", "The dog"));
    }

    public Dog getDog(int id) {
        for (Dog d : dogs) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }
    public List<Dog> getAllDogs() {

        return dogs;
    }

    public List<Dog> getPage(int page, int pageSize) {
        int from = Math.max(0,page*pageSize);
        int to = Math.min(dogs.size(),(page+1)*pageSize);

        return dogs.subList(from, to);
    }

    public int numberOfPages(int pageSize) {
        return (int)Math.ceil((double)dogs.size() / pageSize);
    }
}
