create schema if not exists catering collate utf8_general_ci;

create table if not exists comment
(
	id_ bigint auto_increment
		primary key,
	user_id_ bigint null,
	dish_id_ bigint null,
	order_id_ bigint null,
	content_ text null
);

create table if not exists dish
(
	id_ bigint auto_increment
		primary key,
	name_ varchar(255) null,
	description_ text null,
	type_ varchar(50) null,
	money_ decimal(15,2) null,
	img_url_ varchar(255) null
);

create table if not exists `order`
(
	id_ bigint auto_increment
		primary key,
	payment_ varchar(50) null,
	address_ varchar(255) null,
	amount_ decimal(15,2) null,
	status_ varchar(20) null,
	remake_ text null
);

create table if not exists order_dish
(
	id_ bigint auto_increment
		primary key,
	order_id_ bigint null,
	dish_id_ bigint null
);

create table if not exists sys_user
(
	id_ bigint auto_increment
		primary key,
	user_name_ varchar(255) null,
	password_ varchar(255) null,
	phone_ varchar(255) null,
	enabled_ bit null
);

create table if not exists sys_user_role
(
	id_ bigint auto_increment
		primary key,
	sys_user_id_ bigint null,
	role_ varchar(50) null
);

