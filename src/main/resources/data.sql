-- Truncar las tablas y luego

--truncate table usuarios;
--truncate table producto;
--truncate table pedido;
--truncate table restaurante;
--truncate table roles_persona;
--truncate table roles;

--INSERT INTO usuarios(nombre, telefono, direccion, email)
--VALUES
    --('Diana Guerra' , '3007307823' , 'Cra 150c #75a - 85', 'diana.guerra@gmail.com'),
    --('Ana Velasquez' , '3007307824' , 'Cra 150c #75a - 86', 'ana.velasquez@gmail.com'),
    --('Jose Puerta' , '3007307825' , 'Cra 150c #75a - 87', 'jose.puerta@gmail.com');
    --('Diego Rico' , '3007307822' , 'Cra 150c #75a - 84', 'Diegho.Riko@gmail.com');


--INSERT INTO roles (nombre_Rol, descripcion_Rol)
--VALUES ('administrador' , 'usuario con permisos totales'),
--       ('cliente' , 'Usuario con pemrisos de vista y compra unicamente');


--INSERT INTO restaurante (nombre, categoria, direccion)
--VALUES
    --('Fogon y Leña' , 'Pizzas' , 'Av el Rio 1350'),
    --'Pizza y pasta' , 'Pizzas' , 'Av el condor 503'),
    --('Armonía y sabor' , 'Comida Gourmet' , 'Pasaje Humbolt alt caceres'),
    --('Burguer House' , 'Comidas Rapidas' , 'Cuadra valle 132');


--INSERT INTO producto (nombre, descripcion, precio, restaurante_id)
--VALUES
    --('Hambuguesa Artesanal', 'Fabulosa y exquisita carne de res a la parrilla', 17.500, 4),
    --('Caños en Salsa de Champiñoes', 'Jugoso y exqusito', 27.800, 3),
    --('Pizza Estofada 6 carnes', 'Unica en su tipo, 12 personas', 57.500, 2),
    --('Pizza Queso y peperoni', '4 quesos mucho sabor', 32.500, 1);


--INSERT INTO pedido (telefono_cliente, direccion_cliente, precio, producto_id, restaurante_id, cliente_id)
--VALUES
    --( '3007307824' , 'Cra 150c #75a - 86' , 32.500 ,  4 , 1, 2),
    --( '3007307825' , 'Cra 150c #75a - 87' , 57.500 ,  3 , 2, 3),
    --( '3007307823' , 'Cra 150c #75a - 85' , 27.800 ,  2 , 3, 1),
    --( '3007307822' , 'Cra 150c #75a - 84' , 17.500 ,  1 , 4, 4);







