package me.rbrickis.skintest.example;

import me.rbrickis.skintest.Skin;
import me.rbrickis.skintest.SkinReader;
import me.rbrickis.skintest.renderers.Body2DRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static me.rbrickis.skintest.utils.TransformUtils.scaleTo;

public class Main {

    public static void main(String[] args) throws Exception {
        SkinReader reader = new SkinReader();

        Skin skin = reader.readFromFile(new File("example/Robotdevil.png"));

        File file = new File("example/robotdevil_front.png");

        BufferedImage body = new Body2DRenderer(skin).getRenderedImage();

        ImageIO.write(scaleTo(body, 8, 8), "png", file);

    }
}
