package Practice_08_18_2021.inheritance.appTask;

public class MobileApp {
    private String name;
    private String version;

    public MobileApp(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void useTheApp(int minutes){

        System.out.println("Using "+name+" app for "+ minutes+" minutes");

    }

    public void download(){

        System.out.println("App "+name+" version "+ version+" is downloaded");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }


}
