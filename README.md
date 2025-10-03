# programacion2-primerparcial

## Nombre de la Aplicación
Sistema de Gestión de Cursos Universitarios

## Descripción del Sistema (Funcionalidades)

Esta aplicación Android fue desarrollada en **JAVA** utilizando la librería de persistencia **Room sobre SQLite**. La **Arquitectura de Base de Datos (Puntos 1 y 3)** está completamente implementada.

### Requisitos Implementados:

1.  **Base de Datos Relacional (4 Tablas):** Implementadas las entidades **Estudiantes, Materias, Inscripciones y Calificaciones** con relaciones 1:N y N:M (usando @ForeignKey).
2.  **Room:** Uso de anotaciones `@Entity`, `@Dao`, `@Database` y `@ForeignKey`.
3.  **Dependencias:** **ViewBinding**, **Navigation**, y **RecyclerView** están configuradas en `build.gradle` (Puntos 4, 5, 7, 8).
