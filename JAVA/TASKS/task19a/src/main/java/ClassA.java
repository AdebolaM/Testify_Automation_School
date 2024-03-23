public class ClassA {
    private final String ballSize = "8inches"; 
    private String ballColour;
    private String ballTexture;

    public void Ball (String ballSize, String ballColour, String ballTexture) {
        //this.ballSize = ballSize;
        this.ballColour = ballColour;
        this.ballTexture = ballTexture;
    }

    
    public String getBallColour() {
        return ballColour;
    }

    public String getBallTexture() {
        return ballTexture;
    }
}
