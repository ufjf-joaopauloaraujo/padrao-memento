package org.araujo;

public class ServidorEstadoAtivo implements ServidorEstado {

    private ServidorEstadoAtivo() {};
    private static ServidorEstadoAtivo instance = new ServidorEstadoAtivo();
    public static ServidorEstadoAtivo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ativo";
    }

}
