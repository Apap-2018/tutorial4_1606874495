package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.CarModel;
import com.apap.tutorial4.repository.CarDb;

public interface CarService {
	void addCar(CarModel car);
	
	List<CarModel> sortByPriceDesc(Long dealer_id);
	
	void deleteCar(CarModel car);
	
	CarModel getCar(Long id);

	void updateCar(long id,CarModel car);
	
}
