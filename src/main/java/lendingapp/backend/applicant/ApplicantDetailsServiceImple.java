package lendingapp.backend.applicant;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

import static org.springframework.util.StringUtils.cleanPath;

@AllArgsConstructor
@Service

public  class ApplicantDetailsServiceImple   {

    private final ApplicantDetailsRepository applicantDetailsRepository;
    public ApplicantDetails SaveApplicantToDB(

            String applicantfirstname,
            String applicantlastname,
            String applicantage,
            String applicantresidence,
            String applicantcountry,
            String applicantnin,
            MultipartFile file

    ){
        ApplicantDetails applicantDetails=new ApplicantDetails();
        String FileName=cleanPath(file.getOriginalFilename());
        if(FileName.contains("..")){
            System.out.println("file not valid");


        }
        try {
            applicantDetails.setApplicantnationalid(Base64.getEncoder().encodeToString(file.getBytes()));
        }catch (IOException e){
            e.printStackTrace();
        }
        applicantDetails.setApplicantfirstname(applicantfirstname);
        applicantDetails.setApplicantlastname(applicantlastname);
        applicantDetails.setApplicantage(applicantage);
        applicantDetails.setApplicantnin(applicantnin);
        applicantDetails.setApplicantcountry(applicantcountry);
        applicantDetails.setApplicantresidence(applicantresidence);
        return applicantDetailsRepository.save(applicantDetails);

    }




}

