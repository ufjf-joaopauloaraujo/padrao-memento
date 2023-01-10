package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServidorTest {

    @Test
    void deveArmazenarEstados() {
        Servidor servidor = new Servidor();
        servidor.setEstado(ServidorEstadoTravado.getInstance());
        servidor.setEstado(ServidorEstadoOcioso.getInstance());
        servidor.setEstado(ServidorEstadoAtivo.getInstance());
        assertEquals(3, servidor.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Servidor servidor = new Servidor();
        servidor.setEstado(ServidorEstadoTravado.getInstance());
        servidor.setEstado(ServidorEstadoOcioso.getInstance());
        servidor.restauraEstado(0);
        assertEquals(ServidorEstadoTravado.getInstance(), servidor.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Servidor servidor = new Servidor();
        servidor.setEstado(ServidorEstadoTravado.getInstance());
        servidor.setEstado(ServidorEstadoAtivo.getInstance());
        servidor.setEstado(ServidorEstadoTravado.getInstance());
        servidor.setEstado(ServidorEstadoOcioso.getInstance());
        servidor.restauraEstado(2);
        assertEquals(ServidorEstadoTravado.getInstance(), servidor.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Servidor servidor = new Servidor();
            servidor.restauraEstado(0);
            fail("servidor.restauraEstado(...) deveria falhar: Índice inválido");
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}