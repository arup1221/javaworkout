package prog12;

import java.applet.Applet; import java.awt.Graphics;
/*
<applet code="AppletP.class" width="300" height="300">
</applet>
*/
public class AppletP extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Welcome to applet",100,150);
    }
}