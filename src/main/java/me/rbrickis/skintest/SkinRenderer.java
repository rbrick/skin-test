package me.rbrickis.skintest;

import java.util.ArrayList;
import java.util.List;

/**
 * A Skin renderer will render the passed in parts of the skin to a buffer
 */
public abstract class SkinRenderer<TBuffer> {

    private List<RenderedSkinPart> parts = new ArrayList<>();

    /**
     * This will add a Skin part to the renderer. When render it will render the points @ the x and y coordinates given.
     *
     * @param part The part to add
     * @param x The minimum x coordinate
     * @param y The minimum y coordinate
     * @param flip If true this will flip the skin part when rendered.
     */
    public SkinRenderer<TBuffer> addPartAt(SkinPart part, int x, int y, boolean flip) {
        parts.add(new RenderedSkinPart(part, x, y, flip));
        return this;
    }

    public abstract void renderTo(TBuffer buffer);

    public List<RenderedSkinPart> getParts() {
        return parts;
    }

    public class RenderedSkinPart {
        public SkinPart part;
        // The coordinates
        public int x, y;
        // Do we flip the part?
        public boolean flip;

        public RenderedSkinPart(SkinPart part, int x, int y, boolean flip) {
            this.part = part;
            this.x = x;
            this.y = y;
            this.flip = flip;
        }
    }

}
