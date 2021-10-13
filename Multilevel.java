class Room{
    int length,breadth;
    Room(int x ,int y){
        length = x;
        breadth =y;
    }
    int Area(){
        return (length*breadth);
    }
}
class Bedroom extends Room{
    int height;
    Bedroom(int x, int y, int z){
        super(x,y);
        height=z;
    }
    int volume(){
        return ( length*breadth*height);
    }
}
class Hall extends Bedroom{
    Hall(int x,int y, int z){
        super(x,y,z);
    }
    int volume2(){
        return ( length*breadth*height);
    }
}
class Multilevel{
    public static void main(String[] args) {
        Hall room1 = new Hall(14,12,10);
        int area1 = room1.Area();
        int volume1 = room1.volume();
        int volume2 = room1.volume2();
        System.out.println("Area1 = "+area1);
        System.out.println("volume1 = "+volume1);
        System.out.println("volume2 = "+volume2);
    }
}