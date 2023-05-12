# EstructurasAvanzadas
Documentación - Explicación de codigo

# Problema 1 -  Complete Binary Tree Inserter
Para esto se crea una cola de TreeNodes, donde se almacenaran los nodos del árbol binario (Binary Tree), y también se crea una raíz (root) con la que trabajaremos el árbol. 

El método CBTInserter(TreeNode root), podría considerarse el constructor de la clase, y en esta se inicializa la estructura de datos con la "root" del árbol binario. La estrategia de solución es aplicando un "Deque"(ArrayDeque) que este me permite insertar y eliminar elementos al comienzo y al final de un arreglo de números(en este caso de una cola), donde agrego valores a la cola que son del árbol binario y lo realizo de manera iterativa.

En el método insert(int val), tiene como objetivo insertar un TreeNode, en el árbol binario, aplicando la estructura que nos ofrece leetcode de un TreeNode que tiene un constructor para asignar valores (node.val = val)Y el manejo que se realiza en la cola, agregando el nodo que necesita para completar el árbol, y haciendo validaciones para poder remover de la cola los valores que no tengan ni izquierdo ni derecho, para poder ubicarlo en el nodo contrario en el que esta para poder completar el arbol, y quede balanceado.

Por ultimo se encuentra el método get_root(), lo que hace eso solo retornar la raíz.

# Problema 2 -  Binary Tree Inorder Traversal

Simplemente tenemos que visitar los nodos izquierdos, pasar el nodo raíz y terminar de recorrer el nodo derecho.
Se hace de manera recursiva para mayor brevedad del código.
        
        this.inorderTraversal(root.left);
        list.add(root.val);
        this.inorderTraversal(root.right);
        return list;

# Problema 3 -  Validate Binary Search Tree

Se hace el recorrido InOrden, de tal manera que podemos hacer validaciones respecto a un BST, lo cual validamos si el número menor está a la izquierda de este o si es mayor está a la derecha del mismo.

# Problema 4 -  Minimum Height Trees

Para resolver el ejercicio 4, utilizamos grafos y aplicamos el algoritmo de recorrido por anchura (BFS). En este caso, consideramos que un árbol es un grafo no dirigido. Para manejar la lista de nodos, utilizamos un hashmap para evitar repeticiones de valores en el grafo, ya que no se pueden tener dos números iguales.
En un grafo, un "edge" representa las conexiones o enlaces de un nodo hacia otros nodos. Además, es importante comprender qué significa el "degree" en un grafo. Existen dos tipos de grados: el indegree y el outdegree. Para resolver el ejercicio, creamos un arreglo de degrees.

El indegree de un nodo es la cantidad de nodos que apuntan hacia él. Por ejemplo, si tenemos el nodo X que apunta a los nodos Y y Z, y el nodo Y apunta a Z, mientras que Z apunta a X y Y, el indegree de X es 1, ya que solo Z apunta hacia él. Por otro lado, el outdegree de un nodo se refiere a la cantidad de nodos a los que apunta. En el mismo ejemplo, el outdegree de X es 2, ya que apunta a Y y Z.

Sin embargo, en el ejercicio que estamos resolviendo, los grafos no son dirigidos, por lo que no se aplican los conceptos de indegree y outdegree. En su lugar, solo utilizamos el degree, ya que los grafos no tienen direcciones en las conexiones.
Con estos conceptos en mente, construimos una lista de "edges" y "degrees". Luego, realizamos comparaciones según lo que se plantea en el problema para agregarlos a una cola que creamos con el fin de verificar los siguientes casos:
En cada iteración, eliminamos los nodos hoja actuales. En este caso, los nodos de la izquierda tienen dos casos posibles:

    a) Solo hay un nodo en la raíz.
    b) Hay dos nodos conectados por un "edge", y ambos pueden ser la raíz.
    
# Problema 5 -  Find a Corresponding Node of a Binary Tree in a Clone of That Tree

Este programa busca encontrar una copia específica de un nodo en un árbol clonado. El método getTargetCopy toma tres parámetros: el árbol original, el árbol clonado y el nodo objetivo que se desea encontrar en la copia.

El método utiliza una función auxiliar llamada search para encontrar el camino desde la raíz del árbol original hasta el nodo objetivo. La función search utiliza recursión para buscar el nodo objetivo en el árbol original y devuelve una lista que representa el camino desde la raíz hasta el nodo objetivo.

El método getTargetCopy utiliza la lista de camino obtenida de la función search para recorrer el árbol clonado. Comienza desde la raíz del árbol clonado y sigue el camino inverso: si un valor en el camino es 1, se mueve al hijo derecho del nodo actual, y si es -1, se mueve al hijo izquierdo. Al final, se devuelve el nodo clonado correspondiente al nodo objetivo.

En el método Main, se crea un árbol original y se clona. Luego, se define el nodo objetivo como el hijo izquierdo de la raíz. Se llama al método getTargetCopy pasando el árbol original, el árbol clonado y el nodo objetivo, y se imprime el valor del nodo retornado.

# Problema 6 -  Find if Path Exists in Graph

