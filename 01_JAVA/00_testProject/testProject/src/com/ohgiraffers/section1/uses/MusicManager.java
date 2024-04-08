package com.ohgiraffers.section1.uses;

import java.util.ArrayList;
import java.util.List;

public class MusicManager {
    private List<MusicDTO> musicList = new ArrayList<>();

    public void addList(MusicDTO music){
        musicList.add(music);
    }
    public List<MusicDTO> selectList(){
        return musicList;
    }
    public List<MusicDTO> searchArtist(String artist) {
        List<MusicDTO> searchList = new ArrayList<>();

        for (MusicDTO music : musicList){
            if (music.getArtist().contains(artist)){
                searchList.add(music);
            }
        }
        return searchList;
    }
    public List<MusicDTO> searchTitle(String title) {

        List<MusicDTO> searchList = new ArrayList<>();

        for(MusicDTO music : musicList) {
            if(music.getTitle().contains(title)) {
                searchList.add(music);
            }
        }

        return searchList;
    }

    public boolean updateMusic(MusicDTO updateMusic){



    }


}
