package com.mapping.Mappings.Repository;

import com.mapping.Mappings.Entity.PhoneNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhonenumbersRepository extends JpaRepository<PhoneNumbers,Long>
{

}
