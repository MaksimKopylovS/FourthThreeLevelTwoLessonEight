package max_sk.HomeWork.controller;


import lombok.RequiredArgsConstructor;
import max_sk.HomeWork.dto.OrderDTO;
import max_sk.HomeWork.model.Order;
import max_sk.HomeWork.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/username{orderUser}")
    @ResponseStatus(HttpStatus.CREATED)
    public List<OrderDTO> showOrder(@RequestBody OrderDTO orderDTO){
        return orderService.orderDTOList(orderDTO);
    }
}
