package com.blackjack.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blackjack.app.model.GameState;
import com.blackjack.app.service.BlackjackService;

import jakarta.servlet.http.HttpSession;



@Controller
@RequestMapping("/blackjack")
public class BlackjackController {
    // BlackjackService の DI(Dependency Injection) する
    private BlackjackService blackjackService;

    @GetMapping("/start")
    public String startGame(HttpSession session, Model model) {
        // BlackjackService の startGame() メソッドを呼ぶ
        GameState state = blackjackService.startGame();

        // セッションに state保存
        session.setAttribute("game", state);

        // モデルを設定(HTMLで使うデータ)
        model.addAttribute("state", state);

        // HTML の名前をリターンする
        return "game";
    }

    @PostMapping("/hit")
    public String hit(HttpSession session, Model model) {
        // セッションから state を取得
        GameState state = (GameState) session.getAttribute("game");

        // BlackjackService の hit(state) メソッドを実行

        // セッションに保存

        /** state の isGameOver()メソッドでゲームオーバーか判定 */
        // ゲームオーバーなら

            // モデルのセット

            // HTML の名前をリターンする

            // return "result";


        /** ゲームオーバーではない */
        // モデルのセット

        // HTML の名前をリターンする
        return "game";
    }

    @PostMapping("/stand")
    public String stand(HttpSession session, Model model) {
        // セッションから state を取得

        // BlackjackService の stand(state) メソッドを実行

        // HTML で使うデータ（モデル）を設定

        // HTML の名前をリターンする
        return "result";
    }

}
