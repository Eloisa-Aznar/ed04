package org.example;

import java.util.ArrayList;
import java.util.List;

class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Guardar contacto de teléfono.
     * @param name nombre de la persona.
     * @param phone números de teléfono de la persona.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Getter name.
     * @return devuelve el nombre (name).
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter phones.
     * @return devuelve los teléfonos.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}