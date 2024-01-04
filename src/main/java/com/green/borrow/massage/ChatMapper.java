package com.green.borrow.massage;

import com.green.borrow.massage.model.ChatInsDto;
import com.green.borrow.massage.model.ChatSelDto;
import com.green.borrow.massage.model.ChatSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {
    int insChat(ChatInsDto dto);

    List<ChatSelVo> selChatAll(ChatSelDto dto);

}
