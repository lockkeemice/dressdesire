package com.project.dao;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.Cart;
import com.project.model.Product;



	
	@Repository("cartDao")

	public class CartDaoImpl implements CartDao {
		public static Logger log = LoggerFactory.getLogger(CartDaoImpl.class);

		@Autowired
		private SessionFactory sessionFactory;
		
		
		public CartDaoImpl(SessionFactory sessionFactory) {

			this.sessionFactory = sessionFactory;
		}

		
		
		public List<Cart> list(String user_id) {
			log.debug("Starting of the method list");
			String hql = "from Cart where user_id='" + user_id + "'  and status = " + "'New'";
			Query query = sessionFactory.openSession().createQuery(hql);
			log.debug("Ending of the method list");
			return query.list();
			
		}

		
		public boolean save(Cart cart) {
			log.debug("Starting of the method save");

			//cart.setCart_id(cart.getCart_id());
			try {
				sessionFactory.openSession().save(cart);
				return true;
			} catch (HibernateException e) {
			
				e.printStackTrace();
				return false;
			}
			
		}

		
		public Cart getCart(String user_id, String product_name) {
			String hql = "from Cart where user_id = ? and product_name = ?";
			Query  query = sessionFactory.openSession().createQuery(hql);
			query.setString(0, user_id);
			query.setString(1, product_name);
			return (Cart) query.uniqueResult();
			
		}

		
	
		public Integer getQuantity(String user_id, String product_name) {
			String hql = "select quantity from  cart where user_id = ?  &&  product_name =?";
			
			Query query = sessionFactory.openSession().createQuery(hql);
			query.setString(0, user_id);
			query.setString(1, product_name);
			log.debug("Ending of the method getTotalAmount");
			return (Integer) query.uniqueResult();
		}
		
		
		

		public Double getTotalAmount(String user_id) {
				log.debug("Starting of the method getTotalAmount");
				String hql = "select sum(price*quantity) from Cart where user_id=" + "'" + user_id + "'" + "  and status = " + "'New'";
				log.debug("hql" + hql);

				Query query = sessionFactory.openSession().createQuery(hql);
				log.debug("Ending of the method getTotalAmount");
				return (Double) query.uniqueResult();

		}

/*		@Transactional
		private int getMaxId() {
			log.debug("Starting of the method getMaxId");
			Long maxID = 100L;
			try {
				String hql = "select max(cart_id) from cart";
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				maxID = (Long) query.uniqueResult();
			} catch (HibernateException e) {
				log.debug("It seems this is first record. setting initial id is 100 :");
				maxID = 100L;
				e.printStackTrace();
			}
			log.debug("Max id :" + maxID);
			return (int) (maxID + 1);
		}*/
		

		
	public Cart get(int id) {
		return (Cart) sessionFactory.openSession().get(Cart.class,id);
			
		}
		
		
		public boolean delete(Cart cart) {
			try {
				Session session=sessionFactory.openSession();
				//Cart cart1=(Cart)session.get(Cart.class, cart.getCart_id()); //persistent
				session.delete(cart);
				session.flush();
				session.close();
				//sessionFactory.openSession().delete(cart);

			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
		
		
		
		public boolean update(Cart cart) {
			try {
				sessionFactory.openSession().update(cart);
				return true;
			} catch (HibernateException e) {
				
				e.printStackTrace();
				return false;
			}
		}



		



		public void removeCartProduct(String product_name) {
			// TODO Auto-generated method stub
		//	sessionFactory.delete(product_name);
			
			//Session session=sessionFactory.openSession().delete(product_name);
	//		 Cart cart=(Cart)session.get(Cart.class,product_name); //persistent
	//		session.delete(product_name);
	//		session.flush();
	//		session.close();
			
			Session session=sessionFactory.openSession();
			 Cart cart=(Cart)session.get(Cart.class, product_name); 
			session.delete(product_name);
			session.flush();
			session.close();
		}



		



		
}