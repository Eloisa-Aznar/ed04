package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

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
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo para borrar contactos.
     * @param name nombre del contacto.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

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
        for (Contacto c : contacts) {
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
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}