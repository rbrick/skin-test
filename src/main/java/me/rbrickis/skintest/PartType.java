package me.rbrickis.skintest;

/**
 * This is for a 1.7 skin. 1.8 is more complex because of layering. Will do when I have more free time.
 */
public enum PartType {

    // HEAD
    HEAD_FRONT(8, 8, 16, 16),
    HEAD_BACK(24, 8, 32, 16),
    HEAD_RIGHT(0, 8, 8, 16),
    HEAD_LEFT(16, 8, 24, 16),
    HEAD_TOP(8, 0, 16, 8),
    HEAD_BOTTOM(16, 0, 24, 8),
    // END HEAD

    // TODO(rbrick): Complete the coordinates.
    // HAT
    HAT_FRONT(40, 8, 48, 16),
    HAT_BACK(56, 8, 64, 16),
    HAT_RIGHT(32, 8, 40, 16),
    HAT_LEFT(48, 8, 56, 16),
    HAT_TOP(40, 0, 48, 8),
    HAT_BOTTOM(48, 0, 56, 8),
    // END HAT

    // BODY
    BODY_FRONT(20, 20, 28, 32),
    //    BODY_BACK,
    //    BODY_RIGHT,
    //    BODY_LEFT,
    //    BODY_TOP,
    //    BODY_BOTTOM,
    // END BODY

    // LEG
    LEG_FRONT(4, 20, 8, 32),
    //    LEG_BACK,
    //    LEG_INS,
    //    LEG_OUTS,
    //    LEG_TOP,
    //    LEG_BOTTOM,
    // END LEG

    // ARM
    ARM_FRONT(44, 20, 48, 32);
    //    ARM_BACK,
    //    ARM_INS,
    //    ARM_OUTS,
    //    ARM_TOP,
    //    ARM_BOTTOM;
    // END ARM

    private int minX, minY, maxX, maxY;

    PartType(int minX, int minY, int maxX, int maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }
}
