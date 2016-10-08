package me.rbrickis.skintest.renderers;

import me.rbrickis.skintest.PartType;
import me.rbrickis.skintest.Skin;
import me.rbrickis.skintest.Skin2DRenderer;

import java.awt.image.BufferedImage;

/**
 * Renders a 2D frontal view of the body.
 * The dimensions of the image returned will be 16x32
 */
public class Body2DRenderer extends Skin2DRenderer {

    private BufferedImage renderedImage = new BufferedImage(16, 32, BufferedImage.TYPE_4BYTE_ABGR);

    public Body2DRenderer(Skin skin) {
        // Add the head and hat
        {
            super.addPartAt(skin.getPart(PartType.HEAD_FRONT), 4, 0, false);
            super.addPartAt(skin.getPart(PartType.HAT_FRONT), 4, 0, false);
        }

        // Add the body
        {
            super.addPartAt(skin.getPart(PartType.BODY_FRONT), 4, 8, false);
        }

        // Add the arms
        {
            super.addPartAt(skin.getPart(PartType.ARM_FRONT), 0, 8, false);
            // This is the left arm. Since arms should be opposite, flip it
            super.addPartAt(skin.getPart(PartType.ARM_FRONT), 12, 8, true);
        }

        // Add the legs
        {
            super.addPartAt(skin.getPart(PartType.LEG_FRONT), 4, 20, false);
            // This is the left leg. Since legs should be opposite, flip it
            super.addPartAt(skin.getPart(PartType.LEG_FRONT), 8, 20, true);
        }

        // Render to the image
        super.renderTo(renderedImage.createGraphics());
    }

    public BufferedImage getRenderedImage() {
        return renderedImage;
    }
}
