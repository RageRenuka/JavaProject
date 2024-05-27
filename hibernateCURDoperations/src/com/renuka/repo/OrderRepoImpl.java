package com.renuka.repo;

import java.util.List;

import javax.persistence.NoResultException;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.renuka.dto.Order;
import com.renuka.util.SessionUtil;
import com.renuka.dto.Order;


public class OrderRepoImpl implements OrderRepo {
	@Override
	public void saveOrderRepo(Order order) {
		Session session=SessionUtil.getSession();
		Transaction txt=session.beginTransaction();
		session.save(order);
		txt.commit();
	}

	@Override
	public Order selectOrderByIdRepo(int OrderId) {
		Session session=SessionUtil.getSession();
		Transaction txt=session.beginTransaction();
		Order order=session.get(Order.class, OrderId);
		txt.commit();
		return order;
	}

	@Override
	public List<Order> selectAllOrdersRepo() {
		Session session = SessionUtil.getSession();
		Query<Order> query = session.createQuery("from Order");
		List<Order> orderList = query.list();
		return orderList;
	}

	@Override
	public void deleteOrderByIdRepo(int orderId) {
		Session session=SessionUtil.getSession();
		Transaction txt=session.beginTransaction();
		Order oreder=session.get(Order.class, orderId);
		session.delete(oreder);
		txt.commit();
	}

	@Override
	public Order updateOrderRepo(Order order) {
		Session session=SessionUtil.getSession();
		Transaction txt=session.beginTransaction();
		session.update(order);
		txt.commit();
		return order;
	}
	@Override
	public List<Order> selectOrdersByPriceRepo() {
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(Order.class);
		Criterion condition1 = Restrictions.gt("orderPrice", 5000.0);
		Criterion condition2 = Restrictions.lt("orderPrice", 500.0);
		Criterion condition3  = Restrictions.eq("orderType", "food");
		Criterion cr = Restrictions.or(condition1,condition2,condition3);
//		Criterion or = Restrictions.or(and,condition3);
		criteria.add(cr);
	    List<Order> orderList = criteria.list();
		return orderList;
	}

	@Override
	public Order testLoad(int orderId) {
	Session session=SessionUtil.getSession();
	Transaction txt=session.beginTransaction();
	Order loadOrder=session.load(Order.class, new Integer(orderId));
	txt.commit();
		return loadOrder;
	}

	@Override
	public Order testGet(int orderId) {
		Session session=SessionUtil.getSession();
		Transaction txt=session.beginTransaction();
		Order loadOrder=session.get(Order.class, new Integer(orderId));
		txt.commit();
			return loadOrder;
	}


	

	@Override
	public List<Order> selectMaxOrderPrice() {
		Session session = SessionUtil.getSession();
		Transaction txt=session.beginTransaction();
//		desc
		Query<Order> qo=session.createQuery("from Order order by orderPrice desc");
		List<Order> maxPrice=qo.getResultList();
		return maxPrice;
		
	}

	@Override
	public List<Order> selectMinOrderPrice() {
		Session session = SessionUtil.getSession();
		Transaction txt=session.beginTransaction();	
		Query<Order> qo=session.createQuery("from Order order by orderPrice asc");
		List<Order> minPrice=qo.getResultList();
		return minPrice;
	}

	

	
	
	
}
