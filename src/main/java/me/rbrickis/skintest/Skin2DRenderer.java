package me.rbrickis.skintest;

import me.rbrickis.skintest.utils.TransformUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Skin2DRenderer extends SkinRenderer<Graphics2D> {
    @Override
    public void renderTo(Graphics2D graphics) {
        for (RendererSkinPart part : getParts()) {
            BufferedImage image = part.part.getRenderedPart();

            if (part.flip) {
                image = TransformUtils.flip(image);
            }

            graphics.drawImage(image, part.x, part.y, image.getWidth(), image.getHeight(), new Color(0x000000FF, true), null);
        }
    }
}
