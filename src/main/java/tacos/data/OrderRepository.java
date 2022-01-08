package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
        Order save(Order order);
    /*
    List<Order> findByDeliveryZip(String deliveryZip);

    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);

    List<Order> findByDeliveryToAndDeliveryCityAllIgnoresCase(
        String deliveryTo, String deliveryCity);

    List<Order> findByDeliveryCityOrderByDeliveryTo(String city);

    @Query("Order o where o.deliveryCity='Seattle'")
    List<Order> readOrdersDeliveredInSeattle();
*/
}
