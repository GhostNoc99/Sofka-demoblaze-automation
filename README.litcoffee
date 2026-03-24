PROYECTO: Automatización Demoblaze - Pruebas Técnicas

DESCRIPCIÓN GENERAL:
Este repositorio contiene la solución a dos ejercicios de automatización de pruebas sobre la plataforma https://www.demoblaze.com.

---

## EJERCICIO 1 - AUTOMATIZACIÓN UI (SERENITY BDD)

DESCRIPCIÓN:
Se implementa una prueba End-to-End (E2E) del flujo de compra utilizando Serenity BDD y el patrón Screenplay.

FLUJO AUTOMATIZADO:

1. Abrir la página principal
2. Seleccionar dos productos
3. Agregar productos al carrito
4. Visualizar el carrito
5. Completar el formulario de compra
6. Finalizar la compra
7. Validar mensaje de confirmación

TECNOLOGÍAS:

* Java 11
* Maven
* Serenity BDD
* Screenplay Pattern
* Selenium WebDriver

EJECUCIÓN:
cd ejercicio1-serenity
mvn clean verify
mvn serenity:aggregate

REPORTE:
target/site/serenity/index.html

---

## EJERCICIO 2 - PRUEBAS API (KARATE)

DESCRIPCIÓN:
Se automatizan pruebas de servicios REST para las funcionalidades de signup y login.

SERVICIOS:

* POST /signup
* POST /login

CASOS IMPLEMENTADOS:

1. Crear usuario nuevo
2. Intentar crear usuario existente
3. Login exitoso
4. Login fallido

TECNOLOGÍAS:

* Karate DSL
* Java
* Maven

EJECUCIÓN:
cd ejercicio2-karate
mvn test

SALIDAS:

* Respuestas de servicios
* Validaciones de estado y contenido

---

## NOTAS GENERALES:

* Se utilizó generación de usuarios dinámicos para evitar conflictos en pruebas.
* Se implementaron buenas prácticas de automatización y manejo de sincronización.
* Los reportes permiten evidenciar la ejecución completa de los escenarios.
