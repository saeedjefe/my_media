package human_systems.nervous.auditory;

import superordinates.Sound;

import java.util.EnumMap;
import java.util.Map;

public class AuditoryInput  {

    Sound sound;
    public AuditoryInput(String name) {


    }

    public static void setAuditoryInput(){
        Map<Sound.FEATURES, Object> soundValues =new EnumMap<>(Sound.FEATURES.class);
        soundValues.put(Sound.FEATURES.AMPLITUDE, "24db");
        soundValues.put(Sound.FEATURES.PITCH, "5hz");
        soundValues.put(Sound.FEATURES.PHASE,"");
        soundValues.put(Sound.FEATURES.FORM,"sin");
        System.out.println(soundValues);
    }


}
