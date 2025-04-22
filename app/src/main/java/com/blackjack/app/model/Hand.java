package com.blackjack.app.model;

import java.util.ArrayList;
import java.util.List;

/**
 * プレイヤーやディーラーが持っている「手札」を表すクラス。
 * カードを追加したり、合計点数を計算したり、表示用の文字列を取得する機能を提供します。
 */
public class Hand {
    // この手札が保持するカードのリスト（順番は関係ない）
    private final List<Card> cards = new ArrayList<>();

    /**
     * カードを手札に追加します。
     *
     * @param card 追加するカード（プレイヤーやディーラーが引いたカード）
     */
    public void addCard(Card card) {
        // カードのリストに cardを追加

    }

    /**
     * 現在の手札の合計点数を計算して返します。
     * A（エース）は最初は11点として数えますが、
     * 合計が21を超える場合、1点として数えるよう調整します（ブラックジャック特有のルール）。
     *
     * @return 合計点数（Aの点数調整含む）
     */
    public int getScore() {
        // カードの値をすべて合計する
        int score = カードの値の合計

        // A(11点のカード)の枚数を数える
        long aceCount = Aの枚数

        while (スコアが 21より大きい && Aをマイナス1した数が 0より大きい) {
            // スコアから10マイナスする
        }

        // スコアをリターンする
    }

    /**
     * 手札のカードを人間が読める形式でリストとして返します。
     * 例：["10 of Hearts", "A of Spades"]
     *
     * @return 各カードの説明（表示用文字列）のリスト
     */
    public List<String> getCardDescriptions() {
        // Cardクラスの getDisplayメソッドを cardsリストのすべてに適用して、配列にしてリターンする

    }
}
