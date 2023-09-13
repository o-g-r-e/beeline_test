insert into warehouse values (1, 'Склад 1'), (2, 'Склад 2'), (3, 'Склад 3'), (4, 'Склад 4');

insert into item (id, name, category_name, price) values (1, 'Item 1', 'Category 1', 10.0);
insert into item (id, name, category_name, price) values (2, 'Item 2', 'Category 2', 20.0);
insert into item (id, name, category_name, price) values (3, 'Item 3', 'Category 3', 30.0);
insert into item (id, name, category_name, price) values (4, 'Item 4', 'Category 4', 40.0);
insert into item (id, name, category_name, price) values (5, 'Item 5', 'Category 5', 10.0);
insert into item (id, name, category_name, price) values (6, 'Item 6', 'Category 6', 20.0);
insert into item (id, name, category_name, price) values (7, 'Item 7', 'Category 1', 10.0);
insert into item (id, name, category_name, price) values (8, 'Item 8', 'Category 2', 20.0);
insert into item (id, name, category_name, price) values (9, 'Item 9', 'Category 3', 30.0);
insert into item (id, name, category_name, price) values (10, 'Item 10', 'Category 4', 40.0);
insert into item (id, name, category_name, price) values (11, 'Item 11', 'Category 5', 10.0);
insert into item (id, name, category_name, price) values (12, 'Item 12', 'Category 6', 20.0);
insert into item (id, name, category_name, price) values (13, 'Item 13', 'Category 5', 10.0);

insert into warehouse_item (warehouse_id, item_id, amount) values (1, 1, 6);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 2, 1);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 3, 8);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 4, 1);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 5, 6);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 11, 6);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 6, 1);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 7, 8);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 8, 1);
--insert into warehouse_item (warehouse_id, item_id, amount) values (1, 11, 7);
insert into warehouse_item (warehouse_id, item_id, amount) values (1, 13, 6);

insert into warehouse_item (warehouse_id, item_id, amount) values (2, 9, 5);
insert into warehouse_item (warehouse_id, item_id, amount) values (2, 10, 2);
insert into warehouse_item (warehouse_id, item_id, amount) values (2, 11, 3);
insert into warehouse_item (warehouse_id, item_id, amount) values (2, 12, 12);
insert into warehouse_item (warehouse_id, item_id, amount) values (2, 1, 5);
insert into warehouse_item (warehouse_id, item_id, amount) values (2, 2, 2);
insert into warehouse_item (warehouse_id, item_id, amount) values (2, 3, 3);
insert into warehouse_item (warehouse_id, item_id, amount) values (2, 4, 12);

insert into warehouse_item (warehouse_id, item_id, amount) values (3, 5, 7);
insert into warehouse_item (warehouse_id, item_id, amount) values (3, 6, 1);
insert into warehouse_item (warehouse_id, item_id, amount) values (3, 7, 4);
insert into warehouse_item (warehouse_id, item_id, amount) values (3, 8, 2);
insert into warehouse_item (warehouse_id, item_id, amount) values (3, 9, 7);
insert into warehouse_item (warehouse_id, item_id, amount) values (3, 10, 1);
insert into warehouse_item (warehouse_id, item_id, amount) values (3, 11, 4);
insert into warehouse_item (warehouse_id, item_id, amount) values (3, 12, 2);

insert into warehouse_item (warehouse_id, item_id, amount) values (4, 1, 4);
insert into warehouse_item (warehouse_id, item_id, amount) values (4, 2, 2);
insert into warehouse_item (warehouse_id, item_id, amount) values (4, 3, 1);
insert into warehouse_item (warehouse_id, item_id, amount) values (4, 4, 5);
insert into warehouse_item (warehouse_id, item_id, amount) values (4, 5, 4);
insert into warehouse_item (warehouse_id, item_id, amount) values (4, 6, 2);
insert into warehouse_item (warehouse_id, item_id, amount) values (4, 7, 1);
insert into warehouse_item (warehouse_id, item_id, amount) values (4, 8, 5);