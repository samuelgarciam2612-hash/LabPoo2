# LabPoo2

Nicolas: Mi parte se compone de 5 archivos/clases q son todos lo relacionado con los repositorios y ultimo una clase utilitaria
un repositorio es una clase que se encarga de guardar y buscar un tipo de datos, basicamente el almacen

Lo que hace es guardar objetos, buscarlos por [src](src)su identificador y con metodos podemos guardar, buscar, eliminar y cosas asi
y en vez de repetir la misma logica 4 veces los genericos heredan de la primera clase llamada repositorio

ya por ultimo hay una clase de utilidades al final q es muy importante porque en vez de las otras q guardan datos esta no guarda nada
lo unico q hace es procesar esas listas q el codigo continuamente le esta pasando

Por esa misma razon sus metodos son static y es constructor privado no hay necesidad de crearla de otra forma

brevemente pondre q hace guarda cada clase:

- Repositorio: es la clase base y generica, tiene el HashMap y los metodos de guardar, buscar, eliminar y listar. las otras heredan de esta
- Repositorioclientes: guarda los clientes y no deja repetidos porque usa un HashSet que compara por documento
- Repositorioproductos: guarda el menu (platos, bebidas y combos) y tiene un metodo con wildcard para agregar varios a la vez
- RepositorioPedidos: guarda los pedidos y casi todo lo hereda del repositorio general
- UtilProductos: no guarda nada, solo tiene metodos con wildcards para sumar precios, buscar el mas caro, imprimir y copiar listas de productos

para que quede mas claro el uso de wildcards estos se usan solo en donde un metodo recibe una coleccion de tipos con subtipos o supertipos ahi usando extends/super con limite superior/inferior


Samuel Garcia: clase abstracta producto, comparte atributos comunes con sus hijas, asi no tengo que volver a escribir el equasl y el hashcode.
combo tiene por dentro una lista de productos (List<Producto>). Le sobrescribí el método getPrecio() para que sume el precio de todos los productos que contiene y le aplique su descuento de forma automática
combo tiene el getItems() en luagr de pasar la original devuleve una copia
aplique herencia y polimorfismo en la clase abstracta, 
el calculo de los productos funcionan con todos sin tener que crear metodos repetidos
use colecciones para guardar los items
tenemos un control de duplicados en Cliente y en el Repartirdor solo con el id

En el main se hace una prueba de todo, de los clienetes que no tengan duplicados.
se creo instancias de `Plato` y `Bebida`, las agrupé dentro de un `Combo` con 15% de descuento, y luego agregué
tanto platos individuales como el combo a un `Pedido`. El pedido procesó todos los elementos como `Producto` sin problemas de compatibilidad 


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
3 de los platos más vendidos de la semana, buscar el 
pedido más caro de un cliente específico mediante su documento, utilizando Optional para garantizar un 
manejo seguro y evitar cualquier NullPointerException. Para probar que el encapsulamiento de `Combo` está protegido, 
investigué y utilicé el método nativo `.clear()` de Java sobre la lista que retorna `getItems()`. 
Al verificar el tamaño con `size()`, los productos que tiene el combo seguían completos, demostrando que `getItems()` 
devuelve una copia y que la lista original, que no peude ser manipualda desde afuera.

