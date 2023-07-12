package My3;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * DATE: 2022/7/12
 * Author: yjy --- BUPT
 */
public class Util {

    /** 窗口截图 : 将窗口/控件截图，并保存为JPG图片
     *
     *
     *  comp, 目标窗口/控件
     *  file, 文件路径, 必须为 jpg 或 png 格式
     */
    public static void snapshot (Component comp, File file )
    {
        // 具体功能实现，请参考 《Swing高级篇》中的说明

        // 创建一个 Image
        int width = comp.getWidth();
        int height = comp.getHeight();
        BufferedImage image = new BufferedImage(width,height, BufferedImage.TYPE_3BYTE_BGR);

        // 将控件打印到 Image 上
        Graphics g = image.getGraphics();
        comp.paint(g);

        try
        {
            // 将 Image 保存为文件
            ImageIO.write(image, "JPEG", file);
        } catch (IOException e)
        {
            throw new RuntimeException( e);
        }
    }
}
