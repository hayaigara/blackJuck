package com.blackjack.app.service;

import com.blackjack.app.model.GameState;

/**
 * Blackjackサービスのインタフェース
 */
public interface BlackjackService {
    /**
     * スタート
     *
     * @return
     */
    GameState startGame();

    /**
     * ヒット
     */
    void hit(GameState state);

    /**
     * ステート
     *
     * @param state
     */
    void stand(GameState state);
}
