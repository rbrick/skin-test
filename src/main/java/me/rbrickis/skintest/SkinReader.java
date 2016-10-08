package me.rbrickis.skintest;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class SkinReader {

    public Skin readFromFile(File file) throws IOException {
        return read(ImageIO.read(file));
    }


    public Skin read(BufferedImage image) {
        if (image.getWidth(null) > 64 || image.getHeight(null) > 32) {
            throw new IllegalArgumentException(
                "Image is not a valid skin type. Only compatible with 1.7 skins at this time!");
        }

        Map<PartType, SkinPart> parts = new HashMap<>();

        for (PartType partType : PartType.values()) {
            parts.put(partType, new SkinPart(partType, image));
        }
        return new Skin(parts);
    }

}
