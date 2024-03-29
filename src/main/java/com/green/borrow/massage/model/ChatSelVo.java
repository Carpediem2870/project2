package com.green.borrow.massage.model;

import lombok.Data;

@Data
public class ChatSelVo {
    private int ichat; // 채팅방 PK
    private String lastMsg; // 최근 메세지 내용
    private String lastMsgAt; // 최근 메세지 발송시간
    private int otherPersonIuser; // 상대방 유저 PK
    private String otherPersonNm; // 상대방 유저 이름
    private String otherPersonPic; // 상대방 유저 사진
}
