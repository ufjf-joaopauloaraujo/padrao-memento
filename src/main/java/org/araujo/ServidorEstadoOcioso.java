package org.araujo;

public class ServidorEstadoOcioso implements ServidorEstado {

    private ServidorEstadoOcioso() {};
    private static ServidorEstadoOcioso instance = new ServidorEstadoOcioso();
    public static ServidorEstadoOcioso getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ocioso";
    }

}
