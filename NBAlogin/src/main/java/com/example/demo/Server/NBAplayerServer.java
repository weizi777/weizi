package com.example.demo.Server;

import com.example.demo.Bean.NBAplayer_return;

import java.util.List;

public interface NBAplayerServer {
    List<NBAplayer_return> NBAplayer_Select(String country);
}
