import seminars.first.Shop.Product;
import seminars.first.Shop.Shop;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(
                new Product("Молоко", 50),
                new Product("Хлеб", 30),
                new Product("Сыр", 100),
                new Product("Колбаса", 150),
                new Product("Кефир", 60)
        ));

        // 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
        assertThat(shop.getProducts()).hasSize(5);
        assertThat(shop.getProducts())
                .extracting("title", "cost")
                .contains(
                    tuple("Молоко", 50),
                    tuple("Хлеб", 30),
                    tuple("Сыр", 100),
                    tuple("Колбаса", 150),
                    tuple("Кефир", 60)
                );


        // 2. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
        assertThat(shop.sortProductsByPrice()).extracting("cost").contains(30, 50, 60, 100, 150);

        // 3. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
        assertThat(shop.getMostExpensiveProduct()).extracting("title", "cost").contains("Колбаса", 150);
    }
}
