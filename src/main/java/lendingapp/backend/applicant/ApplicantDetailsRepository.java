package lendingapp.backend.applicant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantDetailsRepository extends JpaRepository<ApplicantDetails, Long> {
}

