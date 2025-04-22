package com.blackjack.app.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * デッキ（トランプの山札）を表すクラス。
 * カード52枚（スート×ランク）を生成し、シャッフルして保持します。
 * ゲーム中にカードを1枚ずつ引くためのメソッドも用意されています。
 */
public class Deck {
    // ゲーム中に使用するカードのリスト（山札）
    private final List<Card> cards = new ArrayList<>();

    /**
     * コンストラクタでデッキを初期化。
     * 各スート・ランクのカードを生成し、山札に追加した後、シャッフルします。
     */
    public Deck() {
        // トランプの4つのスート（絵柄）
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // トランプのランク（数字や絵札）
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        /** 各ランクに対応するカードの数値（ブラックジャック用） */
        /** 絵札（J, Q, K）は10点、Aは11点（Aの値の扱いはHandクラス側で調整） */
        /** Map.entry(トランプのランク, 点数)の組み合わせ */

        // Map<String, Integer> values = Map.ofEntries(Map.entry("2", 2), Map.entry("3", 3), ....そのほかのカードも対応させる);


        //** 全ての組み合わせ（スート × ランク）を生成し、カードとして山札に追加 */
        // ４つのスートでループ
            // トランプのランクでループ
                // cards.add(model.Card.javaのクラスを作って追加していく));

        // シャッフルする
        Collections.shuffle(cards);
    }

    /**
     * 山札の先頭からカードを1枚引く。
     * 引いたカードは山札から取り除かれます。
     *
     * @return 引かれたカード
     */
    public Card drawCard() {
        // 先頭のカードを取得してリストから削除、取得したカードをリターンする

    }
}
