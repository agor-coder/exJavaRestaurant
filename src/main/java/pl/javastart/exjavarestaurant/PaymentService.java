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
public class PaymentService {

    private static final double TIP_MARGIN = 100;
    private static final double TIP_LOW = 0.1;
    private static final double TIP_HIGH = 0.15;

    public static double calculateServiceCost(double price) {
        if (price > TIP_MARGIN) {
            return price * TIP_LOW;
        } else {
            return price * TIP_HIGH;
        }
    }

   public static double calculateSumDishes(List<Dish> dishes) {
        return dishes.stream().mapToDouble(Dish::getPrice).sum();

    }

}
