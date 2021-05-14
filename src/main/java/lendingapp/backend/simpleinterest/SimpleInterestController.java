package lendingapp.backend.simpleinterest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class SimpleInterestController {

    SimpleInterestEntity simpleInterestEntity;

    @PostMapping("/si_calculator")
    public double CalculateTheSimpleInterest (SimpleInterestEntity simpleInterestEntity) {
        return simpleInterestEntity.simpleInterest();
    }

    @GetMapping("/get_amount")
    public double CalculateAmount(){
        return simpleInterestEntity.CalculateAmount();
    }
}
