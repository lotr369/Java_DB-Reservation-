package kr.or.connect.reservation.dao;

public class ReservationDaoSqls {
	
	//전체출력
	public static final String Get_Categorys = "select c.id, c.name, count(p.category_id) as count from category as c inner join product as p on c.id=p.category_id group by p.category_id";
	
	
	public static final String Select_Category =
			"select count(*) from product where category_id=1;" ;
	
	
	
	public static final String Select_Product =
			"select p.id,p.category_id as categoryId,d.id as displayInfoId,c.name as name,\r\n" + 
			"p.description,p.content,p.event,d.opening_hours as openingHours,d.place_name as placeName,\r\n" + 
			"d.place_lot as placeLot, d.place_street as placeStreet,d.tel, d.homepage, d.email,\r\n" + 
			"p.create_date as createDate, p.modify_date as modifyDate,pi.file_id as fileId\r\n" + 
			"from product as p \r\n" + 
			"inner join display_info as d on p.id=d.product_id \r\n" + 
			"inner join category as c on p.category_id=c.id \r\n" + 
			"inner join product_image as pi on p.id=pi.product_id and pi.type like 'ma'\r\n" + 
			"group by p.id";
	
	public static final String Select_Display_Info =
			"SELECT id,product_id,opening_hours,place_name,place_lot,place_street,tel,homepage,email,create_date,modify_date FROM display_info ORDER BY id";
	public static final String Select_Promotion =
			"select pm.id,pm.product_id as productId,p.category_id as categoryId,\r\n" + 
			"c.name as categoryName,p.description as description,pi.file_id as fileId\r\n" + 
			"from promotion as pm\r\n" + 
			"inner join product as p on pm.product_id=p.id\r\n" + 
			"inner join product_image as pi on p.id=pi.product_id and pi.type like 'th'\r\n" + 
			"inner join category as c on p.category_id=c.id";
	
	public static final String Select_Comment = 
			"select * from reservation_user_comment;";
	
	
	
	//카운트
	public static final String Count_Category =
			"SELECT count(*) FROM category";
	public static final String Count_Product =
			"SELECT count(*) FROM product";
	public static final String Count_DisplayInfo =
			"SELECT count(*) FROM display_info";
	
	//카테고리 장르검색
	public static final String Category_Product1 =
			"select product.description,product.content,product.event from product,category where category.id=product.category_id and category.id=1 ";
	public static final String Category_Product2 =
			"select product.description,product.content,product.event from product,category where category.id=product.category_id and category.id=2 ";
	public static final String Category_Product3 =
			"select product.description,product.content,product.event from product,category where category.id=product.category_id and category.id=3 ";
	public static final String Category_Product4 =
			"select product.description,product.content,product.event from product,category where category.id=product.category_id and category.id=4 ";
	public static final String Category_Product5 =
			"select product.description,product.content,product.event, product.modify_date from product,category where category.id=product.category_id and category.id=5 ";
	


}
