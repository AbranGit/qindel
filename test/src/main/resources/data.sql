DROP TABLE IF EXISTS PRICE;
CREATE TABLE PRICE(brand_id INT NOT NULL, start_date TIMESTAMP, end_date TIMESTAMP, price_list INT PRIMARY KEY NOT NULL, product_id INT NOT NULL, priority INT NOT NULL, price DOUBLE NOT NULL, currency VARCHAR(255)  NOT NULL);

INSERT INTO price (brand_id, start_date, end_date, price_list, product_id, priority, price, currency) VALUES
(1, '2020-06-14T00:00:00', '2020-12-31T23:59:59', 1, 35455, 0, 35.50, 'EUR'),
(1, '2020-06-14T15:00:00', '2020-06-14T18:30:00', 2, 35455, 1, 25.45, 'EUR'),
(1, '2020-06-15T00:00:00', '2020-06-15T11:00:00', 3, 35455, 1, 30.50, 'EUR'),
(1, '2020-06-15T16:00:00', '2020-12-31T23:59:59', 4, 35455, 1, 38.95, 'EUR');