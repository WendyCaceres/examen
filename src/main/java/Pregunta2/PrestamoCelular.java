package Pregunta2;

public class PrestamoCelular {

    public String prestamoCelular(String modelo, String marca, String usuario){
        if(estadoDisponible(modelo, marca)){
            boolean registrado = registrarPrestamo(modelo, marca, usuario);
            if(registrado){
                return "El celular '" + modelo + "' de '" + marca + "' ha sido prestado a '" + usuario + "'";
            } else {
                return "No se pudo registrar el prestamo del celular '" + modelo + "' de '" + marca + "'";
            }
        } else {
            return "El celular '" + modelo + "' de " + marca + "' no esta disponible";
        }
    }

    private boolean estadoDisponible(String modelo, String marca){
        if ("Galaxy S21".equals(modelo)&& "Samsung".equals(marca)){
            return false;
        }
        return true;
    }

    private boolean registrarPrestamo(String modelo, String marca, String usuario){
        return true;
    }

    public static void main(String[] args){
        ServicioPrestamos servicio = new ServicioPrestamo();

        System.out.println(servicio.prestamoCelular("iPhone 12", "Apple", "Juan Perez"));
        System.out.println(servicio.prestamoCelular("Galaxy S21", "Samsung", "Ana Lopez"));
        System.out.println(servicio.prestamoCelular("Pixel 6", "Google", "Calos Diaz"));
    }
}
