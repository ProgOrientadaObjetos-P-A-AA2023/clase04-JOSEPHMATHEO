package paquete2;

public class Ejecutor02 {
    
    public static void main(String[] args) {
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        
        Ciudad ciudad1 = new Ciudad("Loja");
        Barrio barrio1 = new Barrio("el Valle", ciudad1);
        Persona persona1 = new Persona("Santiago Riofrio", "1100909909", barrio1);
        
        // Presentacion de Datos 
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
        System.out.println("------------------------------------------");
        
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Persona persona2 = new Persona("Kelvin Sarango", "1105489461", barrio2);
        
        // Presentacion de Datos 
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil
        
        Ciudad ciudad3 = new Ciudad("Guayaquill");
        Barrio barrio3 = new Barrio("San Sebastián", ciudad3);
        Persona persona3 = new Persona("Jhordy", "1013175652", barrio3);
        
        // Presentacion de Datos 
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
    }
    
}
