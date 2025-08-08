-- Script para actualizar el negocio ID 63 con valores por defecto
-- Ejecutar este script para que tu negocio aparezca en el frontend

UPDATE NEGOCIO 
SET 
    DESCRIPCION = 'Descripción pendiente de actualizar',
    ID_CATEGORIA = 1,  -- Asignar a categoría "Belleza" por defecto
    URL_IMAGEN = 'https://images.unsplash.com/photo-1557804506-669a67965ba0?w=300',
    DURACION_CITA = 60,
    HORA_INICIO = '09:00',
    HORA_FIN = '18:00'
WHERE ID_NEGOCIO = 63;

-- Verificar que el update funcionó
SELECT 
    ID_NEGOCIO,
    NOMBRE,
    DESCRIPCION,
    DIRECCION,
    ID_CATEGORIA,
    URL_IMAGEN,
    DURACION_CITA,
    HORA_INICIO,
    HORA_FIN
FROM NEGOCIO 
WHERE ID_NEGOCIO = 63;

COMMIT;
