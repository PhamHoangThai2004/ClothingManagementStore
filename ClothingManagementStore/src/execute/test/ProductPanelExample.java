/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execute.test;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class ProductPanelExample {

    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Product Panels Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Tạo JPanel chứa các sản phẩm với GridLayout
        JPanel productPanelContainer = new JPanel();
        productPanelContainer.setLayout(new GridLayout(0, 3, 10, 10)); // Số cột là 3, khoảng cách giữa các ô là 10px
        
        // Thêm JScrollPane để hỗ trợ cuộn khi số lượng sản phẩm lớn
        JScrollPane scrollPane = new JScrollPane(productPanelContainer);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Danh sách các sản phẩm
        List<Product> products = getProducts(); // Hàm giả định lấy danh sách sản phẩm
        
        // Tạo và thêm các JPanel sản phẩm vào container
        for (Product product : products) {
            JPanel productPanel = createProductPanel(product);
            productPanelContainer.add(productPanel);
        }

        // Hiển thị JFrame
        frame.setVisible(true);
    }

    // Hàm giả định lấy danh sách sản phẩm
    private static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", "Description of Product 1", 10.99));
        products.add(new Product("Product 2", "Description of Product 2", 15.49));
        products.add(new Product("Product 3", "Description of Product 3", 7.99));
        products.add(new Product("Product 4", "Description of Product 4", 12.99));
        products.add(new Product("Product 5", "Description of Product 5", 8.49));
        products.add(new Product("Product 6", "Description of Product 6", 9.99));
        products.add(new Product("Product 7", "Description of Product 7", 14.99));
        products.add(new Product("Product 8", "Description of Product 8", 11.49));
        products.add(new Product("Product 9", "Description of Product 9", 5.99));
        products.add(new Product("Product 10", "Description of Product 9", 5.99));
        products.add(new Product("Product 11", "Description of Product 7", 14.99));
        products.add(new Product("Product 12", "Description of Product 8", 11.49));
        products.add(new Product("Product 13", "Description of Product 9", 5.99));
        products.add(new Product("Product 14", "Description of Product 9", 5.99));
        products.add(new Product("Product 15", "Description of Product 7", 14.99));
        products.add(new Product("Product 16", "Description of Product 8", 11.49));
        products.add(new Product("Product 17", "Description of Product 9", 5.99));
        products.add(new Product("Product 18", "Description of Product 9", 5.99));
        products.add(new Product("Product 19", "Description of Product 9", 5.99));
        products.add(new Product("Product 5", "Description of Product 5", 8.49));
        products.add(new Product("Product 6", "Description of Product 6", 9.99));
        products.add(new Product("Product 7", "Description of Product 7", 14.99));
        products.add(new Product("Product 8", "Description of Product 8", 11.49));
        products.add(new Product("Product 9", "Description of Product 9", 5.99));
        products.add(new Product("Product 10", "Description of Product 9", 5.99));
        products.add(new Product("Product 11", "Description of Product 7", 14.99));
        products.add(new Product("Product 12", "Description of Product 8", 11.49));
        products.add(new Product("Product 13", "Description of Product 9", 5.99));
        products.add(new Product("Product 14", "Description of Product 9", 5.99));
        products.add(new Product("Product 15", "Description of Product 7", 14.99));
        products.add(new Product("Product 16", "Description of Product 8", 11.49));
        products.add(new Product("Product 17", "Description of Product 9", 5.99));
        products.add(new Product("Product 18", "Description of Product 9", 5.99));
        products.add(new Product("Product 19", "Description of Product 9", 5.99));

        // Thêm nhiều sản phẩm khác nếu cần
        return products;
    }

    // Tạo JPanel cho một sản phẩm
    private static JPanel createProductPanel(Product product) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBackground(Color.LIGHT_GRAY);

        JLabel nameLabel = new JLabel("Name: " + product.getName());
        JLabel descriptionLabel = new JLabel("Description: " + product.getDescription());
        JLabel priceLabel = new JLabel("Price: $" + product.getPrice());

        panel.add(nameLabel, BorderLayout.NORTH);
        panel.add(descriptionLabel, BorderLayout.CENTER);
        panel.add(priceLabel, BorderLayout.SOUTH);

        return panel;
    }
}

// Lớp sản phẩm đơn giản
class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
