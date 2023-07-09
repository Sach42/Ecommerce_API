package com.sachin.Ecommerce.API.service;
import com.sachin.Ecommerce.API.model.Address;
import com.sachin.Ecommerce.API.model.Order;
import com.sachin.Ecommerce.API.model.Product;
import com.sachin.Ecommerce.API.model.User;
import com.sachin.Ecommerce.API.repository.AddressRepository;
import com.sachin.Ecommerce.API.repository.OrderRepository;
import com.sachin.Ecommerce.API.repository.ProductRepository;
import com.sachin.Ecommerce.API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public OrderService(
            OrderRepository orderRepository,
            UserRepository userRepository,
            ProductRepository productRepository,
            AddressRepository addressRepository
    ) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.addressRepository = addressRepository;
    }

    public Order createOrder(Integer userId, Integer productId, Integer addressId, Integer productQuantity) {
        User user = userRepository.findById(userId).orElse(null);
        Product product = productRepository.findById(productId).orElse(null);
        Address address = addressRepository.findById(addressId).orElse(null);

        if (user != null && product != null && address != null) {
            Order order = new Order();
            order.setUser(user);
            order.setProduct(product);
            order.setAddress(address);
            order.setProductQuantity(productQuantity);
            return orderRepository.save(order);
        }

        return null;
    }

    public Order getOrderById(Integer orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }
}
