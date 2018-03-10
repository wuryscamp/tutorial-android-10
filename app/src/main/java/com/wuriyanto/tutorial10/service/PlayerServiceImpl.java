package com.wuriyanto.tutorial10.service;

import com.wuriyanto.tutorial10.model.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wurianto on 3/10/18.
 */

public class PlayerServiceImpl implements PlayerService {

    @Override
    public List<Player> getPlayers() {

        List<Player> players = new ArrayList<>();
        players.add(new Player("Eden Hazard", "Winger", "Belgium"));
        players.add(new Player("Willian Borges", "Winger", "Brazil"));
        players.add(new Player("Pedro Rodriguez", "Central Forward", "Spain"));
        players.add(new Player("Cesc Fabregas", "Midfielder", "Spain"));
        players.add(new Player("David Luiz", "Central Defender", "Brazil"));

        return players;
    }
}
