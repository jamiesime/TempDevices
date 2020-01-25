package com.example.TemperatureDevices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestRepo extends CrudRepository<Device, Long> {

}
