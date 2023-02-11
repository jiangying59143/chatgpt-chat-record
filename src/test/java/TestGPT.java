import com.github.plexpt.chatgpt.Chatbot;

import java.util.Map;

public class TestGPT {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot("fd764501651c254ef001c3ad3f60c3b992c4fbde755c6518e93131633894268a%7C1bfce08016b54931caa1a86f516211b2ccfde6dc59f96f8a0448a1f0cef21dce",
                "6NJbxJt2jjDUdA6OWatixVXrrRjKJvVwxcf4xJYpIKU-1675934706-0-1-e4b4c612.1eed3644.b3b599f2-160",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.96 Safari/537.36");
        Map<String, Object> chatResponse = chatbot.getChatResponse("java bubble sort");
        System.out.println(chatResponse.get("message"));
    }
}
