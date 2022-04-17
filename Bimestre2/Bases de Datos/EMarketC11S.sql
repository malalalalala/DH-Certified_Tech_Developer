use EMarket;

-- Categorías y productos
-- 1.Queremos tener un listado de todas las categorías.
SELECT * FROM categorias;
-- 2.Cómo las categorías no tienen imágenes, solamenteinteresa obtener unlistado deCategoriaNombreyDescripcion.
SELECT categorianombre, descripcion
FROM categorias;
-- 3.Obtener un listado de los productos.
SELECT * 
FROM productos;
-- 4.¿Existen productos discontinuados? (Discontinuado= 1).
SELECT * 
FROM productos
WHERE discontinuado=1;
-- 5.Para el viernes hay que reunirse con el Proveedor8. ¿Qué productos sonlos que nos provee?
SELECT * 
FROM productos
WHERE proveedorid=8;
-- 6.Queremos conocer todos los productos cuyo precio unitario se encuentre entre 10 y 22.
SELECT * 
FROM productos
WHERE preciounitario BETWEEN 10 AND 22;
-- 7.Se define que un producto hay que solicitarloal proveedor si sus unidadesen stock son menores al Nivel de Reorden. ¿Hay productospor solicitar?
SELECT * 
FROM productos
WHERE unidadesstock < nivelreorden;
-- 8.Se quiere conocer todos los productos dellistado anterior, pero queunidades pedidas sea igual a cero.
SELECT * 
FROM productos
WHERE unidadesstock < nivelreorden
AND unidadespedidas=0;

-- Clientes
-- 1.Obtener un listado de todos los clientes con Contacto,Compania, Título,País. Ordenar el listado por País.
SELECT Contacto, Compania,Titulo,Pais
FROM Clientes
ORDER BY pais;
-- 2.Queremos conocer a todos los clientes que tengan un título “Owner”.
SELECT *
FROM Clientes
WHERE titulo='owner';
-- 3.El operador telefónico que atendió a un cliente norecuerda su nombre.Solo sabe que comienza con “C”.
-- ¿Lo ayudamos a obtenerun listado contodos los contactos que inician con la letra “C”?
SELECT *
FROM Clientes
WHERE contacto like 'c%';

-- Facturas
-- 1.Obtener un listado de todas las facturas, ordenadopor fecha de facturaascendente.
SELECT *
FROM Facturas
ORDER BY fechafactura;
-- 2.Ahora se requiere un listado de las facturas con elpaís de envío “USA” yque su correo (EnvioVia) sea distinto de 3.
SELECT *
FROM Facturas
WHERE paisenvio='usa' AND enviovia<>3;
-- 3.¿El cliente 'GOURL' realizó algún pedido?
SELECT *
FROM Facturas
WHERE clienteid='GOURL';
-- 4.Se quiere visualizar todas las facturas de los empleados2, 3, 5, 8 y 9
SELECT *
FROM Facturas
WHERE empleadoid in (2, 3, 5, 8, 9);

-- Consultas queries ML - Parte II
-- En esta segunda parte vamos a intensificar la prácticade consultas SELECT, añadiendo ALIAS, LIMIT y OFFSET.
-- Productos
-- 1.Obtener el listado de todos los productos ordenadosdescendentemente por precio unitario.
SELECT * 
FROM productos
ORDER BY preciounitario DESC;

-- 2.Obtener el listado de top 5 de productos cuyo preciounitario esel más caro.
SELECT * 
FROM productos
ORDER BY preciounitario DESC
LIMIT 5;
-- 3.Obtener un top 10 de los productos con más unidadesen stock.
SELECT * 
FROM productos
ORDER BY unidadesstock DESC
LIMIT 10;

-- FacturaDetalle
-- 1.Obtener un listado de FacturaID, Producto, Cantidad.
SELECT FacturaID, ProductoID, Cantidad
FROM FacturaDetalle;
-- 2.Ordenar el listado anterior por cantidad descendentemente.
SELECT FacturaID, ProductoID, Cantidad
FROM FacturaDetalle
ORDER BY Cantidad DESC ;

-- 3.Filtrar el listado solo para aquellos productos dondela cantidadse encuentre entre 50 y 100.
SELECT FacturaID, ProductoID, Cantidad
FROM FacturaDetalle
WHERE Cantidad BETWEEN 50 AND 100
ORDER BY Cantidad DESC ;

-- 4.En otro listado nuevo, obtener un listado con lossiguientesnombres de columnas: NroFactura (FacturaID), Producto(ProductoID), Total (PrecioUnitario*Cantidad)
SELECT FacturaID AS NroFactura, ProductoID AS Producto , PrecioUnitario*Cantidad AS Total
FROM FacturaDetalle ;

-- ¡Extras!¿Te sobró tiempo? ¿Querés seguir practicando?Te dejamos unos ejercicios extras a partir de la mismabase:
-- 1.Obtener un listado de todos los clientes que vivenen “Brazil" o “Mexico”,o que tengan un título que empiece con “Sales”.
SELECT *
FROM Clientes
WHERE pais="Brazil" OR pais= "Mexico" OR titulo like "sales%";
-- 2.Obtener un listado de todos los clientes que pertenecena una compañíaque empiece con la letra "A".
SELECT *
FROM clientes
WHERE Compania like "A%";
-- 3.Obtener un listado con los datos: Ciudad, Contactoy renombrarlocomo Apellido y Nombre, Titulo y renombrarlo comoPuesto, de todoslos clientes que sean de la ciudad "Madrid".
SELECT Ciudad, Contacto as "Nombre y Apellido", Titulo as "Puesto"
FROM clientes
WHERE Ciudad = "Madrid";
-- 4.Obtener un listado de todas las facturas con ID entre10000 y 10500
SELECT *
FROM facturas
WHERE FacturaID between 10000 and 10500;
-- 5.Obtener un listado de todas las facturas con ID entre10000 y 10500 o delos clientes con ID que empiecen con la letra “B”.
SELECT *
FROM facturas
WHERE FacturaID between 10000 and 10500
OR ClienteID like "B%";
-- 6.¿Existen facturas que la ciudad de envío sea “Vancouver”o queutilicen el correo 3?
SELECT *
FROM facturas
WHERE CiudadEnvio = 'Vancouver'
OR EnvioVia=3;

-- 7.¿Cuál es el ID de empleado de “Buchanan”?
SELECT EmpleadoID
FROM empleados
WHERE Apellido = 'Buchanan';

-- 8.¿Existen facturas con EmpleadoID del empleado delejercicio anterior?(No relacionar, sino verificar que existan facturas)
SELECT *
FROM facturas
WHERE EmpleadoID =5;