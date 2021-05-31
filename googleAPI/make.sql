create table logs (id integer not null auto_increment, tnote datetime, name_id integer, primary key (id));
create table marker (id integer not null auto_increment, lat double precision, lng double precision, primary key (id));
create table name (id integer not null auto_increment, name varchar(255), marker_id integer, primary key (id));
alter table logs add constraint FKao9c67k0nbvkvjtvyv5o22v3x foreign key (name_id) references name (id);
alter table name add constraint FK8pjm06ow9bg4e4hgp9sxbd2tr foreign key (marker_id) references marker (id);
create table logs (id integer not null auto_increment, tnote datetime, name_id integer, primary key (id)) type=MyISAM
create table marker (id integer not null auto_increment, lat double precision, lng double precision, primary key (id)) type=MyISAM
create table name (id integer not null auto_increment, name varchar(255), marker_id integer, primary key (id)) type=MyISAM
alter table logs add constraint FKao9c67k0nbvkvjtvyv5o22v3x foreign key (name_id) references name (id)
alter table name add constraint FK8pjm06ow9bg4e4hgp9sxbd2tr foreign key (marker_id) references marker (id);
create table adress (id integer not null auto_increment, country varchar(255), region varchar(255), street varchar(255), marker_id integer, primary key (id));
create table logs (id integer not null auto_increment, tnote datetime, name_id integer, primary key (id));
create table marker (id integer not null auto_increment, lat double precision, lng double precision, primary key (id));
alter table adress add constraint FKlr7y48gppsanhrf58agehk1v1 foreign key (marker_id) references marker (id);
alter table logs add constraint FKo5d0jlwysmbj9qstmitonmh1u foreign key (name_id) references adress (id);
