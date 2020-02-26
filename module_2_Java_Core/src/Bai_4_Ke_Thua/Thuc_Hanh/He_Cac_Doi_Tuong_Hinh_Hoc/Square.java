package Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc;

public class Square extends Rectangle {

    public Square(){
        setLength(1.0);
        setWidth(1.0);
    }

    public Square(double side){
        setLength(side);
        setWidth(side);
    }

    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }


    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }
    
}
