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
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}