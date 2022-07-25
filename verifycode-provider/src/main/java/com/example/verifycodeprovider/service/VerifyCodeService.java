package com.example.verifycodeprovider.service;

import com.example.verifycodeprovider.entity.VerifyCodeAttributes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@Service
public class VerifyCodeService {
    @Resource
    private HttpServletRequest req;
    @Resource
    private HttpServletResponse resp;


    public void getImageVerifCode(VerifyCodeAttributes attributes) throws IOException {

        resp.setHeader("Pragma", "No-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", 0);
        resp.setContentType("image/jpg");


        BufferedImage image = new BufferedImage(attributes.getWidth(), attributes.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //生成随机字串
        String verifyCode = util.CaptchaUtil.generateVerifyCode(attributes.getVerifyCodeSize());

        /*设置边框颜色和背景*/
        util.CaptchaUtil.setBorderAndBackGroud(g2, attributes.getWidth(), attributes.getHeight(), attributes.getBorderWidth(), util.CaptchaUtil.getRandColor(100, 225), util.CaptchaUtil.getRandColor(200, 255));

        //绘制干扰线

        util.CaptchaUtil.setInterference(g2, attributes.getWidth() - 2 * attributes.getBorderWidth(), attributes.getHeight() - 2 * attributes.getBorderWidth());

        // 添加噪点
        util.CaptchaUtil.setNoise(attributes.getWidth() - 2 * attributes.getBorderWidth(), attributes.getHeight() - 2 * attributes.getBorderWidth(), image, attributes.getNoiseRate());

        // 使图片扭曲
        util.CaptchaUtil.shear(g2, attributes.getWidth() - 2 * attributes.getBorderWidth(), attributes.getHeight() - 2 * attributes.getBorderWidth(), util.CaptchaUtil.getRandColor(100, 200));


        /*设置字体*/
        util.CaptchaUtil.setFont(g2, attributes.getBorderWidth(), attributes.getBorderWidth(), attributes.getWidth() - 2 * attributes.getBorderWidth(), attributes.getHeight() - 2 * attributes.getBorderWidth(), attributes.getFontSize(), verifyCode);

        g2.dispose();
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }
}
