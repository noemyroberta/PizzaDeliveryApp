CREATE DATABASE db_pizzadelivery;
USE db_pizzadelivery;
# DROP DATABASE db_pizzadelivery;
CREATE TABLE tb_customers (
	cus_id				 INTEGER AUTO_INCREMENT PRIMARY KEY,
	cus_cpf 			 VARCHAR(14) NOT NULL,
    cus_full_name 		 VARCHAR(100) NOT NULL,
    cus_zip_code 		 VARCHAR(9) NOT NULL,
	cus_street 			 VARCHAR(120),
    cus_neighborhood 	 VARCHAR(30),
    cus_number 			 VARCHAR(5),
    cus_complement 		 VARCHAR(100),
    cus_telephone_number VARCHAR(9) NOT NULL
);

CREATE TABLE tb_categories (
	cat_id		 VARCHAR(3) PRIMARY KEY NOT NULL,
    cat_category VARCHAR(40) NOT NULL
);

CREATE TABLE tb_delivery_boys (
	deb_id						VARCHAR(3) PRIMARY KEY NOT NULL,
	deb_cpf 			 		VARCHAR(14) NOT NULL,
    deb_full_name 		 		VARCHAR(100) NOT NULL,
    deb_zip_code 		 		VARCHAR(9) NOT NULL,
	deb_street 			 		VARCHAR(120),
    deb_neighborhood 	 		VARCHAR(30),
    deb_number 			 		VARCHAR(5),
    deb_complement 		 		VARCHAR(100),
	deb_telephone_number 		VARCHAR(9) NOT NULL,
    deb_aerea				    VARCHAR(30),
    deb_number_deliveries_day   SMALLINT,
    deb_number_total_deliveries SMALLINT
);

CREATE TABLE tb_products (
	pro_id		VARCHAR(4) PRIMARY KEY NOT NULL,
    pro_price 	DECIMAL(6, 2) NOT NULL,
    pro_product VARCHAR(30) NOT NULL,
    pro_cat_id 	VARCHAR(3) NOT NULL,
    pro_taste 	VARCHAR(120) NOT NULL,
    pro_picture VARCHAR(120), 
   
    FOREIGN KEY (pro_cat_id) REFERENCES tb_categories (cat_id)
);

CREATE TABLE tb_orders (
	ord_id 				 INTEGER AUTO_INCREMENT PRIMARY KEY,
    ord_cus_id 			 INTEGER NOT NULL,
    ord_promotional_code VARCHAR(10),
	ord_discount 		 INT,
    ord_hour_order_sent  TIME NOT NULL,
    ord_description 	 VARCHAR(120),
    ord_payment 		 VARCHAR(30) NOT NULL,
    ord_total_price 	 DECIMAL(6, 2) NOT NULL,
    
    FOREIGN KEY (ord_cus_id) REFERENCES tb_customers (cus_id)
);

CREATE TABLE tb_order_products (
	orp_pro_id VARCHAR(4) NOT NULL,
    orp_ord_id INTEGER NOT NULL,
	orp_amount VARCHAR(2) NOT NULL,
    
    PRIMARY KEY (orp_pro_id, orp_ord_id),
    FOREIGN KEY (orp_pro_id) REFERENCES tb_products (pro_id),
    FOREIGN KEY (orp_ord_id) REFERENCES tb_orders (ord_id)
);

CREATE TABLE tb_deliveries (
	del_ord_id INTEGER PRIMARY KEY NOT NULL,
    del_sent_time TIME NOT NULL,
    del_arrival_time TIME NOT NULL,
    del_deb_id VARCHAR(3) NOT NULL,
    del_status BOOLEAN DEFAULT FALSE NOT NULL,

	FOREIGN KEY (del_ord_id) REFERENCES tb_orders (ord_id),
    FOREIGN KEY (del_deb_id) REFERENCES tb_delivery_boys (deb_id)
);