package com.roro.msproviderorder.service;

import com.roro.msproviderorder.dao.OrderDao;
import com.roro.msproviderorder.entity.Order;
import com.roro.msproviderorder.entity.OrderVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl {

    @Autowired
    private OrderDao orderDao;

    public List<OrderVo> queryOrdersByUserId(Integer userId) {
        List<Order> orderList = orderDao.queryOrdersByUserId(userId);
        List<OrderVo> orderVoList = new ArrayList<>();
        for(Order order:orderList) {
            OrderVo orderVo = new OrderVo();
            BeanUtils.copyProperties(order,orderVo);
            orderVoList.add(orderVo);
        }
        return orderVoList;
    }
}
