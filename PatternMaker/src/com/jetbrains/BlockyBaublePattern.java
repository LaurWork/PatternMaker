package com.jetbrains;

public class BlockyBaublePattern extends Pattern {

    @Override
    public void pattern()
    {
        Stitch blockStitch = new BlockStitch();
//        blockStitch.sew();

        Stitch shortLineStitch = new ShortLineStitch();
//        shortLineStitch.sew();

        Stitch circleStitch = new CircleStitch();
//        circleStitch.sew();

        blockStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        blockStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        blockStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();
        shortLineStitch.sew();
        shortLineStitch.sew();

        System.out.print(" ");
    }

}
