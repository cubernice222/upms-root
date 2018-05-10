CREATE USER upms WITH PASSWORD 'upms'; --创建用户
CREATE DATABASE upms OWNER upms; --创建数据库并指明owner
create schema upms authorization upms; --创建schema 并指明授权
SET search_path TO upms; -- 设置默认schema
ALTER database upms SET search_path TO upms; --设置数据库默认的schema

CREATE TABLE t_rc_role(
  role_id SERIAL4 PRIMARY KEY NOT NULL , -- SERIAL4不但会生成主键,而且不需要insert into 带列
  name VARCHAR(255) NOT NULL,
  role_scope VARCHAR(64),
  role VARCHAR(255) NOT NULL,
  tips VARCHAR(1024) ,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
comment on column t_rc_role.role_id is '主键';
comment on column t_rc_role.name is '角色中文';
comment on column t_rc_role.role_scope is '角色系统';
comment on column t_rc_role.role is '角色实际CODE';
comment on column t_rc_role.tips is '角色描述';
comment on column t_rc_role.status is '是否有效,0/1 无效/有效';
create unique index idx_unq_rc_role_role on t_rc_role using btree (role);
create unique index idx_unq_rc_role_name on t_rc_role using btree (name);



CREATE TABLE t_rc_dept(
  dept_id SERIAL4 PRIMARY KEY NOT NULL , -- SERIAL4不但会生成主键,而且不需要insert into 带列
  simple_name VARCHAR(255) NOT NULL ,
  full_name VARCHAR(1024) ,
  tips VARCHAR(1024),
  p_dept_id INTEGER,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
comment on column t_rc_dept.simple_name is '部门简称';
comment on column t_rc_dept.full_name is '部门全称';
comment on column t_rc_dept.p_dept_id is '父部门ID';


CREATE TABLE t_rc_menu(
  menu_id SERIAL4 PRIMARY KEY NOT NULL , -- SERIAL4不但会生成主键,而且不需要insert into 带列
  code VARCHAR(255) NOT NULL ,
  p_code varchar(255),
  name VARCHAR(255),
  url VARCHAR(1024),
  menu_type VARCHAR(2),
  menu_scope VARCHAR(64),
  level INTEGER,
  sort INTEGER,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
comment on column t_rc_menu.code is '菜单code';
comment on column t_rc_menu.p_code is '父菜单code';
comment on column t_rc_menu.name is '菜单名';
comment on column t_rc_menu.url is '菜单地址';
comment on column t_rc_menu.menu_type is '菜单类型 1.菜单,2.按钮';
comment on column t_rc_menu.menu_scope is '菜单属性';
comment on column t_rc_menu.level is '菜单等级';
comment on column t_rc_menu.sort is '菜单排序';

create unique index idx_unq_rc_menu_code on t_rc_menu using btree (code);

CREATE TABLE t_rc_role_menu(
  role_menu_id SERIAL4 PRIMARY KEY NOT NULL ,
  role_id INTEGER,
  menu_id INTEGER,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);

CREATE TABLE upms.t_rc_user(
  user_id SERIAL4 PRIMARY KEY NOT NULL , -- SERIAL4不但会生成主键,而且不需要insert into 带列
  avatar VARCHAR(1024),
  user_name VARCHAR(255),
  password VARCHAR(2048),
  salt VARCHAR(1024),
  full_name VARCHAR(256),
  birthday TIMESTAMP WITHOUT TIME ZONE,
  user_scope VARCHAR(64),
  sex VARCHAR(64),
  email VARCHAR(255),
  phone VARCHAR(255),
  ding_user_id VARCHAR(255),
  wechat_user_id VARCHAR(255),
  corp_number varchar(64),
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
create unique index idx_unq_rc_user_userName on t_rc_user using btree (user_name);
comment on column t_rc_user.avatar is '头像url';
comment on column t_rc_user.user_name is '登录名称';
comment on column t_rc_user.password is '登录密码';
comment on column t_rc_user.salt is '加密 salt';
comment on column t_rc_user.full_name is '名称';
comment on column t_rc_user.birthday is '生日';
comment on column t_rc_user.user_scope is '用户系统';
comment on column t_rc_user.sex is '性别';
comment on column t_rc_user.email is '邮箱';
comment on column t_rc_user.phone is '电话';
comment on column t_rc_user.ding_user_id is '钉钉用户ID';
comment on column t_rc_user.wechat_user_id is '微信用户ID';
comment on column t_rc_user.corp_number is '员工号';
comment on column t_rc_user.status is '0 未激活 1 正常 2.离职  3.退休';

CREATE TABLE t_rc_user_dept(
  user_dept_id SERIAL4 PRIMARY KEY NOT NULL ,
  user_id INTEGER,
  dept_id INTEGER,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);

CREATE TABLE t_rc_user_role(
  user_role_id SERIAL4 PRIMARY KEY NOT NULL ,
  user_id INTEGER,
  role_id INTEGER,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);