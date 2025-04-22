package com.blackjack.app.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blackjack.app.model.GameState;
import com.blackjack.app.service.BlackjackService;

import lombok.RequiredArgsConstructor;

/**
 * ブラックジャックのゲームロジックを提供するサービスクラス。
 * コントローラーから呼び出され、GameState を操作してプレイヤーの操作（ヒット、スタンド）に応じた処理を行う。
 *
 * DBは使わず、GameState をセッションや一時的なスコープで保持することで状態を管理する。
 */
@Service
@Transactional
@RequiredArgsConstructor
public class BlackjackServiceImpl implements BlackjackService {
    /**
     * 新しいゲームを開始し、GameState（初期手札と山札を持つ）を返す。
     * GameState のコンストラクタ内で初期化されるため、ここでは単純にインスタンスを生成して返すだけ。
     *
     * @return 新しいゲーム状態
     */
    @Override
    public GameState startGame(){
        // GameStateクラスを返すのみ
        return new GameState();
    };

    /**
     * プレイヤーが「ヒット」（カードを1枚引く）操作を行ったときの処理。
     * 山札から1枚引いてプレイヤーの手札に追加。
     * その後、スコアが21を超えていれば「バースト」とみなして敗北扱いにする。
     *
     * @param state 現在のゲーム状態
     */
    public void hit(GameState state) {
        // プレイヤーに1枚カードを配る

        // 合計スコアが21を超えたらバースト（負け）

            // 結果をセット（stateのメソッドを使う、メッセージに「あなたの負けです」を入れる）

            // ゲーム終了メソッドを実行（stateのメソッドを使う、trueをセット）

    };

    /**
     * プレイヤーが「スタンド」（これ以上カードを引かない）操作を行ったときの処理。
     * ディーラーは合計スコアが17以上になるまでカードを引く。
     * 最終的なスコアに基づき勝敗を判定し、ゲームを終了させる。
     *
     * @param state 現在のゲーム状態
     */
    public void stand(GameState state) {
        // ディーラーは合計スコアが17未満の場合のみカードを引き続ける
        while (state のディーラーハンドからスコアを取得して 17より小さいことを判定) {
            state.getDealerHand().addCard(state.getDeck().drawCard());
        }

        // プレイヤーのスコア
        int player = stateからプレイヤーのスコアを取得
        // ディーラーのスコア
        int dealer = stateからディーラーのスコアを取得

        /** 勝敗判定（バーストやスコアの比較） */
        // ディーラーが 21より大きい もしくは プレイヤーの方がディーラーより大きい場合

            // プレイヤーの勝利結果メッセージをセット（「あなたの勝ちです」を入れる）

        // プレイヤーよりディーラーが大きい

            // ディーラーの勝利結果メッセージをセット（「ディーラーの勝ちです」を入れる）

        // それ以外

            // 引き分け結果のメッセージをセット


        // ゲームを終了させる
        state.setGameOver(true);
    };
}
