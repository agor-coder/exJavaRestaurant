/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.javastart.exjavarestaurant;

import java.util.List;

/**
 *
 * @author ET4
 */
public class Order {

    private List<Dish> dishes;

    public Order(List<Dish> dishes) {
        this.dishes = dishes;
    }
    
    

    @Override
    public String toString() {
        double dishesCost = PaymentService.calculateSumDishes(dishes);
        double servicesCost = PaymentService.calculateServiceCost(dishesCost);
        double totalCost = dishesCost + servicesCost;
        return String.format("Do zapłaty: %.2f, w tym:\n"
                  + "Koszt dań: %.2f\n"
                  + "napiwek: %.2f", totalCost, dishesCost, servicesCost);
    }

}
