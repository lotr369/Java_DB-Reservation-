package kr.or.connect.reservation.service.impl;

import java.util.List;

import kr.or.connect.reservation.dto.Reservation;

public interface ReservationService {
	public static final Integer LIMIT = 5;
	public List<Reservation> getReservations(Integer start);
	public List<Reservation> getProduct(Integer start);
	public List<Reservation> getDisplayInfo(Integer start);
	public List<Reservation> getPromotion(Integer start);
	public List<Reservation> getCategorys(Integer start);
	public List<Reservation> getComment(Integer start);
	
	public List<Reservation> category_Product1(Integer start);
	public List<Reservation> category_Product2(Integer start);
	public List<Reservation> category_Product3(Integer start);
	public List<Reservation> category_Product4(Integer start);
	public List<Reservation> category_Product5(Integer start);
	
//	public int deleteCategory(Long id, String ip);
//	public Reservation addCategory(Reservation category, String ip);
	public int getCount();
	public int countProduct();
}
