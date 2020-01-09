package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.Ambassador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmbassadorRepo extends CrudRepository<Ambassador, Long> {

}
