package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {

    public List<Car> showAllCars();

    public List<Car> showCars(int count);

}
