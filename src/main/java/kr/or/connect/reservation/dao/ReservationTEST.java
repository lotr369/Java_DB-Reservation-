package kr.or.connect.reservation.dao;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.dto.Reservation;

public class ReservationTEST {

	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		ReservationDao reservationDao = ac.getBean(ReservationDao.class);
		
		System.out.println(reservationDao.selectCount());
		
//		Reservation reservation = new Reservation();
//		reservation.setName("갤럭시");
//		reservation.setContent("굿굿");
//		reservation.setRegdate(new Date());
//		Long id = reservationDao.insert(reservation);
//		System.out.println("id : " + id);
		
//		LogDao logDao = ac.getBean(LogDao.class);
//		Log log = new Log();
//		log.setIp("127.0.0.1");
//		log.setMethod("insert");
//		log.setRegdate(new Date());
//		logDao.insert(log);
	}
}
