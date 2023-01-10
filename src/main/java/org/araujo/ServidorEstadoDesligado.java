package org.araujo;

public class ServidorEstadoDesligado implements ServidorEstado {

    private ServidorEstadoDesligado() {};
    private static ServidorEstadoDesligado instance = new ServidorEstadoDesligado();
    public static ServidorEstadoDesligado getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Desligado";
    }
    
}

