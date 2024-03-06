package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", "Blue", 4));
        carList.add(new Car("Ferrari", "Red", 2));
        carList.add(new Car("Honda", "White", 4));
        carList.add(new Car("Audi", "Grey", 5));
        carList.add(new Car("Ford", "White", 5));
    }

    public List<Car> getCars(int count) {
        return carList
                .stream()
                .limit(count)
                .toList();
    }
}
