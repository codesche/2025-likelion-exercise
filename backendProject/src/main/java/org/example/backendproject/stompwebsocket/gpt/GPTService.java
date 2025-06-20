package org.example.backendproject.stompwebsocket.gpt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GPTService {

    // json 문자열 <-> 자바객체, json객체
    private final ObjectMapper mapper = new ObjectMapper();

    @Value("${openai.api.key}")
    private String apiKey;

    public String gptMessage(String message) throws Exception {
        try {
            Map<String, Object> requestBody = new HashMap<>();
            requestBody.put("model", "gpt-4o");
            requestBody.put("input", message);

            // http 요청 작성
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openai.com/v1/responses"))
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(requestBody)))
                .build();

            //요청 전송 및 응답 수신
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                log.error("GPT API 호출 실패: " + response.statusCode() + " - " + response.body());
                return "[GPT 호출 실패] 응답 코드 : " + response.statusCode();
            }

            // 응답을 Json으로 파싱
            JsonNode jsonNode = mapper.readTree(response.body());
            System.out.println("gpt 응답 : " + jsonNode);
            log.info("gpt 응답 성공!!");

            //메세지 부분만 추출하여 반환
            String gptMessageResponse = jsonNode.get("output").get(0).get("content").get(0).get("text").asText();
            return gptMessageResponse;

        } catch (IOException e) {
            log.error("GPT 응답 JSON 파싱 실패: " + e.getMessage());
            return "[GPT 오류] 응답을 처리할 수 없습니다.";
        } catch (IllegalArgumentException e) {
            log.error("응답 파싱 오류: " + e.getMessage());
            return e.getMessage();
        } catch (Exception e) {
            log.error("예상치 못한 오류 발생: " + e.getMessage());
            return "[GPT 오류] 예기치 못한 문제가 발생했습니다.";
        }



    }

}
