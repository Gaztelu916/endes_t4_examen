package refactor.ref4;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
    }

    void printTitulo(){
        System.out.println("Título del Reporte");
    }

    void printConclusion(){
        System.out.println("Conclusión del Reporte");
    }
}
