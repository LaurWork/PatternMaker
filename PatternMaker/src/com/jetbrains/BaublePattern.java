package com.jetbrains;

public class BaublePattern extends Pattern {



    @Override
    public void pattern()
    {
        Stitch shortLineStitch = new ShortLineStitch();
//        shortLineStitch.sew();

        Stitch circleStitch = new CircleStitch();
//        circleStitch.sew();

        shortLineStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();

        System.out.print(" ");
    }


}
