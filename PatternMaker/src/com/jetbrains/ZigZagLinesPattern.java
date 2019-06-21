package com.jetbrains;

public class ZigZagLinesPattern extends Pattern {

    @Override
    public void pattern() {
        Stitch zigZagStitch = new ZigZagStitch();


        Stitch fillStitch = new FillStitch();


        zigZagStitch.sew();
        zigZagStitch.sew();
        zigZagStitch.sew();
        fillStitch.sew();
        fillStitch.sew();
        fillStitch.sew();
        zigZagStitch.sew();
        zigZagStitch.sew();
        zigZagStitch.sew();
        fillStitch.sew();
        fillStitch.sew();
        fillStitch.sew();

        System.out.print(" ");
    }

}
