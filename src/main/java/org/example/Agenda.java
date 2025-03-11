package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor de la agenda.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Metodo para añadir contactos a la agenda.
     * @param name nombre del contacto.
     * @param phone teléfonos del contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo para borrar contactos.
     * @param name nombre del contacto.
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Metodo para modificar el número de teléfono.
     * @param name nombre del contacto que queremos modificar.
     * @param oldPhone número de teléfono antiguo.
     * @param newPhone número de teléfono nuevo.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Getter
     * @return devuelve los contactos de la agenda.
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}