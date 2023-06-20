package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {

    private List<Car> carsList;

    {
        carsList = new ArrayList<>();

        carsList.add(new Car("Nissan", "100 NX", 100.0));
        carsList.add(new Car("Honda", "Accord", 160.0));
        carsList.add(new Car("Audi", "A8", 200.0));
        carsList.add(new Car("Suzuki", "Aerio", 180.0));
        carsList.add(new Car("Toyota", "GT86", 250.0));
    }

    @Override
    public List<Car> showAllCars() {
        return carsList;
    }

    @Override
    public List<Car> showCars(int count) {

        return carsList.stream().limit(count).toList();
    }

}
