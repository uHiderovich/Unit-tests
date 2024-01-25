package seminars.first.Shop;

public class Product {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Конструкторы:
    public Product(String title, Integer cost) {
        this.cost = cost;
        this.title = title;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        	return "Product{" +
                    "cost=" + cost +
                    ", title='" + title + '\'' +
                    '}';
    }
}
