package com.blackjack.app.model;

/**
 * トランプのカード1枚を表すクラス。
 * スート（絵柄）、ランク（数字・絵札）、値（ブラックジャックでの点数）を持ちます。
 */
public class Card {
    // スート（絵柄）例：Hearts, Diamonds, Clubs, Spades
    private final String suit;

    // ランク（数字または絵札）例：2〜10, J, Q, K, A
    private final String rank;

    // カードの点数（ブラックジャック用） 例：J, Q, K → 10点、A → 11点（初期値）
    private final int value;

    /**
     * カードを生成するコンストラクタ。
     *
     * @param suit  スート（絵柄）
     * @param rank  ランク（数字や絵札）
     * @param value 点数（ブラックジャックにおける数値）
     */
    public Card(String suit, String rank, int value) {
        // suit をクラス変数に代入
        this.suit = suit;
        // rank, value もクラス変数に代入
    }

    /**
     * ブラックジャックで使用するカードの数値を取得。
     * 例：J, Q, K → 10点、A → 11点（最初は11点として扱う）
     *
     * @return カードの点数
     */
    public int getValue() {
        // 点数をリターンする

    }

    /**
     * カードの表示用文字列を取得。
     * 例："A of Spades", "10 of Hearts"
     *
     * @return 人が読める形式のカード名
     */
    public String getDisplay() {
        // 例と同じような形式の文字列をリターンする

    }
}
