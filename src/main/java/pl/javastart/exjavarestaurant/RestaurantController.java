/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.javastart.exjavarestaurant;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ET4
 */
public class RestaurantController {

    public void mainMenu() {
        System.out.println("witaj");
        printMenu();
        Order order = takeOrder();
        printSummary(order);

    }

    private void printMenu() {
        System.out.println("Dzisiaj podajemy:");
        Menu.MENU.forEach(System.out::println);
        System.out.println("Podaj numery po przecinku");
    }

    private Order takeOrder() {
        List<Integer> dishesIds = getDishesNumber();
        List<Dish> dishes = Menu.convertsIdToOrder(dishesIds);
        return new Order(dishes);
    }

    private List<Integer> getDishesNumber() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.replaceAll(" ", "").split(",");
        return Arrays.stream(split)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
    
    private void printSummary(Order order){
        System.out.println(order);
    }
}
