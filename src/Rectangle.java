public class Rectangle {
    private float a;
    private float b;

    public Rectangle(){

    }
    public Rectangle(float a,float b){
        this.a = a;
        this.b = b;

    }
    public void setA(float a){
        this.a = a;
    }
    public float getA(){
        return a;
    }
    public void setB(float b){
        this.b = b;
    }
    public float getB(){
        return b;
    }
    public double area(){

        return a*b;
    }
}
