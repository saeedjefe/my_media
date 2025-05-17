package systemic_linguistic_modeling;



public interface States {

    // === Enum defining valid states for the system ===
    enum SystemState {
        STABLE,
        UNSTABLE,
        GROWING,
        DECLINING,
        EMERGENCY,
        NORMAL,
        RESILIENT,
        FRAGILE,
        ADAPTIVE,
        RIGID
    }

    // Method to set and get current system state
    void setState(SystemState state);
    SystemState getState();
}
