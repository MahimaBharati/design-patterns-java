public class RidingService {
    RidingStrategy strategy;
    RidingService(RidingStrategy strategy){
        this.strategy=strategy;
    }
    void matchRide(String location){
        strategy.match(location);
    }
}
