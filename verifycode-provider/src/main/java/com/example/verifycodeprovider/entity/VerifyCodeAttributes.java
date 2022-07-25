package com.example.verifycodeprovider.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.awt.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class VerifyCodeAttributes {
    @ApiModelProperty(value = "图片宽度")
    private int width = 200;

    @ApiModelProperty(value = "图片高度")
    private int height = 400;

    @ApiModelProperty(value = "验证码长度")
    private int verifyCodeSize = 5;

    @ApiModelProperty(value = "是否有边框")
    private boolean hasBorder = true;

    @ApiModelProperty(value = "边框宽度")
    private int borderWidth = 1;

    @ApiModelProperty(value = "随机边框颜色")
    private boolean borderColorRandom = true;

    @ApiModelProperty(value = "边框颜色")
    private Color borderColor = null;

    @ApiModelProperty(value = "随机背景颜色")
    private boolean backgroundColorRandom = true;

    @ApiModelProperty(value = "背景颜色")
    private Color backgroundColor = null;

    @ApiModelProperty(value = "是否绘制干扰线")
    private boolean hasInterferenceLine = true;

    @ApiModelProperty(value = "是否设置噪点")
    private boolean hasNoise = true;

    @ApiModelProperty(value = "噪点率")
    private float noiseRate = 0.1f;

    @ApiModelProperty(value = "是否设置图片扭曲")
    private boolean hasShare = true;

    @ApiModelProperty(value = "字体大小")
    private int fontSize = 40;
}
