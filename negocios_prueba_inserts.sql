-- Inserts de prueba para negocios
-- Asegúrate de que tengas categorías y usuarios creados antes de ejecutar estos inserts

-- Negocios de ejemplo con diferentes categorías
INSERT INTO NEGOCIO (ID_NEGOCIO, NOMBRE, DESCRIPCION, DIRECCION, ID_CATEGORIA, ID_USUARIO, URL_IMAGEN, FECHCREA, DURACION_CITA, HORA_INICIO, HORA_FIN) VALUES 
(1, 'Salón Belleza Total', 'Salón de belleza especializado en cortes, peinados y tratamientos capilares', 'Av. Principal 123, Centro', 1, 1, 'https://images.unsplash.com/photo-1560066984-138dadb4c035?w=300', SYSTIMESTAMP, 60, '08:00', '18:00');

INSERT INTO NEGOCIO (ID_NEGOCIO, NOMBRE, DESCRIPCION, DIRECCION, ID_CATEGORIA, ID_USUARIO, URL_IMAGEN, FECHCREA, DURACION_CITA, HORA_INICIO, HORA_FIN) VALUES 
(2, 'Clínica Dental Sonrisa', 'Clínica dental con servicios de odontología general y estética', 'Calle Salud 456, Zona Norte', 2, 2, 'https://images.unsplash.com/photo-1629909613654-28e377c37b09?w=300', SYSTIMESTAMP, 45, '07:00', '17:00');

INSERT INTO NEGOCIO (ID_NEGOCIO, NOMBRE, DESCRIPCION, DIRECCION, ID_CATEGORIA, ID_USUARIO, URL_IMAGEN, FECHCREA, DURACION_CITA, HORA_INICIO, HORA_FIN) VALUES 
(3, 'Barbería El Clásico', 'Barbería tradicional con servicios de corte masculino y arreglo de barba', 'Plaza Central 789, Casco Histórico', 1, 3, 'https://images.unsplash.com/photo-1503951914875-452162b0f3f1?w=300', SYSTIMESTAMP, 30, '09:00', '19:00');

INSERT INTO NEGOCIO (ID_NEGOCIO, NOMBRE, DESCRIPCION, DIRECCION, ID_CATEGORIA, ID_USUARIO, URL_IMAGEN, FECHCREA, DURACION_CITA, HORA_INICIO, HORA_FIN) VALUES 
(4, 'Spa Relajación Total', 'Centro de relajación con masajes terapéuticos y tratamientos spa', 'Av. Bienestar 321, Zona Residencial', 3, 4, 'https://images.unsplash.com/photo-1544161515-4ab6ce6db874?w=300', SYSTIMESTAMP, 90, '10:00', '20:00');

INSERT INTO NEGOCIO (ID_NEGOCIO, NOMBRE, DESCRIPCION, DIRECCION, ID_CATEGORIA, ID_USUARIO, URL_IMAGEN, FECHCREA, DURACION_CITA, HORA_INICIO, HORA_FIN) VALUES 
(5, 'Consultorio Médico Integral', 'Consultorio de medicina general con especialidades varias', 'Calle Medicina 654, Centro Médico', 2, 5, 'https://images.unsplash.com/photo-1551601651-2a8555f1a136?w=300', SYSTIMESTAMP, 30, '06:00', '16:00');

INSERT INTO NEGOCIO (ID_NEGOCIO, NOMBRE, DESCRIPCION, DIRECCION, ID_CATEGORIA, ID_USUARIO, URL_IMAGEN, FECHCREA, DURACION_CITA, HORA_INICIO, HORA_FIN) VALUES 
(6, 'Estética Venus', 'Centro de estética especializado en tratamientos faciales y corporales', 'Blvd. Belleza 987, Zona Comercial', 3, 6, 'https://images.unsplash.com/photo-1570172619644-dfd03ed5d881?w=300', SYSTIMESTAMP, 75, '08:30', '18:30');

INSERT INTO NEGOCIO (ID_NEGOCIO, NOMBRE, DESCRIPCION, DIRECCION, ID_CATEGORIA, ID_USUARIO, URL_IMAGEN, FECHCREA, DURACION_CITA, HORA_INICIO, HORA_FIN) VALUES 
(7, 'Peluquería Moderna', 'Peluquería unisex con las últimas tendencias en cortes y coloración', 'Calle Moda 147, Centro Comercial', 1, 7, 'https://images.unsplash.com/photo-1562004760-acb5685e8fb5?w=300', SYSTIMESTAMP, 50, '09:00', '17:30');

INSERT INTO NEGOCIO (ID_NEGOCIO, NOMBRE, DESCRIPCION, DIRECCION, ID_CATEGORIA, ID_USUARIO, URL_IMAGEN, FECHCREA, DURACION_CITA, HORA_INICIO, HORA_FIN) VALUES 
(8, 'Centro Fisioterapia Activa', 'Centro especializado en fisioterapia y rehabilitación deportiva', 'Av. Deportes 258, Polideportivo', 2, 8, 'https://images.unsplash.com/photo-1559757148-5c350d0d3c56?w=300', SYSTIMESTAMP, 60, '07:30', '19:30');

-- Inserts para algunas calificaciones de ejemplo
INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(1, 1, 1, 5, 'Excelente servicio, muy profesionales', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(2, 2, 1, 4, 'Muy buen lugar, recomendado', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(3, 3, 2, 5, 'El mejor dentista de la ciudad', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(4, 4, 3, 4, 'Barbería clásica, buen ambiente', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(5, 5, 4, 5, 'Muy relajante, volveré pronto', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(6, 6, 4, 4, 'Buen servicio de spa', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(7, 1, 5, 3, 'Servicio regular, puede mejorar', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(8, 2, 6, 5, 'Tratamientos de primera calidad', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(9, 3, 7, 4, 'Muy modernos, me gustó el resultado', SYSTIMESTAMP);

INSERT INTO CALIFICACION (ID_CALIFICACION, CLIENTE_ID, NEGOCIO_ID, PUNTAJE, COMENTARIO, FECHA) VALUES 
(10, 4, 8, 5, 'Excelente fisioterapeuta', SYSTIMESTAMP);

-- Commit para guardar los cambios
COMMIT;
