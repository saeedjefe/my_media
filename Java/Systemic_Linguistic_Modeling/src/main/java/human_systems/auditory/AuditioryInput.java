package human_systems.auditory;

import systems_thinking.Input;

public class AuditioryInput extends Input {
    public AuditioryInput(String name) {
        super(name);
    }

    enum sound_features{
        amplitude,
        pitch,
        wave_form,
        phase
    }
}
