# UADE: Algoritmos Y Estructuras De Datos II - Programación II

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Este repositorio contiene todo lo necesario para poder seguir la materia desde el inicio hasta el final.

## Tabla de contenidos

Los siguientes son los puntos más importantes en este archivo:
- [Requisitos](#requisitos)
- [Comprobar requisitos](#comprobar-requisitos)
- [FAQ](#faq)

## Requisitos

Para poder realizar el curso necesitas tener instalado en tu computadora las siguientes herramientas:
- [Java](http://jdk.java.net/)
- [Git](https://git-scm.com/)

Si no tienes algunas de estas herramientas instaladas en tu computadora, sigue las instrucciones en la documentación oficial de cada herramienta o los videos creados como guía para esta materia.

## Comprobar requisitos

Si instalaste en tu computadora algunas de estas herramientas anteriormente o lo acabas de hacer ahora, verifica si todo funciona bien.

- Comprueba si la versión de Java está correctamente instalada usando el siguiente comando:
   ````
   % java -version
   openjdk 21.0.2 2024-01-16
   OpenJDK Runtime Environment GraalVM CE 21.0.2+13.1 (build 21.0.2+13-jvmci-23.1-b30)
   OpenJDK 64-Bit Server VM GraalVM CE 21.0.2+13.1 (build 21.0.2+13-jvmci-23.1-b30, mixed mode, sharing)
   ````

- Comprueba si tienes instalado de manera correcta en tu computadora Git usando el siguiente comando:
   ````
   % git --version
   git version 2.34.1
   ````

## Estándares de código

Java tiene una serie de reglas definidas para desarrollar algo, ya sea una aplicación o una librería, y que todos los desarrolladores usen los mismos criterios. Existen las siguientes formas de validar si se está siguiendo el formato correcto: 

- **Code conventions**: Este [documento](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf) que fue creado en 1997 con el fin de definir los estándares de código que debería seguir cualquier desarrollador que usa Java.

- **SonarLint**: Es un plugin que nos ayuda al código fuente, siga los estándares de Java y reducir los bugs que podrían generarse. Esta herramienta tiene soporte para casi todos los IDE existentes, dentro de los más conocidos tiene soporte en:
    - [IntelliJ](https://plugins.jetbrains.com/plugin/7973-sonarlint)
    - [Eclipse](https://marketplace.eclipse.org/content/sonarqube-ide)
    - [Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=SonarSource.sonarlint-vscode)

## Estructura del proyecto

El proyecto que se usara a lo largo de la cursada tiene estructura similar a la siguiente:

````
src/
  └── main
      └── java
          └── org
              └── uade
                  ├── org.uade.algorithm
                  ├── org.uade.exception
                  ├── org.uade.org.uade.structure
                  │   ├── org.uade.org.uade.structure.org.uade.structure.definition
                  │   └── implementation
                  │       ├── org.uade.structure.implementation.common.dynamic
                  │       │   └── extras
                  │       └── org.uade.structure.implementation.fixed
                  └── util
````

Como se puede ver en la estructura existen una serie de paquetes donde cada uno tiene una funcionalidad en particular. En la siguiente tabla se detalla cada uno de los paquetes como asi tambien si deben o no tener prefijos los archivos en su interior:

| **Paquete**                  | **Descripción**                                                             |
|------------------------------|-----------------------------------------------------------------------------|
| `org.uade.algorithm`                  | Contiene la implementación de algoritmos que utilizan los TDA.              |
| `org.uade.exception`                  | Define las excepciones personalizadas usadas en el proyecto.                |
| `org.uade.org.uade.structure`                  | Paquete general que agrupa las estructuras de datos.                        |
| `org.uade.org.uade.structure.org.uade.org.uade.structure.org.uade.structure.definition`       | Contiene las interfaces o definiciones de los TDA.                          |
| `org.uade.org.uade.structure.implementation`   | Implementaciones concretas de los TDA.                                      |
| `org.uade.org.uade.structure.implementation.org.uade.structure.implementation.common.dynamic` | Implementaciones de estructuras de datos dinámicas (ej.: listas enlazadas). |
| `org.uade.org.uade.structure.implementation.org.uade.structure.implementation.common.dynamic.extras` | Componentes auxiliares o complementarios para las estructuras dinámicas.    |
| `org.uade.org.uade.structure.implementation.org.uade.structure.implementation.fixed`   | Implementaciones de estructuras de datos de tamaño fijo (ej.: arrays).      |
| `util`                       | Clases utilitarias y funciones auxiliares usadas en todo el proyecto.       |

