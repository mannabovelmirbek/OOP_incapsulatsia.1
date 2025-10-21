public class House {
   private String addres;
   private int numberOfRooms;
    private double area;

    public House(){

    }
    public House(String addres,int numberOfRooms,double area,int price){
        this.addres = addres;
        this.numberOfRooms = numberOfRooms;
        this.area = area;

    }
    public void setAddres(String addres){
        this.addres = addres;
    }
    public String getAddres(){
        return addres;
    }
    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public void setArea(double area){
        this.area =  area;
    }
    public double getArea(){
        return area;
    }


    public double calculatePrice(int price){
       return area * price;
    }
}
