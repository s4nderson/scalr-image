package pm

import org.imgscalr.Scalr

import javax.imageio.ImageIO
import java.awt.image.BufferedImage

class ImageScalr {

    static void main(String[] args) {


        BufferedImage srcImage = ImageIO.read(this.class.getResourceAsStream('/gryffindor_texture_enormous.jpg'))
        BufferedImage scaledImage = Scalr.resize(srcImage, 150)
        println 'you got it'
    }
}
