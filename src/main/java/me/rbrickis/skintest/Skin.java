package me.rbrickis.skintest;

import java.util.Map;

/**
 * This object represents a Minecraft skin. The skin is separated into different SkinParts.
 */
public final class Skin {

    private Map<PartType, SkinPart> parts;

    public Skin(Map<PartType, SkinPart> parts) {
        this.parts = parts;
    }

    public SkinPart getPart(PartType type) {
        return parts.get(type);
    }
}
