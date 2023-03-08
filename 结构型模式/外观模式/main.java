package 结构型模式.外观模式;

import 结构型模式.外观模式.facade.VideoConversionFacade;

import java.io.File;

public class main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
