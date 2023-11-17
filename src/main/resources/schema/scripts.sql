DROP TABLE IF EXISTS ITEMS;
CREATE TABLE ITEMS (
                      ITEM_NO  INT AUTO_INCREMENT  PRIMARY KEY,
                      NAME VARCHAR(50) NOT NULL,
                      TYPE VARCHAR(50) NOT NULL,
                      PRICE INT(8) NOT NULL,
                      ITEM_TYPE VARCHAR(50) NOT NULL
);

INSERT INTO ITEMS VALUES (1,'Non Veg Curries', 'Chicken Bone Less Curry', 285,'NonVeg');
INSERT INTO ITEMS VALUES (2,'Veg Starter', 'Paneer 65',275,'Veg');
INSERT INTO ITEMS VALUES (3, 'Non Veg Biriyani', 'Hari Special Biriyani',299,'NonVeg');