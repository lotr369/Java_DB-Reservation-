package kr.or.connect.reservation.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.reservation.dto.Reservation;

import static kr.or.connect.reservation.dao.ReservationDaoSqls.*;

@Repository
public class ReservationDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Reservation> rowMapper = BeanPropertyRowMapper.newInstance(Reservation.class);

	public ReservationDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
				.withTableName("app")
				.usingGeneratedKeyColumns("id");
	}

	//Category 전체출력
	public List<Reservation> selectCategory(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Select_Category, params, rowMapper);
	}
	
	//Product 전체출력
	public List<Reservation> selectProduct(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Select_Product, params, rowMapper);
	}
	
	//DisplayInf전체 출력
	public List<Reservation> selectDisplayInfo(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Select_Display_Info, params, rowMapper);
	}
	
	//Promotion출력
	public List<Reservation> selectPromotion(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Select_Promotion, params, rowMapper);
	}
	
	public List<Reservation> getCategorys(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Get_Categorys, params, rowMapper);
	}
	
	public List<Reservation> getComment(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Select_Comment, params, rowMapper);
	}
	
	
	
	
	
	public List<Reservation> Category_Product1(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Category_Product1, params, rowMapper);
	}
	public List<Reservation> Category_Product2(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Category_Product2, params, rowMapper);
	}
	public List<Reservation> Category_Product3(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Category_Product3, params, rowMapper);
	}
	public List<Reservation> Category_Product4(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Category_Product4, params, rowMapper);
	}
	public List<Reservation> Category_Product5(Integer start, Integer limit) {
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(Category_Product5, params, rowMapper);
	}
	


	public int selectCount() {
		return jdbc.queryForObject(Count_Category, Collections.emptyMap(), Integer.class);
	}
	public int countProduct() {
		return jdbc.queryForObject(Count_Product, Collections.emptyMap(), Integer.class);
	}
}