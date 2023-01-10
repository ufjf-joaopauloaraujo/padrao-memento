package org.araujo;

import java.util.ArrayList;
import java.util.List;

public class Servidor {

    private ServidorEstado estado;
    private List<ServidorEstado> memento = new ArrayList<ServidorEstado>();

    public ServidorEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ServidorEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ServidorEstado> getEstados() {
        return this.memento;
    }
}
