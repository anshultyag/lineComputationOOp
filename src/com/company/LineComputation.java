package com.company;
public class LineComputation {
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;
    public LineComputation(int x1,int x2,int y1,int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        
    }
    public double lineTotal(){
        double lengthOfLine1= Math.sqrt((x2 - x1) ^ 2 + (y2-y1) ^ 2);
              return lengthOfLine1;
    }
    public static void main(String[] args) {
        LineComputation  l1 = new LineComputation(2,3,4,9);
        System.out.println("length of line 1 : "+ l1.lineTotal());
        LineComputation  l2 = new LineComputation(2,5,4,8);
        System.out.println("length of line 1 : "+ l2.lineTotal());

    }
}
