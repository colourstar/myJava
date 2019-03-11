import java.applet.*; // 导入java.applet包下的所有类
import java.awt.*;      // 导入java.applet包下的所有类

public class JavaApplet extends Applet
{
    /*
    * applet 初始化
    *@see java.applet.Applet类
    *@return void
     */
    public void init()
    {
        setSize(300,200);       // 指定大小
    }

    /*
    * applet 绘制方法
    *@see java.applet.Applet
     */

    public void paint(Graphics graphic)
    {
        graphic.drawString("Hello World", 100, 30);
    }
}