package me.rbrickis.skintest.utils;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public final class TransformUtils {

    /**
     * Scales an image using an AffineTransform
     * @param src The image
     * @param newWidth The new scaled image's height
     * @param newHeight The new scaled image's width
     * @return A scaled image of {@code newWidth} x {@code newHeight}
     */
    public static BufferedImage scaleTo(BufferedImage src, int newWidth, int newHeight) {
        AffineTransform affineTransform = AffineTransform.getScaleInstance(newWidth, newHeight);
        AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return affineTransformOp.filter(src, null);
    }

    /**
     * Flips the {@code src} across the y axis
     * @param src The source
     * @return A flipped image
     */
    public static BufferedImage flip(BufferedImage src) {
        AffineTransform transform = AffineTransform.getScaleInstance(-1, 1);
        transform.translate(-src.getWidth(), 0);
        AffineTransformOp transformOp = new AffineTransformOp(transform, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return transformOp.filter(src, null);
    }

}
