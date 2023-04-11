package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private final CarDaoImpl carDao;

    @Autowired
    public CarsController(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String CarsPage(@RequestParam(value = "count", defaultValue = "5", required = false) int count, Model model) {
        model.addAttribute("carList", carDao.getCarList(count));
        return "cars";
    }
}
