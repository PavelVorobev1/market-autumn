CREATE TABLE IF NOT EXISTS products (id bigserial, price int, title VARCHAR(255), PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Orange', 30), ('Apple', 20), ('Banana', 25), ('Milk', 30), ('Cake', 10), ('Rice', 25), ('Pepper', 5), ('Potato', 9), ('Pizza', 125), ('Eggs', 99), ('Cheese', 135), ('Cookie', 75);;