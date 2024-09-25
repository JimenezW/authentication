package com.authentication.common.utils;

import java.lang.reflect.Field;

public class ObjectCopier <T> {

    public void copyProperties(T source, T target) {
        if (source == null || target == null) {
            throw new IllegalArgumentException("Source and target cannot be null");
        }

        // Obtenemos todas las propiedades del objeto
        Field[] fields = source.getClass().getDeclaredFields();

        for (Field field : fields) {
            try {

                // Omitir las propiedades "id" y "createDate"
                if (field.getName().equals("id") || field.getName().equals("createDate")) {
                    continue; // Saltar la copia de estos campos
                }

                // Permitir acceso a campos privados
                field.setAccessible(true);

                // Obtener el valor de la propiedad del objeto source
                Object value = field.get(source);

                // Asignar el valor de la propiedad al objeto target
                field.set(target, value);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to copy properties", e);
            }
        }
    }
}