package com.zipcode.DTVApp.utility;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.UUID;

@Converter(autoApply = true)
public class UUIDConverter implements AttributeConverter<UUID, UUID> {
    @Override
    public UUID convertToDatabaseColumn(UUID attritube) {
        return attritube;
    }

    @Override
    public UUID convertToEntityAttribute(UUID dbData) {
        return dbData;
    }
}
