package org.araujo;

public class ServidorEstadoTravado implements ServidorEstado {

    private ServidorEstadoTravado() {};
    private static ServidorEstadoTravado instance = new ServidorEstadoTravado();
    public static ServidorEstadoTravado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Travado";
    }

}
