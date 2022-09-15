package Challenge;

public class MarsUtils {
    public void rotateLeft( Rovers rovers){
        String compassDirection = rovers.getCompassDirection();
        if (compassDirection.equals("N")){
            rovers.setCompassDirection("W");
        }else if (compassDirection == "E"){
            rovers.setCompassDirection("N");
        }else if (compassDirection == "S"){
            rovers.setCompassDirection("E");
        }else if (compassDirection == "W"){
            rovers.setCompassDirection("S");
        }

    }
    public void rotateRight( Rovers rovers) {
        String compassDirection = rovers.getCompassDirection();
        if (compassDirection.equals("N")) {
            rovers.setCompassDirection("E");
        } else if (compassDirection.equals("E")) {
            rovers.setCompassDirection("S");
        } else if (compassDirection.equals("S")) {
            rovers.setCompassDirection("W");
        } else if (compassDirection.equals("W")) {
            rovers.setCompassDirection("N");
        }
    }

    public void moveForward(Rovers rovers){
        if (rovers.getCompassDirection().equals("N")){
            rovers.setyPosition(rovers.getyPosition()+1);
        }else if (rovers.getCompassDirection().equals("E")){
            rovers.setxPosition(rovers.getxPosition()+1);
        }else if (rovers.getCompassDirection().equals("S")){
            rovers.setyPosition(rovers.getyPosition()-1);
        }else if (rovers.getCompassDirection().equals("W")){
            rovers.setxPosition(rovers.getxPosition()-1);
        }
    }
}
