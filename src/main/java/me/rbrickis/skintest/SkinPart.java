package me.rbrickis.skintest;

import java.awt.image.BufferedImage;

/**
 * This represents a part/section of the Minecraft skin.
 */
public final class SkinPart {

    private PartType partType;

    // This is the part of the skin rendered to a buffered image
    private BufferedImage rendered;

    public SkinPart(PartType partType, BufferedImage parent) {
        this.partType = partType;

        this.rendered = parent.getSubimage(partType.getMinX(), partType.getMinY(), (partType.getMaxX() - partType.getMinX()), (partType.getMaxY() - partType.getMinY()));

        for (int x = 0; x < rendered.getWidth(); x++) {
            for (int y = 0; y < rendered.getHeight(); y++) {
                int px = this.partType.getMinX() + x;
                int py = this.partType.getMinY() + y;
                this.rendered.setRGB(x, y, parent.getRGB(px, py));
            }
        }

    }

    public BufferedImage getRenderedPart() {
        return rendered;
    }
}
