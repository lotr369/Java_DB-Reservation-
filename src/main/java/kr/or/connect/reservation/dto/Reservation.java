package kr.or.connect.reservation.dto;
import java.util.Date;

public class Reservation {

	// category
	private int id; // 카테고리 id / 전시정보id / user id
	private String name; // 카테고리 이름 / user name

	// product
	private int category_id; // 카테고리 id
	private String description; // 상품 간단 설명
	private String content; // 상품 상세 설명
	private String event; // 이벤트 정보
	private Date create_date; // 생성시간
	private Date modify_date; // 수정시간

	// display_info
	private int product_id; // product id
	private String opening_hours; // 전시 시간
	private String place_name; // 장소 명 ex>세종문화회관
	private String place_lot; // 지번 주소
	private String place_street; // 도로명 주소
	private String tel; // 문의전화번호
	private String homepage; // 홈페이지
	private String email; // 문의email / login id, email

	// user
	private String password;// 암호회된 password
	private String phone; // phone

	// user_role
	private int user_id; // user id fk
	private String role_name; // 'role 이름 ROLE_ 로 시작하는 값이어야 한다.

	// file_info
	private String file_name; // 원본파일
	private String save_file_name; // save파일 명
	private String content_type; // 파일 mime type
	private int delete_flag; //

	// product_image
	private String type;
	private int file_id;

	// product_price
	private String price_type_name;
	private int price;
	private long discount_rate;

	// display_info_image
	private int display_info_id;

	// promotion
	// `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '프로모션 id',
	// `product_id` INT(11) NOT NULL COMMENT '프로모션id',

	// reservation_info
	private Date reservation_date; // 예매일
	private int cancel_flag; // 취소 :1 예약:0

	// reservation_info_price
	private int reservation_info_id; // 예매정보id
	private int product_price_id; // 상품 가격 id
	private int count; // 예매수

	// reservation_user_comment
	private long score; // 별점
	private String comment; // 한줄평

	// reservation_user_comment_image
	private int reservation_user_comment_id; // 한줄평 id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getModify_date() {
		return modify_date;
	}

	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getOpening_hours() {
		return opening_hours;
	}

	public void setOpening_hours(String opening_hours) {
		this.opening_hours = opening_hours;
	}

	public String getPlace_name() {
		return place_name;
	}

	public void setPlace_name(String place_name) {
		this.place_name = place_name;
	}

	public String getPlace_lot() {
		return place_lot;
	}

	public void setPlace_lot(String place_lot) {
		this.place_lot = place_lot;
	}

	public String getPlace_street() {
		return place_street;
	}

	public void setPlace_street(String place_street) {
		this.place_street = place_street;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getSave_file_name() {
		return save_file_name;
	}

	public void setSave_file_name(String save_file_name) {
		this.save_file_name = save_file_name;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public int getDelete_flag() {
		return delete_flag;
	}

	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFile_id() {
		return file_id;
	}

	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}

	public String getPrice_type_name() {
		return price_type_name;
	}

	public void setPrice_type_name(String price_type_name) {
		this.price_type_name = price_type_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(long discount_rate) {
		this.discount_rate = discount_rate;
	}

	public int getDisplay_info_id() {
		return display_info_id;
	}

	public void setDisplay_info_id(int display_info_id) {
		this.display_info_id = display_info_id;
	}

	public Date getReservation_date() {
		return reservation_date;
	}

	public void setReservation_date(Date reservation_date) {
		this.reservation_date = reservation_date;
	}

	public int getCancel_flag() {
		return cancel_flag;
	}

	public void setCancel_flag(int cancel_flag) {
		this.cancel_flag = cancel_flag;
	}

	public int getReservation_info_id() {
		return reservation_info_id;
	}

	public void setReservation_info_id(int reservation_info_id) {
		this.reservation_info_id = reservation_info_id;
	}

	public int getProduct_price_id() {
		return product_price_id;
	}

	public void setProduct_price_id(int product_price_id) {
		this.product_price_id = product_price_id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getReservation_user_comment_id() {
		return reservation_user_comment_id;
	}

	public void setReservation_user_comment_id(int reservation_user_comment_id) {
		this.reservation_user_comment_id = reservation_user_comment_id;
	}

}
