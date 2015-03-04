package com.nanuvem.lom.kernel.dao;

import com.nanuvem.lom.api.Property;
import com.nanuvem.lom.api.dao.AttributeValueDao;

public class MemoryAttributeValueDao implements AttributeValueDao {

    private Long id = 1L;
    private MemoryDatabase memoryDatabase;

    public MemoryAttributeValueDao(MemoryDatabase memoryDatabase) {
        this.memoryDatabase = memoryDatabase;
    }

    public Property create(Property value) {
        value.setId(id++);
        value.setVersion(0);

        memoryDatabase.addAttributeValue(value);

        return value;
    }
}
