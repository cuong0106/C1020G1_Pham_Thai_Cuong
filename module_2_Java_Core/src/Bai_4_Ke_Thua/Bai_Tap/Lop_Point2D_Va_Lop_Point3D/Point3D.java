package Bai_4_Ke_Thua.Bai_Tap.Lop_Point2D_Va_Lop_Point3D;

public class Point3D extends Point2D {
    private float z=1;

    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y,float z){
        setXY(x,y);
        this.z = z;
    }

    public float[] getZXY(){
        float[] array = new float[3];
        array = super.getXY();
        array[3]=getZ();
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x="+super.getX()+
                "y="+super.getY()+
                "z=" + this.z +
                '}';
    }
}
