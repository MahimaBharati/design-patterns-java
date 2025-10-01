public class RidingService {
    void matchRider(String location, String matchingType) {
        if(matchingType.equals("AIRPORT_QUEUE")){
            System.out.println("Matching the rider for location "+location+" prioritizing airport queue.");
        } else if(matchingType.equals("NEAREST")) {
            System.out.println("Matching the rider for location "+location+" prioritizing nearest customer.");
        } else if(matchingType.equals("SURGE")) {
            System.out.println("Matching the rider for location "+location+" prioritizing surge locations.");
        } else{
            System.out.println("Strategy type "+matchingType+" doesn't exist.");
        }
    }
}
