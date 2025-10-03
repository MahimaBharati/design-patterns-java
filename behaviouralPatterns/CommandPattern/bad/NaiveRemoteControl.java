class NaiveRemoteControl{
    Light light;
    AC ac;
    String lastAction;
    public NaiveRemoteControl(Light light,AC ac){
        this.light=light;
        this.ac=ac;
    }
    public void pressLightOn(){
        light.on();
        lastAction="Light_ON";
    }
    public void pressLightOff(){
        light.off();
        lastAction="Light_OFF";
    }
    public void pressACOn(){
        ac.on();
        lastAction="AC_ON";
    }
    public void pressACOff(){
        ac.off();
        lastAction="AC_OFF";
    }
    public void pressUndo(){
        switch(lastAction) {
            case "Light_ON":
                light.off();
                lastAction="Light_OFF";
                break;
            case "Light_OFF":
                light.on();
                lastAction="Light_ON";
                break;
            case "AC_ON":
                ac.off();
                lastAction="AC_OFF";
                break;
            case "AC_OFF":
                ac.on();
                lastAction="AC_ON";
                break;
            default:
                System.out.println("No action to undo!");
        }

    }
}