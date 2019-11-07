public class Pizza {
    private  String name ;
    private  int price ;
    private  int  size ;

    void show(){
        System.out.println("这是"+name+"披萨");
    }
    public Pizza(){

    }
    public Pizza(String name,int price ,int size){

    }
    public int getPrice(){
        return price;

    }
    public int getSize(){
        return  size;

    }
    public String getName (){
        return name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
