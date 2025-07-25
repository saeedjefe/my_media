package layer_one;



public interface  States {



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

    public void implementStates(SystemState systemState);


    // Method to set and get current system stat
}
