# poolobject
           
[![Java CI build](https://github.com/AlvaroVillarVal/poolobject/actions/workflows/ci_jdk11_build.yml/badge.svg)](https://github.com/AlvaroVillarVal/poolobject/actions/workflows/ci_jdk11_build.yml) [![Java CI build, test and codecov](https://github.com/AlvaroVillarVal/poolobject/actions/workflows/ci_jdk1.8_build_test.yml/badge.svg)](https://github.com/AlvaroVillarVal/poolobject/actions/workflows/ci_jdk1.8_build_test.yml)[![codecov](https://codecov.io/gh/AlvaroVillarVal/poolobject/graph/badge.svg?token=UGZHVU5JU9)](https://codecov.io/gh/AlvaroVillarVal/poolobject) 

## Objetivos
• Comprender los objetivos de medición relacionados con la caracterización y la evaluación de
productos, procesos y recursos software
• Comprender, aplicar y analizar técnicas de medición sobre entidades de productos software
relacionados con conjuntos de pruebas de software
• Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos de
prueba del software

## Enunciado
En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.
El objetivo es establecer un caso de estudio dummy que sirva para caracterizar y evaluar tanto el producto
desarrollado como el proceso seguido.
### (a) Descripción del producto
Dado un código de ejemplo del patrón diseño creacional Pool Object, se debe crear una batería de pruebas tal
que las coberturas de sus clases sean del 100%. El código de las clases se puede obtener en el repositorio
https://github.com/clopezno/poolobject. La batería de pruebas JUnit debe estar contenida en la clase
ubu.gii.dass.test.c01.ReuseblePoolTest.java.
### (b) Descripción del proceso
El proceso de desarrollo de la batería de pruebas se va a gestionar utilizando el control de versiones del
sistema git proporcionado por Github (https://github.com ).

Los pasos para gestionar el procesos son los siguientes:
  1. Cada miembro del equipo tiene que estar registrado en GitHub, Travis CI (opcionalmente se puede
    sustituir por Github actions) y Codecov.io.
  2. Uno de los miembros tiene que realizar un fork del repositorio donde se encuentra el código que se
    quiere probar https://github.com/clopezno/poolobject. El nuevo fork del repositorio tiene que ser
    público.
  3. Invitar al resto de miembros del equipo para que puedan participar en el proceso de desarrollo del
    conjunto de pruebas.
  4. Vincular el proyecto con Travis CI o Github actions, y Codecov.io. Actualizar los badgets (codecov y
    CI) de vuestro fichero README.md en el repositorio.
  5. Cada nuevo test realizado ejecutar un commit/push al repositorio del grupo. El texto del commit tiene
    que describir el caso de prueba añadido.
  6. Verificar el resultado de las pruebas en el workflow de integración continua y cómo la calidad del
    producto va mejorando con las sucesivas integraciones

## Preguntas
◦ ¿Se ha realizado trabajo en equipo?
    El trabajo se ha realizado por los estudiantes Jorge Vara y Álvaro Villar el cual se puede ver reflejado en los comits.
  
◦ ¿Tiene calidad el conjunto de pruebas disponibles?
  Las pruebas comprueban de manera satisfactoria que el codigo funciona correctamente por lo cual podemos determinar que las pruebas disponibles tienen la calidad requerida

◦ ¿Cuál es el esfuerzo invertido en realizar la actividad?
  Se ha dedicado 6 horas para realizar toda la actividad, esto incluye 4 horas dedicadas en las clases practicas y dos horas dedicadas fuera de ellas. En estas horas hemos creado el proyecto, entendido los           conceptos y solucionado los problemas que fueron surgiendo.

◦ ¿Cuál es el número de fallos encontrados en el código original?

◦ ¿El proceso de integración continua realizado ha sido de calidad?

Java code example of creational design pattern pool object


Authors:

- Jorge Vara Rodriguez
- Álvaro Villar Val
