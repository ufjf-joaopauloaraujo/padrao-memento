package org.araujo;

public class ServidorEstadoSobrecarregado implements ServidorEstado {

    private ServidorEstadoSobrecarregado() {};
    private static ServidorEstadoSobrecarregado instance = new ServidorEstadoSobrecarregado();
    public static ServidorEstadoSobrecarregado getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Sobrecarregado";
    }

}
