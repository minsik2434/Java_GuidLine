package class_interface.abstract_vs_interface;

import java.applet.AudioClip;

public interface SingerSongwriter extends Singer, SongWriter{
    AudioClip strum();
    void actSensitive();
}
