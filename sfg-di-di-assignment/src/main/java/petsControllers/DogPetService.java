package petsControllers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
@Service("dog")
public class DogPetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
