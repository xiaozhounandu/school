package image;

/**
 * @ClassName image
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-07-23-07
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
public class image  {

    /**
     * 图片马赛克处理类
     * @param source 原图片路径（如：F:/images/6.jpg）
    ）
     * @param size 马赛克尺寸，即每个矩形的宽高
     * @return
     */


        public static String markImageByMosaic(String source,int size){

            String result = null;

            try{
                File file = new File(source);
                String fileName = file.getName();//获取文件名字
                String s[] = fileName.split("\\.");
                String imageType = s[1];
                BufferedImage img = ImageIO.read(file); // 读取该图片
                int width = img.getWidth(null); //原图片宽
                int height = img.getHeight(null); //原图片高

                BufferedImage mosaic = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
                //马赛克格尺寸太大或太小
                if (width < size || height < size) {
                    return "马赛克格尺寸太大";
                }
                if(size<=0){
                    return "马赛克格尺寸太小";
                }

                int xcount = 0; //x方向绘制个数
                int ycount = 0; //y方向绘制个数

                if (width % size == 0) {
                    xcount = width / size;
                } else {
                    xcount = width / size + 1;
                }
                if (height % size == 0) {
                    ycount = height / size;
                } else {
                    ycount = height / size + 1;
                }
                int x = 0; //x坐标
                int y = 0; //y坐标

                //绘制马赛克(绘制矩形并填充颜色)
                Graphics2D g = mosaic.createGraphics();
                for (int i = 0; i < xcount; i++) {
                    for (int j = 0; j < ycount; j++) {
                        //马赛克矩形格大小
                        int mwidth = size;
                        int mheight = size;

                        if(i==xcount-1){  		//横向最后一个不够一个size
                            mwidth = width-x;
                        }
                        if(j == ycount-1){ //纵向最后一个不够一个size
                            mheight = height-y;
                        }
                        //矩形颜色取中心像素点RGB值
                        int centerX = x;
                        int centerY = y;

                        if (mwidth % 2 == 0) {
                            centerX += mwidth / 2;
                        } else {
                            centerX += (mwidth - 1) / 2;
                        }
                        if (mheight % 2 == 0) {
                            centerY += mheight / 2;
                        } else {
                            centerY += (mheight - 1) / 2;
                        }

                        Color color = new Color(img.getRGB(centerX, centerY));
                        g.setColor(color);
                        g.fillRect(x, y, mwidth, mheight);
                        y = y + size;// 计算下一个矩形的y坐标
                    }
                    y = 0;// 还原y坐标
                    x = x + size;// 计算x坐标
                }
                //马赛克处理结束
                g.dispose();
                File sf = new File(source);
                ImageIO.write(mosaic, imageType, sf); // 保存图片
                result = "su";
            }catch(Exception e){
                e.printStackTrace();
            }

            return result;

        }

        public static void main(String[] args){
		markImageByMosaic("/Users/weizhijie/Desktop/testPython/download.jpg",21);
            System.out.println("开始打码");
        }
    }

