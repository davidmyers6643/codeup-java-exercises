package abstractLEC.building;

public interface ClimateControllable {

    final int MAX_SAFE_HUMAN_TEMP = 108;
    void adjustHeating();
    void adjustInsulation();

}
