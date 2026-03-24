# Prueba de Carga – Login Fakestore API con JMeter

## Descripción

Este proyecto contiene la solución del **Ejercicio 1** de la prueba técnica, consistente en realizar una prueba de carga al servicio de login de la API:

`https://fakestoreapi.com/auth/login`

La implementación fue desarrollada con **Apache JMeter**, utilizando datos parametrizados desde un archivo `.csv`, y validando el cumplimiento de los criterios solicitados.

---

## Objetivo de la prueba

Evaluar el comportamiento del servicio de autenticación bajo carga, verificando que cumpla con los siguientes criterios:

- Alcanzar al menos **20 TPS**
- Mantener un tiempo de respuesta máximo permitido de **1,5 segundos**
- Presentar una tasa de error inferior al **3%**

---

## Tecnologías utilizadas

- **Apache JMeter**: 5.6.x
- **Java**: 17 o superior
- **Sistema operativo**: Windows
- **Formato de datos de entrada**: CSV

---

## Estructura del proyecto

```bash
.
├── data/
│   └── username,password.csv
├── jmeter/
│   └── login_test.jmx
├── results/
│   ├── summary.csv
│   └── aggregate.csv
├── README.md
└── conclusiones.md