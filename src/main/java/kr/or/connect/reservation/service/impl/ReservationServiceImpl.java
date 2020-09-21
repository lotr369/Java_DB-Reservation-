package kr.or.connect.reservation.service.impl;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.reservation.dao.ReservationDao;
import kr.or.connect.reservation.dao.LogDao;
import kr.or.connect.reservation.dto.Reservation;
import kr.or.connect.reservation.dto.Log;
import kr.or.connect.reservation.service.impl.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	ReservationDao reservationDao;
	
	@Autowired
	LogDao logDao;
	
	@Override
	@Transactional
	public List<Reservation> getReservations(Integer start) {
		List<Reservation> list = reservationDao.selectCategory(start, ReservationService.LIMIT);
		return list;
	}
	
	@Override
	@Transactional
	public List<Reservation> getProduct(Integer start) {
		List<Reservation> list2 = reservationDao.selectProduct(start, ReservationService.LIMIT);
		return list2;
	}
	
	@Override
	@Transactional
	public List<Reservation> getDisplayInfo(Integer start) {
		List<Reservation> list = reservationDao.selectDisplayInfo(start, ReservationService.LIMIT);
		return list;
	}
	
	@Override
	@Transactional
	public List<Reservation> getPromotion(Integer start) {
		List<Reservation> list = reservationDao.selectPromotion(start, ReservationService.LIMIT);
		return list;
	}
	
	@Override
	@Transactional
	public List<Reservation> getCategorys(Integer start) {
		List<Reservation> list = reservationDao.selectPromotion(start, ReservationService.LIMIT);
		return list;
	}
	
	@Override
	@Transactional
	public List<Reservation> getComment(Integer start) {
		List<Reservation> list = reservationDao.getComment(start, ReservationService.LIMIT);
		return list;
	}
	
	@Override
	@Transactional
	public List<Reservation> category_Product1(Integer start) {
		List<Reservation> list = reservationDao.Category_Product1(start, ReservationService.LIMIT);
		return list;
	}
	@Override
	@Transactional
	public List<Reservation> category_Product2(Integer start) {
		List<Reservation> list = reservationDao.Category_Product2(start, ReservationService.LIMIT);
		return list;
	}
	@Override
	@Transactional
	public List<Reservation> category_Product3(Integer start) {
		List<Reservation> list = reservationDao.Category_Product3(start, ReservationService.LIMIT);
		return list;
	}
	@Override
	@Transactional
	public List<Reservation> category_Product4(Integer start) {
		List<Reservation> list = reservationDao.Category_Product4(start, ReservationService.LIMIT);
		return list;
	}
	@Override
	@Transactional
	public List<Reservation> category_Product5(Integer start) {
		List<Reservation> list = reservationDao.Category_Product5(start, ReservationService.LIMIT);
		return list;
	}
	
//	@Override
//	@Transactional(readOnly=false)
//	public int deleteCategory(Long id, String ip) {
//		int deleteCount = categoryDao.deleteById(id);
//		Log log = new Log();
//		log.setIp(ip);
//		log.setMethod("delete");
//		log.setRegdate(new Date());
//		
//		
//		return deleteCount;
//	}
//	
//	@Override
//	@Transactional(readOnly=false)
//	public Reservation addCategory(Reservation category, String ip) {
//		category.setRegdate(new Date());
//		Long id = categoryDao.insert(category);
//		category.setId(id);
		
//		if(1 == 1)
//			throw new RuntimeException("test exception");
//			
//		Log log = new Log();
//		log.setIp(ip);
//		log.setMethod("insert");
//		log.setRegdate(new Date());
//		logDao.insert(log);
		
		
//		return category;
//	}
	
	@Override
	public int getCount() {
		return reservationDao.selectCount();
	}
	@Override
	public int countProduct() {
		return reservationDao.countProduct();
	}

}
