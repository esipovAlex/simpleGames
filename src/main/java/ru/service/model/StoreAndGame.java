package ru.service.model;

import ru.service.games.Game;
import ru.service.store.StoreResult;

import java.util.Map;

public record StoreAndGame(StoreResult storeResult, Map<GameNames, Game> gameMap) {

    public Game getGame(GameNames name) {
        return gameMap.get(name);
    }
}
