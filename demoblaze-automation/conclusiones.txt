CONCLUSIONES GENERALES

EJERCICIO 1 - UI AUTOMATION:

1. Se logró automatizar el flujo completo de compra validando la funcionalidad crítica del negocio.
2. Se identificó que la aplicación depende de eventos asíncronos (alerts), requiriendo el uso de esperas explícitas.
3. El patrón Screenplay permitió estructurar el código de manera modular, escalable y mantenible.
4. Serenity BDD facilita la generación de reportes detallados con evidencia de ejecución.
5. Se evidenció la importancia del manejo de sincronización en pruebas UI para evitar fallos intermitentes.

EJERCICIO 2 - API TESTING:

1. Se validaron correctamente los servicios de signup y login mediante pruebas automatizadas.
2. Se implementaron escenarios positivos y negativos para asegurar la robustez del sistema.
3. Se identificó que el servicio de login retorna un token en caso de autenticación exitosa.
4. Se evidenció la importancia de manejar datos dinámicos para evitar conflictos en pruebas repetitivas.

CONCLUSIONES GENERALES:

* La automatización permite validar de manera eficiente los flujos críticos del sistema.
* Es fundamental combinar pruebas UI y API para lograr una cobertura completa.
* El uso de herramientas como Serenity y Karate mejora la trazabilidad y mantenibilidad de las pruebas.
* Se recomienda integrar estas pruebas en pipelines CI/CD para ejecución continua.

CONCLUSIÓN FINAL:
Se logró cubrir los principales escenarios funcionales del sistema, garantizando la calidad del flujo de compra y autenticación desde diferentes niveles (UI y API).