Para resolver este ejercicio, utilizaremos un arreglo de booleanos para llevar un registro de si los valores se encuentran en el grafo o no.

Usaremos un HashSet para implementar el algoritmo de búsqueda en anchura (BFS) y recorrer el grafo a través de las conexiones entre nodos, también conocidas como "edges".

Realizaremos una validación especial para verificar si existe una conexión directa entre los nodos "Source" y "Destination". Si existe dicha conexión, retornaremos inmediatamente "true", ya que esto implica que hay un camino desde el nodo inicial hasta el final.

En el caso de no existir una conexión directa, utilizaremos una cola (queue) para realizar el recorrido del grafo. Este enfoque nos permitirá verificar si todos los nodos fueron visitados durante el recorrido. Si al finalizar el recorrido se comprueba que todos los nodos fueron visitados y no se encontró un camino desde el nodo inicial hasta el final, retornamos "false".

# Problema 7 -  Relative Ranks

Para este ejercicio se implementa el método findRelativeRanks, que toma un arreglo de números enteros y devuelve un arreglo de cadenas de texto. Cada elemento del arreglo resultante indica la posición relativa del número correspondiente en el arreglo original.

El método utiliza un mapa (TreeMap) para ordenar los números de forma descendente y mantener su posición original en el arreglo. Luego, itera sobre los valores del mapa y asigna a cada posición su posición relativa en forma de cadena de texto.

Después, se realiza un segundo recorrido del arreglo resultante y se reemplazan las cadenas de texto "1", "2" y "3" por "Gold Medal", "Silver Medal" y "Bronze Medal", respectivamente.

En el main, se verifica la existencia de argumentos de línea de comandos. Si se proporciona un archivo de texto y el número de pruebas, se lee el archivo y se generan los resultados correspondientes. En caso contrario, se solicita al usuario la cantidad de pruebas y se genera datos aleatorios para cada una

# Problema 8 -  Heap Operations

Para este ejercicio se implementa un sistema de cola de prioridad utilizando una PriorityQueue en Java. Lee una serie de operaciones y realiza las siguientes acciones:

    - Si el comando es "insert", se agrega un número a la cola.
    - Si el comando es "removeMin" y la cola está vacía, se agrega la operación "insert 0" a la respuesta.
    - Si el comando no es "insert" ni "removeMin", se comparan los números y se realizan las siguientes acciones:
    - Se eliminan los elementos de menor prioridad de la cola hasta que el elemento de mayor prioridad sea mayor o igual al número ingresado.
    - Si la cola está vacía o el elemento de mayor prioridad es mayor que el número ingresado, se agrega la operación "insert num" a la respuesta y se agrega el número a la cola.

Al final, se muestra el número de operaciones realizadas y se imprime el registro de operaciones en el orden en que se realizaron.
El programa utiliza una PriorityQueue para simular una cola de prioridad y realiza operaciones de inserción y eliminación de elementos según los comandos proporcionados.

# Problema 9 -  Count Distinct Integers

Para este ejercicio, se lee un número entero 'n' desde la entrada estándar. Luego se genera un conjunto 'l' utilizando la clase HashSet para almacenar elementos únicos. Se utiliza la clase Generar Datos para generar 'n' datos y se llena un arreglo 'números' con los datos leídos desde un archivo llamado "datos.txt".

A continuación, se itera sobre el arreglo 'números' y se agregan los elementos al conjunto 'l'. Finalmente, se imprime el tamaño del conjunto 'l', que representa la cantidad de elementos únicos en el arreglo.
El programa genera y lee datos desde un archivo, elimina duplicados y muestra la cantidad de elementos únicos obtenidos.

# Problema 10 -  Exact Sum

Se implementa un algoritmo que busca en una lista de precios de libros dos libros cuya suma sea igual a una cantidad de dinero dada. El programa lee una secuencia de entradas utilizando la clase Scanner, donde cada entrada representa un caso de prueba.

Para cada caso de prueba, se lee un número entero N que indica la cantidad de libros en la lista de precios. A continuación, se crea un arreglo 'a' de tamaño N para almacenar los precios de los libros. Se recorre el arreglo y se asigna a cada elemento el valor leído desde la entrada.

Después, se lee un número entero 'money' que representa la cantidad de dinero disponible para comprar los libros. Se inicializan las variables 'book1' y 'book2' con el valor -1, que indican que aún no se ha encontrado ningún par de libros cuya suma sea igual a 'money'.

Se realiza un bucle anidado para comparar todos los pares posibles de libros en la lista. Si la suma de dos libros es igual a 'money', se verifica si es el primer par encontrado o si la diferencia de precios entre los libros de este par es menor que la diferencia de precios entre los libros del par anteriormente encontrado. Si se cumple esta condición, se actualizan las variables 'book1' y 'book2' con los índices de los libros correspondientes.

Finalmente, se obtienen los precios de los libros utilizando los índices 'book1' y 'book2' y se imprimen en pantalla. Se utiliza la función printf() para formatear la salida con el mensaje "Peter should buy books whose prices are %d and %d.", donde %d se reemplaza por los precios mínimos y máximos de los libros.

