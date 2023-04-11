package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("BMW", 6, "white"));
        carList.add(new Car("Audi", 1, "grey"));
        carList.add(new Car("VAZ", 3, "green"));
        carList.add(new Car("UAZ", 5, "black"));
        carList.add(new Car("Susuki", 77, "orange"));
    }

    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }
}
