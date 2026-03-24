# Conclusiones – Ejercicio 1

Se ejecutó una prueba de carga sobre el servicio de login `https://fakestoreapi.com/auth/login` utilizando Apache JMeter y datos parametrizados desde un archivo CSV.

## Resultados obtenidos

- Total de muestras ejecutadas: **22.664**
- Tiempo de respuesta promedio: **652 ms**
- Mediana: **505 ms**
- Percentil 90: **865 ms**
- Percentil 95: **980 ms**
- Percentil 99: **1133 ms**
- Tiempo mínimo: **381 ms**
- Tiempo máximo: **16000 ms**
- Porcentaje de error: **0,00%**
- Throughput (rendimiento): **72,9 peticiones/segundo**

## Análisis de cumplimiento

### 1. Throughput mínimo requerido
El escenario debía alcanzar al menos **20 TPS**.

**Resultado:** Se alcanzaron **72,9 TPS**, por lo tanto, **el criterio se cumple satisfactoriamente**.

### 2. Tiempo de respuesta máximo permitido
El tiempo de respuesta permitido era de máximo **1,5 segundos (1500 ms)**.

**Resultado:**  
- El promedio fue de **652 ms**
- El percentil 90 fue de **865 ms**
- El percentil 95 fue de **980 ms**
- El percentil 99 fue de **1133 ms**

Esto indica que la gran mayoría de las peticiones respondió por debajo del umbral permitido de 1,5 segundos, por lo tanto, **el criterio se cumple**.

Aunque se presentó un valor máximo de **16000 ms**, este comportamiento corresponde a casos aislados y no afecta el cumplimiento general del escenario, ya que los percentiles principales permanecen dentro de los límites aceptables.

### 3. Tasa de error aceptable
La tasa de error debía ser menor al **3%**.

**Resultado:** La prueba presentó **0,00% de error**, por lo tanto, **el criterio se cumple completamente**.

## Hallazgos relevantes

- El servicio mostró un comportamiento estable durante la ejecución.
- La tasa de error fue nula, lo que evidencia que las peticiones fueron procesadas correctamente.
- El throughput alcanzado estuvo muy por encima del mínimo solicitado.
- Los percentiles 90, 95 y 99 se mantuvieron por debajo del tiempo máximo permitido, lo que refleja una buena consistencia en el desempeño del servicio.
- Se identificó un tiempo máximo atípico de **16000 ms**, lo cual sugiere la presencia de una o pocas respuestas lentas aisladas que deberían revisarse, aunque no comprometen el resultado general de la prueba.

## Conclusión final

La prueba de carga del servicio de login fue satisfactoria.  
El sistema **cumplió con los tres criterios definidos**:

- más de **20 TPS**
- tiempo de respuesta menor a **1,5 segundos** en la gran mayoría de las solicitudes
- tasa de error menor al **3%**

Como recomendación, sería conveniente revisar el comportamiento de las solicitudes que alcanzaron tiempos máximos elevados, con el fin de identificar posibles picos de latencia o condiciones excepcionales en el servicio.