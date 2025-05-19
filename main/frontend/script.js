document.getElementById("loginForm").addEventListener("submit", function(e) {
  e.preventDefault(); // フォーム送信を止める

  const username = document.getElementById("username").value.trim();
  const password = document.getElementById("password").value.trim();
  const message = document.getElementById("message");

  if (username === "" || password === "") {
    message.textContent = "ユーザー名またはパスワードが未入力です。";
    message.style.color = "red";
  } else {
    // ※実際のログイン認証は行っていない
    message.textContent = "ログイン処理を開始します。";
    message.style.color = "green";

    // 実際の処理がある場合はここでサーバー通信を行う
  }
});
