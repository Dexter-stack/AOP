package org.dexter;

import org.config.BeanConfig;
import org.core.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart shoppingCart =  context.getBean(ShoppingCart.class);
        shoppingCart.checkout("Canceled");

    }
}