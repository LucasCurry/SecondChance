package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DogRepository {
    private List<Dog> dogs = new ArrayList<>();

    public DogRepository() {
        dogs.add(new Dog("Bruno", "2019-02-17", "Brown", AdoptionStatus.RESERVED, AgeCategory.ADULT, 1, Breed.LABRADOR, "/labrador1.jpg", "Bruno is a playful dog, gets attached to its owner very easily."));
        dogs.add(new Dog("Simba", "2018-08-17", "Brown", AdoptionStatus.URGENT, AgeCategory.ADULT, 2, Breed.PITBULL, "/pitbull1.jpg", "Sima likes to show dominance, very protective of its owner."));
        dogs.add(new Dog("Tintin", "2022-02-01", "Brown", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 3, Breed.LABRADOR, "/labrador2.jpg", "Tintin has tons of energy, likes to exercise and play around a lot."));
        dogs.add(new Dog("Freddie", "2018-09-24", "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 4, Breed.GOLDEN_RETREIVER, "/goldenRetriever.jpg", "Freddie is shy at first, needs a lot of attention and care."));
        dogs.add(new Dog("Charlie", "2018-10-10", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 5, Breed.MIXED, "/mixed1.jpg", "Charlie is always happy, despite his disability. He sees no obstacles in life, and shows us every day how to take care of life and live in the present."));
        dogs.add(new Dog("Lilly", "2017-08-01", "Grey", AdoptionStatus.RESERVED, AgeCategory.ADULT, 6, Breed.DAlMATIAN, "/dalmatian.jpg", "Lilly is our magical being, our therapy dog. With his calm and social way, he helps our shy dogs to bloom. He’s a great help in the rehabilitation of all dogs, and we would be nothing without our “Therapy Lilly”!"));
        dogs.add(new Dog("Maximus", "2019-05-16", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 7, Breed.SHITZU, "/shitzu1.jpg", "Maximus is outgoing, brave and navigates her surroundings without problems. She really shows the world that dogs’ senses are completely superior to ours."));
        dogs.add(new Dog("Timothy", "2016-12-24", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.SENIOR, 8, Breed.COCKER_SPANIEL, "/cockerSpaneil.jpg", "Timothy is very loving, playful, social with dogs, and humans, a little shy, joyful, couch potato, calm. He shares food, toys, and loves to be cuddled. He is an escapist."));
        dogs.add(new Dog("Sparkles", "2022-02-01", "Grey", AdoptionStatus.URGENT, AgeCategory.PUPPY, 9, Breed.SAINT_BERNARD, "/saintBernard1.jpg", "You get an idea about Sparkles just by its name, a positive and lovable personality"));
        dogs.add(new Dog("Fork", "2017-08-01", "Grey", AdoptionStatus.URGENT, AgeCategory.ADULT, 10, Breed.STAFFORDSHIRE_TERRIER, "/staffordBullTerrier1.jpg", "Fork is a sleeper, a moody dog that likes to sit in front of the TV, a good companion for a cozy day."));
        dogs.add(new Dog("Ragnhild", "2022-05-09", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 11, Breed.CHIHUAHUA, "/chihuahua1.jpg", "Ragnhild is the perfect dog for a elderly couple looking for a reason to take a 5 minute walk every day."));
        dogs.add(new Dog("Fido", "2022-02-01", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 12, Breed.SAINT_BERNARD, "/saintBernard2.jpg", "Fido is a bit of a mess...in the right hand can become a excellent guard dog, although wouldn't count on it."));
        dogs.add(new Dog("Killer", "2022-06-12", "Grey", AdoptionStatus.RESERVED, AgeCategory.PUPPY, 13, Breed.GREYHOUND, "/greyHound.jpg", "Killer, ironicly is a very loving dog and fun dog. Should not be placed in a home with children though..."));
        dogs.add(new Dog("Sammy", "2016-12-16", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.SENIOR, 14, Breed.SHIBA_INU, "/shibaInu.jpg", "Sammy is looking for a loving home to spend his last years in peace. A lovable good ol'fellaw!"));
        dogs.add(new Dog("Claudia", "2017-08-17", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 15, Breed.PITBULL, "/pitbull2.jpg", "Claudia is a lover not a fighter, kisser not a biter. Looking for a home to spread her love"));
        dogs.add(new Dog("Thunder", "2017-08-05", "Grey", AdoptionStatus.RESERVED, AgeCategory.ADULT, 16, Breed.MIXED, "/mixed2.jpg", "Thunder is a somewhat nervous dog with a lot of love to give. With the right guidance he will become a perfect family dog."));
        dogs.add(new Dog("Shooter", "2017-10-01", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 17, Breed.CHIHUAHUA, "/chihuahua2.jpg", "Shooter is a bundle of energy that loves to hunt, play and do IP-training"));
        dogs.add(new Dog("Barbra", "2022-02-016", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 18, Breed.STAFFORDSHIRE_TERRIER, "/staffordBullTerrier2.jpg", "Barbras idea of a perfect day is laying in the sofa and napping through the whole day"));
        dogs.add(new Dog("Jimmy", "2022-11-01", "Grey", AdoptionStatus.URGENT, AgeCategory.PUPPY, 19, Breed.MIXED, "/mixed3.jpg", "Jimmy loves to play outside and has a special love for the ladies"));
        dogs.add(new Dog("Bort", "2022-08-11", "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 20, Breed.SHITZU, "/shitzu2.jpg", "Bort is a little daredevil with so much love and energy to give to the right owners!"));
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
