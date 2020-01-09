package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.RequestAmbassador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepo  extends CrudRepository<RequestAmbassador, Long> {

}
