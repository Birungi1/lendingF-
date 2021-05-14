package lendingapp.backend.applicant;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "applicant_details")
@Getter
@Setter
public class ApplicantDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long applicantid;
    private String applicantfirstname;
    private String applicantlastname;
    private String applicantage;
    private String applicantresidence;
    private  String applicantcountry;
    private String applicantnin;
    private String applicantnationalid;

    public ApplicantDetails() {
    }

    public ApplicantDetails(Long applicantid,
                            String applicantfirstname,
                            String applicantlastname,
                            String applicantage,
                            String applicantresidence,
                            String applicantcountry,
                            String applicantnin,
                            String applicantnationalid)
    {
        this.applicantid = applicantid;
        this.applicantfirstname = applicantfirstname;
        this.applicantlastname = applicantlastname;
        this.applicantage = applicantage;
        this.applicantresidence = applicantresidence;
        this.applicantcountry = applicantcountry;
        this.applicantnin = applicantnin;
        this.applicantnationalid = applicantnationalid;
    }


    @Override
    public String toString() {
        return "ApplicantDetails{" +
                "applicantid=" + applicantid +
                ", applicantfirstname='" + applicantfirstname + '\'' +
                ", applicantlastname='" + applicantlastname + '\'' +
                ", applicantage='" + applicantage + '\'' +
                ", applicantresidence='" + applicantresidence + '\'' +
                ", applicantcountry='" + applicantcountry + '\'' +
                ", applicantnin=" + applicantnin +
                ", applicantnationalid='" + applicantnationalid + '\'' +
                '}';
    }
}

