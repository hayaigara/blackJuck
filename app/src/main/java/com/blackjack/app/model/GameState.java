package com.blackjack.app.model;

import java.io.Serializable;

/**
 * ブラックジャックのゲーム状態を表すクラス。
 * プレイヤーとディーラーの手札、山札、ゲーム終了状態、勝敗結果などを一括で管理します。
 *
 * セッションスコープで保持される前提で作られており、
 * 1ゲームごとの状態を保持し、画面遷移しても状態が保持されるようにするためにSerializableを実装しています。
 */
public class GameState implements Serializable {
    // 山札（ゲーム開始時に52枚のカードがシャッフルされて格納される）
    private final Deck deck = new Deck();

    // プレイヤーの手札（最初に2枚配られる）
    private final Hand playerHand = new Hand();

    // ディーラーの手札（最初は1枚だけ配られる）
    private final Hand dealerHand = new Hand();

    // ゲームが終了したかどうかを示すフラグ（true なら勝敗が決している）
    private boolean gameOver = false;

    // ゲームの結果を格納（例："You win!", "You lose.", "Draw." など）
    private String result = "";


    /**
     * ゲーム開始時の状態を初期化するコンストラクタ。
     * プレイヤーには2枚、ディーラーには1枚のカードが自動で配られます。
     */
    public GameState() {
        // プレイヤー1枚目追加
        playerHand.addCard(deck.drawCard());
        // プレイヤー2枚目追加

        // ディーラー1枚目追加

    }

    /**
     * 現在の山札を取得します
     *
     * @return
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * プレイヤーの手札を取得します
     *
     * @return
     */
    public Hand getPlayerHand() {
        return playerHand;
    }

    /**
     * ディーラーの手札を取得します
     *
     * @return
     */
    public Hand getDealerHand() {
        return dealerHand;
    }

    /**
     * ゲームが終了しているかどうかを返します
     *
     * @return
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     * ゲームの終了状態を設定します
     *
     * @param gameOver
     */
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    /**
     * 勝敗結果のメッセージを取得します（例："You win!"）
     *
     * @return
     */
    public String getResult() {
        return result;
    }

    /**
     * 勝敗結果のメッセージを設定します
     *
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }
}
