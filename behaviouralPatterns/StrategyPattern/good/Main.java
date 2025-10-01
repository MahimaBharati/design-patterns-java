public class Main {
    public static void main(String[] args){
        RidingService service=new RidingService(new AirportQueue());
        service.matchRide("M.G.Road");
        RidingService service2=new RidingService(new Nearest());
        service2.matchRide("Lalbagh Gardens");
        RidingService service3=new RidingService(new Surge());
        service3.matchRide("Lalbagh Gardens");
    }
}
