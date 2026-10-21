# LabPoo2
CAMILA HERNANDEZ
ComparadorMenu
Creé esta clase para manejar de forma independiente la regla de ordenar los productos
del menú de la empresa. La programé con la intención de que el sistema ordene los platos primero 
por precio de forma descendente (del más caro al más económico) y, si hay empate en el precio, los 
desempaté organizándolos alfabéticamente por su nombre. Además, la diseñé con validaciones defensivas
para cumplir con la condición de evitar errores si llega algún dato nulo.

ComparadorRepartidores
La hice para establecer la regla de jerarquía de los repartidores fuera de las clases 
principales del modelo. La creé con el objetivo de priorizar automáticamente a los mejores domiciliarios 
organizándolos primero por su calificación de mayor a menor y, si comparten el mismo puntaje, aplicando 
un segundo criterio basado en la cantidad de entregas realizadas para saber quién va primero en la lista.

OrdenadorServicio
Esta clase la implementé como el componente intermediario encargado de ejecutar el ordenamiento sobre 
las listas reales del sistema. La creé para separar la lógica de las reglas de comparación de la manipulación
de las colecciones, utilizando Streams de Java para limpiar elementos nulos internos, aplicar los 
comparadores anteriores de manera limpia y retornar las colecciones ordenadas o listas vacías en caso de 
recibir datos nulos.

ReporteServicio
La desarrollé para resolver todas las consultas analíticas y reportes exigidos por el negocio utilizando
operaciones funcionales con Streams. La implementé con la intención de calcular de forma eficiente el top 
3 de los platos más vendidos de la semana, sumar la facturación total obtenida por cada sede y buscar el 
pedido más caro de un cliente específico mediante su documento, utilizando Optiona para garantizar un 
manejo seguro y evitar cualquier NullPointerException.