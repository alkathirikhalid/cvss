package com.alkathirikhalid.cvss.controller.world;

import com.alkathirikhalid.cvss.controller.base.BaseServlet;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alkathirikhalid
 */
@WebServlet(name = "CaptchaServlet", urlPatterns = {"/captcha"})
public class Captcha extends BaseServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 150;
        int height = 50;

        char data[][] = {
            {'l', 'e', 'e', 't', 'o', 'd', 'e'},
            {'W', 'x', 'n', 'u', 'x', 'd', 'e'},
            {'f', 'r', 'e', 'e', 'b', 's', 'd'},
            {'u', 'b', 'u', 'n', 't', 'u', 's'},
            {'j', 'e', 'e', 'N', 'e', 'e', 'M'},
            {'2', 'e', 'h', 'v', 'j', 'a', 'n'},
            {'5', 'f', 's', 'u', 'd', 'Z', '0'},
            {'8', 'g', 'k', 'w', 'G', 's', 'l'},
            {'9', '6', 'X', 'w', 'a', '7', 's'},
            {'6', '0', 'q', 'a', 'p', 'e', 'd'}
        };

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();

        Font font = new Font("Georgia", Font.BOLD, 18);
        g2d.setFont(font);

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        GradientPaint gp = new GradientPaint(0, 0, Color.white, 0, height / 2, Color.CYAN, true);

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);

        g2d.setColor(new Color(255, 153, 0));

        Random r = new Random();
        int index = Math.abs(r.nextInt()) % 10;

        String captcha = String.copyValueOf(data[index]);
        request.getSession().setAttribute("captcha", captcha);

        int x = 0;
        int y = 0;

        for (int i = 0; i < data[index].length; i++) {
            x += 10 + (Math.abs(r.nextInt()) % 15);
            y = 20 + Math.abs(r.nextInt()) % 20;
            g2d.drawChars(data[index], i, 1, x, y);
        }

        g2d.dispose();

        response.setContentType("image/png");
        OutputStream os = response.getOutputStream();
        ImageIO.write(bufferedImage, "png", os);
        os.close();
        super.doGet(request, response);
    }

}
