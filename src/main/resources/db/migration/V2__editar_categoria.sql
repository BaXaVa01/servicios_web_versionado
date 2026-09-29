alter table categoria
rename column nombre to nombre_categoria;


alter table categoria
alter column nombre_categoria type varchar(150);