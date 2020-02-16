/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.javastart.exjavarestaurant;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author ET4
 */
public class Menu {

    public static final List<Dish> MENU = List.of(
              new Dish(1, "Pizza Margherita", 24.99),
              new Dish(2, "Pizza Mafioso", 29.99),
              new Dish(3, "Spaghetti Bolognese", 31.99),
              new Dish(4, "Spaghetti Carbonara", 26.99),
              new Dish(5, "Lasagne", 24.99),
              new Dish(6, "Gazpacho", 16.99),
              new Dish(7, "Cannelloni ze szpinakiem", 29.99),
              new Dish(8, "Bruschetta", 13.99),
              new Dish(9, "Tiramisu", 19.99),
              new Dish(10, "Panna Cotta", 19.99));

    public static List<Dish> convertsIdToOrder(List<Integer> ids) {
        return ids.stream()
                  .map(id -> MENU.get(id - 1))
                  .collect(Collectors.toList());
    }

}
