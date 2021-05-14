package lendingapp.backend.applicant;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@AllArgsConstructor
@RequestMapping("/applicant")
public class ApplicantDetailsController {


    ApplicantDetailsServiceImple applicantDetailsServiceImple;


    @PostMapping("/saveapplicant")
    public ApplicantDetails saveApplicantDetails(@RequestParam("file")MultipartFile file,
                                                 @RequestParam("applicantfirstname")String applicantfirstname,
                                                 @RequestParam("applicantlastname")String applicantlastname,
                                                 @RequestParam("applicantage")String applicantage,
                                                 @RequestParam("applicantresidence")String applicantresidence,
                                                 @RequestParam("applicantcountry")String applicantcountry,
                                                 @RequestParam("applicantnin")String applicantnin){
        return applicantDetailsServiceImple.SaveApplicantToDB
                (applicantfirstname, applicantlastname,
                        applicantage, applicantresidence,
                        applicantcountry, applicantnin, file);
    }
}

