package ex_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Dish pizza = new Dish("Pizza", false, 900);
        Dish soupVege = new Dish("Soup", true, 240);
        Dish cake = new Dish("Cake", true, 320);
        Dish sandwichWithHam = new Dish("Sandwich", false, 250);
        Dish hummus = new Dish("Hummus", true, 150);
        Dish burrito = new Dish("Burrito", false, 650);

        List<Dish> dishes = Arrays.asList(pizza, sandwichWithHam, soupVege, cake, hummus, burrito);

        //dishes.forEach(System.out::println);

        System.out.println(getOnlyVeges(dishes));
    }

    public static List getOnlyVeges(List<Dish> dishes) {
        return dishes.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());
    }
}
