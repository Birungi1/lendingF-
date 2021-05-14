package lendingapp.backend.simpleinterest;

import lombok.*;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class SimpleInterestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sid;
    private Long principle;
    private  Integer time;

    public double simpleInterest(){
        double value=principle*time*15/100;
        return value;
    }

    public double CalculateAmount(){

        return principle+(principle*time*15/100);
    }
}
