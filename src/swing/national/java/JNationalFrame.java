package swing.national.java;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

@SuppressWarnings("all")
public final class JNationalFrame extends JFrame
{
    protected final ScreenSizeWidth screen_width = new ScreenSizeWidth(this);

    protected final ScreenSizeHeight screen_height = new ScreenSizeHeight(this);

    protected final ScreenCenter screen_center = new ScreenCenter(this);

    protected final Integer frame_width = 1920;

    protected final Integer frame_height = 1080;

    public JNationalFrame()
    {
        this.setTitle("MEARVK LLC - National Trade");

        this.setSize(1920,1080);

        this.setLocation(this.screen_width.width/2-this.getSize().width/2, this.screen_height.height/2-this.getSize().height/2);

        this.setVisible(Boolean.TRUE);
    }

    public static class ScreenCenter
    {
        public HashMap<Integer,Integer> pixel = new HashMap<>(100);

        public Integer coverage_latitude;

        public Integer coverage_longitude;

        public ScreenCenter(JNationalFrame java_national_frame)
        {
            Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();

            this.pixel.put(screen_size.width/2,screen_size.height/2);

            this.coverage_latitude = screen_size.width/2;

            this.coverage_longitude = screen_size.height/2;
        }
    }

    public static class ScreenSizeWidth
    {
        public Integer width;

        public ScreenSizeWidth(JNationalFrame java_national_frame)
        {
            Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();

            this.width = ((screen_size.width - java_national_frame.getWidth()) / 2);
        }
    }

    public static class ScreenSizeHeight
    {
        protected Integer height;

        public ScreenSizeHeight(JNationalFrame java_national_frame)
        {
            Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();

            this.height = ((screen_size.height - java_national_frame.getHeight()) / 2);
        }
    }
}
